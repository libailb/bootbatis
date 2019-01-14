package libai.sm.bootbatis.mitest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
public class MerchantBrandController {
    private static final Logger LOGGER = LoggerFactory.getLogger(MerchantBrandController.class);
    @Autowired
    private BrandBusiness brandBusiness;


  @PostMapping("/saveMerchantBrand")
    public AjaxResp saveMerchantBrandInfo(@RequestBody @Validated SaveMerchantBrandInfoParams params, BindingResult bindingResult){
      if(bindingResult.hasErrors()){
          Map<String, String> errorMap = new HashMap<>();
          for (FieldError fieldError : bindingResult.getFieldErrors()) {
              errorMap.put(fieldError.getField(), fieldError.getDefaultMessage());
          }
          Map<String, Object> returnData = new HashMap<>();
          returnData.put("fields", errorMap);
          return AjaxResp.error(ErrorCode.PARAM_ERROR, returnData);
      }
        //逻辑代码进行数据校验
        //1.总的判断是否是代理品牌
       if(params.getManagementType().equals("2")){
           //取出代理等级：
           if(!params.getProxyLevel().matches("^(1|2|3|4|5)$")||params.getProxyInfos()==null||params.getProxyInfos().size()==0){
               return AjaxResp.error(ErrorCode.PARAM_ERROR,params);
           }
           if(!isValidPageInfos(params.getProxyInfos(),Integer.parseInt(params.getProxyLevel()))){
               return AjaxResp.error(ErrorCode.PARAM_ERROR,params);
           }
           try {
               return brandBusiness.saveMerchantBrand("10", params);
           }catch (Exception e){
               LOGGER.error(e.getMessage());
               return AjaxResp.error(ErrorCode.SYSTEM_ERROR,params);
           }
       }else if(params.getManagementType().equals("1")){
           params.setProxyLevel(null);
           params.setProxyInfos(null);
           try {
               return brandBusiness.saveMerchantBrand("10", params);
           }catch (Exception e){
               LOGGER.error(e.getMessage());
               return AjaxResp.error(ErrorCode.SYSTEM_ERROR,params);
           }
       }
       else {
            return AjaxResp.error(ErrorCode.MANAGEMENT_TYPE_ERROR,params);
       }



    }
    //判断日期格式和日期对照 end>start
    private boolean isValidDateRange(String start, String end) {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA);
        format.setLenient(false);
        try {
            Date startDate = format.parse(start);
            Date endDate = format.parse(end);
            return startDate.before(endDate);
        } catch (ParseException e) {
            return false;
        }
    }

    //判断pageInfos
    public boolean isValidPageInfos(List<ProxyInfo> proxyInfos,int proxyLevel){
        if(proxyInfos.size()!=proxyLevel){
            return false;
        }else{
            for(int i=0;i<proxyInfos.size();i++){
                ProxyInfo proxyInfo=proxyInfos.get(i);
                if(Integer.parseInt(proxyInfo.getLevel())!=i+1){
                    return false;
                }else {
                    if(!isValidDateRange(proxyInfo.getStartDate(),proxyInfo.getEndDate())){
                        return false;
                    }else{
                        if(!proxyInfo.getObjectId().matches( "^[a-zA-Z0-9]+.[a-zA-Z0-9]+$")){
                            return  false;
                        }
                    }
                }
            }
        }
        return true;
    }

}
