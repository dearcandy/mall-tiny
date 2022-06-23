package com.trae.mall.tiny.common.api;

/**
 * 封装API的错误码
 *
 * @author macro
 * @date 2019/4/19
 */
public interface IErrorCode {

    /**
     * 响应码
     * @return 响应码
     */
    long getCode();

    /**
     * 响应信息
     * @return 响应信息
     */
    String getMessage();
}
