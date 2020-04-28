package com.qianfeng.market.pojo.dto;

import lombok.Data;

/**
 * @author bingqiong.cbb
 * @date 2020-04-28 23:59
 **/
@Data
public class ResponseDTO {
    /**
     * 返回给客户端的信息
     */
    private String msg;
    /**
     * 结果
     */
    private Boolean res;

    /**
     * 数据
     */
    private Object data;


    /**
     * 状态
     */
    private  Integer status = 200;

    /**
     * 错误代码
     */

    private  Integer errcode;

    private ResponseDTO(String msg, Boolean res, Object data, Integer status, Integer errcode) {
        this.msg = msg;
        this.res = res;
        this.data = data;
        this.status = status;
        this.errcode = errcode;
    }

    /**
     * 返回成功信息，只返回成功信息
     * 并且返回data数据
     * @param msg
     * @returnnull
     */
    public static ResponseDTO ok(String msg,Object data){
        return new ResponseDTO(msg,true,data,200,null);
    }
    public static ResponseDTO ok(String msg){
        return new ResponseDTO(msg,true,null,200,null);
    }

    /**
     * 返回错误信息
     * 并且返回data数据
     * @param msg
     * @return
     */
    public static ResponseDTO fail(String msg,Object data,Integer status, Integer errorcode ){
        return new ResponseDTO(msg,false,data,200,errorcode);
    }
    public static ResponseDTO fail(String msg){
        return new ResponseDTO(msg,false,null,null,null);
    }
}
