package libai.sm.bootbatis.mitest;

import java.io.Serializable;

/**
 * 统一返回格式
 *
 * @author: Zhangbo
 * @since: 2018-10-26 14:56
 **/
public class AjaxResp implements Serializable {

    private static final long serialVersionUID = 5899499252385335797L;

    private int code;

    private String msg;

    private Object data;

    public AjaxResp() {
    }

    public AjaxResp(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public AjaxResp(int code, Object data) {
        this.code = code;
        this.data = data;
    }


    public AjaxResp(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }


    public static AjaxResp success() {
        return new AjaxResp(ErrorCode.SUCCESS.getKey(), ErrorCode.SUCCESS.getValue());
    }

    public static AjaxResp success(Object data) {
        return new AjaxResp(ErrorCode.SUCCESS.getKey(), ErrorCode.SUCCESS.getValue(), data);
    }

    public static AjaxResp error(ErrorCode errorCode) {
        return new AjaxResp(errorCode.getKey(), errorCode.getValue());
    }

    public static AjaxResp error(ErrorCode errorCode, Object data) {
        return new AjaxResp(errorCode.getKey(), errorCode.getValue(), data);
    }

    public static AjaxResp error(ErrorCode errorCode, String msg) {
        return new AjaxResp(errorCode.getKey(), msg);
    }

    public static AjaxResp error(ErrorCode errorCode, String msg, Object data) {
        return new AjaxResp(errorCode.getKey(), msg, data);
    }

    public AjaxResp data(Object data) {
        return new AjaxResp(1, data);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "AjaxResp{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
