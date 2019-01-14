package libai.sm.bootbatis.mitest;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.List;

public class SaveMerchantBrandInfoParams implements Serializable {

    //品牌类型 1表示国内品牌 2表示国际品牌
    @NotBlank(message = "不可为空")
    @Pattern(regexp = "^(1|2)$", message = "格式不正确")
    private String brandType;

    //经营类型 1表示自有品牌 2表示代理品牌
    @NotBlank(message = "不可为空")
    @Pattern(regexp = "^(1|2)$", message = "格式不正确")
    private String managementType;

    //品牌类目 是上一步类目资质中选择的三级分类
    @NotBlank
    private String brandCategory;

    //品牌主打产品
    @NotBlank(message = "不可为空")
    @Length(max = 300, message = "限制输入300个字")
    private String brandMainProduct;

    //主打产品图片
    @NotBlank(message = "不可为空")
    @Pattern(regexp = "^[a-zA-Z0-9]+.[a-zA-Z0-9]+$", message = "资源id格式不正确")
    @Length(max = 128, message = "限制输入120个字")
    private String mainProductImg;

    //主打产品卖点
    @NotBlank(message = "不可为空")
    @Length(max = 500, message = "限制输入500个字")
    private String mainProductSellingPoint;

    //品牌用户年龄段最小年龄
    @NotBlank(message = "不可为空")
    @Min(value = 0, message = "格式不正确")
    @Max(value = 100, message = "格式不正确")
    private String brandCustomerMinAge;

    //品牌用户年龄段最大年龄
    @NotBlank(message = "不可为空")
    @Min(value = 0, message = "格式不正确")
    @Max(value = 100, message = "格式不正确")
    private String brandCustomerMaxAge;

    //品牌专利上传图片
    @NotBlank(message = "不可为空")
    @Pattern(regexp = "^[a-zA-Z0-9]+.[a-zA-Z0-9]+$", message = "资源id格式不正确")
    @Length(max = 128, message = "限制输入120个字")
    private String brandPatent;

    //第三方平台售卖证明
    private String thirdPartyPlatformSalesCertificate;

    //品牌年总消费额 单位万 保留两位小数
    @Pattern(regexp = "^(?!0+(?:\\.0+)?$)(?:[1-9]\\d*|0)(?:\\.\\d{1,2})?$", message = "请输入正确的金额格式")
    private String brandAnnualTotalConsumption;


    //代理品牌上传信息

    //代理等级 分为1 2 3 4 5 个等级的代理 0表示不是代理
//    @NotBlank(message = "不可为空")
//    @Pattern(regexp = "^1|2|3|4|5$", message = "格式不正确")
    private String proxyLevel;
    private List<ProxyInfo> proxyInfos;
    public String getBrandType() {
        return brandType;
    }

    public void setBrandType(String brandType) {
        this.brandType = brandType;
    }

    public String getManagementType() {
        return managementType;
    }

    public List<ProxyInfo> getProxyInfos() {
        return proxyInfos;
    }

    public void setProxyInfos(List<ProxyInfo> proxyInfos) {
        this.proxyInfos = proxyInfos;
    }

    public void setManagementType(String managementType) {
        this.managementType = managementType;
    }

    public String getBrandMainProduct() {
        return brandMainProduct;
    }

    public void setBrandMainProduct(String brandMainProduct) {
        this.brandMainProduct = brandMainProduct;
    }

    public String getMainProductImg() {
        return mainProductImg;
    }

    public void setMainProductImg(String mainProductImg) {
        this.mainProductImg = mainProductImg;
    }

    public String getMainProductSellingPoint() {
        return mainProductSellingPoint;
    }

    public String getBrandCategory() {
        return brandCategory;
    }

    public void setBrandCategory(String brandCategory) {
        this.brandCategory = brandCategory;
    }

    public void setMainProductSellingPoint(String mainProductSellingPoint) {
        this.mainProductSellingPoint = mainProductSellingPoint;
    }

    public String getBrandCustomerMinAge() {
        return brandCustomerMinAge;
    }

    public void setBrandCustomerMinAge(String brandCustomerMinAge) {
        this.brandCustomerMinAge = brandCustomerMinAge;
    }

    public String getBrandCustomerMaxAge() {
        return brandCustomerMaxAge;
    }

    public void setBrandCustomerMaxAge(String brandCustomerMaxAge) {
        this.brandCustomerMaxAge = brandCustomerMaxAge;
    }

    public String getBrandPatent() {
        return brandPatent;
    }

    public void setBrandPatent(String brandPatent) {
        this.brandPatent = brandPatent;
    }

    public String getThirdPartyPlatformSalesCertificate() {
        return thirdPartyPlatformSalesCertificate;
    }

    public void setThirdPartyPlatformSalesCertificate(String thirdPartyPlatformSalesCertificate) {
        this.thirdPartyPlatformSalesCertificate = thirdPartyPlatformSalesCertificate;
    }

    public String getBrandAnnualTotalConsumption() {
        return brandAnnualTotalConsumption;
    }

    public void setBrandAnnualTotalConsumption(String brandAnnualTotalConsunption) {
        this.brandAnnualTotalConsumption = brandAnnualTotalConsunption;
    }

    public String getProxyLevel() {
        return proxyLevel;
    }

    public void setProxyLevel(String proxyLevel) {
        this.proxyLevel = proxyLevel;
    }


}
