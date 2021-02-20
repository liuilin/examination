package com.foodsafety.examination.response;

import com.foodsafety.common.response.ResponseHandler;

/**
 * 异常以E开头：E1000
 *
 * @author Administrator
 */
public enum OpenResponseCode implements ResponseHandler {

    ;

    private String code;

    private String description;

    OpenResponseCode(String code, String description) {
        this.code = code;
        this.description = description;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
