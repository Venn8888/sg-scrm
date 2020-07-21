package com.sg.common.utils;

import com.sg.common.constants.SgConstants;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author venn
 * @version 1.0.0
 * @date 2020/7/17
 */
@Data
public class SgResponse<T> implements Serializable {

    private static final long serialVersionUID = 8603419496813118207L;

    @ApiModelProperty(value = "返回标记：成功标记=0，失败标记=1")
    private int code;

    @ApiModelProperty(value = "返回信息")
    private String msg;

    @ApiModelProperty(value = "是否正确返回")
    private boolean success;

    @ApiModelProperty(value = "数据")
    private T data;

    public static <T> SgResponse<T> ok() {
        return restResult(null, SgConstants.SUCCESS, null, true);
    }

    public static <T> SgResponse<T> ok(T data) {
        return restResult(data, SgConstants.SUCCESS, null, true);
    }

    public static <T> SgResponse<T> ok(T data, String msg) {
        return restResult(data, SgConstants.SUCCESS, msg, true);
    }

    public static <T> SgResponse<T> failed() {
        return restResult(null, SgConstants.FAIL, null, false);
    }

    public static <T> SgResponse<T> failed(String msg) {
        return restResult(null, SgConstants.FAIL, msg, false);
    }

    public static <T> SgResponse<T> failed(T data) {
        return restResult(data, SgConstants.FAIL, null, false);
    }

    public static <T> SgResponse<T> failed(T data, String msg) {
        return restResult(data, SgConstants.FAIL, msg, false);
    }

    private static <T> SgResponse<T> restResult(T data, int code, String msg, boolean success) {
        SgResponse<T> apiResult = new SgResponse<>();
        apiResult.setCode(code);
        apiResult.setData(data);
        apiResult.setMsg(msg);
        apiResult.setSuccess(success);
        return apiResult;
    }

}
