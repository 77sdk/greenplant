package com.greenplant.utils;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by lenovo on 2020/7/31.
 */
@Data
@Accessors(chain = true)
public class Result {
    private Object data;//数据
    private String token;
    private String message;//提示信息
    private int code;

    public Result() {
    }

    public Result(Object data,String token, String message, int code) {
        this.data = data;
        this.token=token;
        this.message = message;
        this.code = code;
    }
}
