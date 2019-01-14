package libai.sm.bootbatis.mitest;


import java.util.List;

public class MerchantBrandEntity {
    private String id;
    //品牌id
    private String brandId;

    private String merchantId;

    //品牌类型 1表示国内品牌 2表示国际品牌
    private String brandType;
    //经营类型 1表示自有品牌 2表示代理品牌
    private String managementType;
    //品牌类目 是上一步类目资质中选择的三级分类
    private String brandCategory;
    //品牌主打产品
    private String brandMainProduct;
    //主打产品图片
    private String mainProductImg;
    //主打产品卖点
    private String mainProductSellingPoint;
    //品牌用户年龄段最小年龄
    private String brandCustomerMinAge;
    //品牌用户年龄段最大年龄
    private String brandCustomerMaxAge;
    //品牌专利上传图片
    private String brandPatent;
    //第三方平台售卖证明
    private String thirdPartyPlatformSalesCertificate;
    //品牌年总消费额 单位万 保留两位小数
    private String  brandAnnualTotalConsumption;


    //代理品牌上传信息

    //代理等级 分为1 2 3 4 5 个等级的代理
    private String proxyLevel;
    private List<ProxyInfo> proxyInfos;
    private Long createTime;

    private Long updateTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getBrandType() {
        return brandType;
    }

    public void setBrandType(String brandType) {
        brandType = brandType;
    }

    public String getManagementType() {
        return managementType;
    }

    public void setManagementType(String managementType) {
        this.managementType = managementType;
    }

    public String getBrandCategory() {
        return brandCategory;
    }

    public void setBrandCategory(String brandCategory) {
        this.brandCategory = brandCategory;
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

    public void setBrandAnnualTotalConsumption(String brandAnnualTotalConsumption) {
        this.brandAnnualTotalConsumption = brandAnnualTotalConsumption;
    }

    public String getProxyLevel() {
        return proxyLevel;
    }

    public void setProxyLevel(String proxyLevel) {
        this.proxyLevel = proxyLevel;
    }

    public List<ProxyInfo> getProxyInfos() {
        return proxyInfos;
    }

    public void setProxyInfos(List<ProxyInfo> proxyInfos) {
        this.proxyInfos = proxyInfos;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}
