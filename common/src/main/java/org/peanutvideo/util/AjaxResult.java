package org.peanutvideo.util;

import org.peanutvideo.constant.HttpStatus;
import java.util.HashMap;

/**
 * @author ddpapa
 * @date 2020/11/19 23:32
 */

public class AjaxResult extends HashMap<String, Object> {
    /**
     * 状态码
     */
    private static final String CODE_TAG = "code";
    /**
     * 返回的信息
     */
    private static final String MSG_TAG = "msg";
    /**
     * 返回的数据
     */
    private static final String DATA_TAG = "data";
    /**
     * 返回数据处理规则：
     * 1、成功获取到数据，即 success 情况，httpStatus 为 200
     * 2、未成功获取到数据，即 error 情况
     *      （1）
     */

    /**
     * 无参构造：初始化一个无状态的对象
     */
    public AjaxResult(){}

    /**
     *
     * @param code
     * @param msg
     */
    public AjaxResult(int code, String msg){
        put(CODE_TAG, code);
        put(MSG_TAG, msg);
    }

    /**
     *
     * @param code
     * @param msg
     * @param data
     */
    public AjaxResult(int code, String msg, Object data){
        put(CODE_TAG, code);
        put(MSG_TAG, msg);
        if (StringUtils.isNotNull(data)){
            put(DATA_TAG, data);
        }
    }

    /**
     *
     * @return
     */
    public static AjaxResult success() {
        return AjaxResult.success("操作成功");
    }

    /**
     *
     * @param msg
     * @return
     */
    public static AjaxResult success(String msg) {
        return AjaxResult.success(msg,null);
    }

    /**
     *
     * @param data
     * @return
     */
    public static AjaxResult success(Object data) {
        return AjaxResult.success("操作成功", data);
    }

    /**
     *
     * @param msg
     * @param data
     * @return
     */
    public static AjaxResult success(String msg, Object data) {
        return new AjaxResult(HttpStatus.SUCCESS, msg, data);
    }

    /**
     * 2、以下为error情况
     */
    /**
     *
     * @return
     */
    public static AjaxResult error() {
        return AjaxResult.error("操作失败");
    }

    /**
     *
     * @param msg
     * @return
     */
    public static AjaxResult error(String msg) {
        return AjaxResult.error(msg, null);
    }

    /**
     *
     * @param data
     * @return
     */
    public static AjaxResult error(Object data) {
        return AjaxResult.error("操作失败", data);
    }

    /**
     *
     * @param msg
     * @param data
     * @return
     */
    public static AjaxResult error(String msg, Object data) {
        return new AjaxResult(HttpStatus.ERROR, msg, data);
    }

    /**
     *
     * @param code
     * @param msg
     * @return
     */
    public static AjaxResult error(int code, String msg) {
        return new AjaxResult(code, msg);
    }
}
