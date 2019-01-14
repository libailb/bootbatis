package libai.sm.bootbatis.mitest;

/**
 * GMS通用error code
 *
 * @author qiyu
 * @date 2018-12-25 18:38
 */
public enum ErrorCode {

    // system
    SUCCESS(0, "ok"),
    SYSTEM_ERROR(400000, "系统错误"),
    PARAM_ERROR(400001, "参数非法"),
    USER_AUTH_ERROR(400002, "当前用户无此操作权限"),
    NOT_LOGIN(400003, "需要登录"),

    // 填写企业信息
    MERCHANT_INFO_HAS_SUBMITED(400100, "已经提交过"),
    MERCHANT_INFO_HAS_NOT_SAVE(400101, "企业信息还没有保存"),

    // 文件相关
    FILE_UPLOAD_IS_EMPTY(400200, "请选择图片文件"),

    //品牌相关
    MANAGEMENT_TYPE_ERROR(400300,"请选择代理品牌"),
    PROXY_LEVEL_ERROR(400301,"代理等级不匹配"),



    ;

    private int key;
    private String value;
    public int getKey() {
        return key;
    }
    public String getValue() {
        return value;
    }
    ErrorCode(int key, String value) {
        this.key = key;
        this.value = value;
    }
}
