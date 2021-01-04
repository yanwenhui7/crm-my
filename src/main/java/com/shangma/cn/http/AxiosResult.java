package com.shangma.cn.http;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * @author JAVASM
 */
@Data
//转json的时候只转值不为null的
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AxiosResult<T> {

    private int status;
    private String message;
    private T data;

    private AxiosResult() {
    }

    /**
     * 成功返回的方法
     * @param <T>
     * @return
     */
    public static <T> AxiosResult<T> success(){
        return setData(AxiosStatus.OK, null);
    }

    /**
     * 成功返回带数据
     * @param data
     * @param <T>
     * @return
     */
    public static <T> AxiosResult<T> success(T data){
        return setData(AxiosStatus.OK, data);
    }

    /**
     * 成功返回自定义状态码没有数据
     * @param axiosStatus
     * @param <T>
     * @return
     */
    public static <T> AxiosResult<T> success(AxiosStatus axiosStatus){
        return setData(axiosStatus,null);
    }

    /**
     * 成功返回自定义状态码有数据
     * @param axiosStatus
     * @param data
     * @param <T>
     * @return
     */
    public static <T> AxiosResult<T> success(AxiosStatus axiosStatus,T data){
        return setData(axiosStatus,data);
    }

    /**
     * 错误的返回
     * @param <T>
     * @return
     */
    public static <T> AxiosResult<T> error(){
        return setData(AxiosStatus.ERROR,null);
    }

    /**
     * 错误返回带自定义状态码
     * @param axiosStatus
     * @param <T>
     * @return
     */
    public static <T> AxiosResult<T> error(AxiosStatus axiosStatus){
        return setData(axiosStatus,null);
    }

    /**
     * 错误返回携带数据
     * @param data
     * @param <T>
     * @return
     */
    public static <T> AxiosResult<T> error(T data){
        return setData(AxiosStatus.ERROR,data);
    }

    /**
     * 错误返回自定义状态码并携带数据
     * @param axiosStatus
     * @param data
     * @param <T>
     * @return
     */
    public static <T> AxiosResult<T> error(AxiosStatus axiosStatus,T data){
        return setData(axiosStatus,data);
    }
    /**
     * 封装数据公共方法
     * @param axiosStatus
     * @param data
     * @param <T>
     * @return
     */
    private static <T> AxiosResult<T> setData(AxiosStatus axiosStatus,T data){
        AxiosResult<T> axiosResult = new AxiosResult<>();
        axiosResult.setData(data);
        axiosResult.setStatus(axiosStatus.getStatus());
        axiosResult.setMessage(axiosStatus.getMessage());
        return axiosResult;
    }
}
