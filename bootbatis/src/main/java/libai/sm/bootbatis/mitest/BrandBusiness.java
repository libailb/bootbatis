package libai.sm.bootbatis.mitest;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
@Service
public class BrandBusiness {
    public AjaxResp saveMerchantBrand(String merchantId,SaveMerchantBrandInfoParams params){
        MerchantBrandEntity merchantBrandEntity=new MerchantBrandEntity();
            merchantBrandEntity.setMerchantId(merchantId);
            merchantBrandEntity.setBrandType(params.getBrandType());
            merchantBrandEntity.setManagementType(params.getManagementType());
            merchantBrandEntity.setBrandCategory(params.getBrandCategory());
            merchantBrandEntity.setBrandMainProduct(params.getBrandMainProduct());
            merchantBrandEntity.setMainProductImg(params.getMainProductImg());
            merchantBrandEntity.setMainProductSellingPoint(params.getMainProductSellingPoint());
            merchantBrandEntity.setBrandCustomerMinAge(params.getBrandCustomerMinAge());
            merchantBrandEntity.setBrandCustomerMaxAge(params.getBrandCustomerMaxAge());
            merchantBrandEntity.setBrandPatent(params.getBrandPatent());
            merchantBrandEntity.setThirdPartyPlatformSalesCertificate(params.getThirdPartyPlatformSalesCertificate());
            merchantBrandEntity.setBrandAnnualTotalConsumption(params.getBrandAnnualTotalConsumption());
            merchantBrandEntity.setProxyLevel(params.getProxyLevel());
            merchantBrandEntity.setProxyInfos(params.getProxyInfos());
            merchantBrandEntity.setCreateTime(System.currentTimeMillis()/1000);
            HashMap<String,Object> returnData=new HashMap<>();
            returnData.put("merchantBrand_info",merchantBrandEntity);
            return AjaxResp.success(returnData);


    }



}
