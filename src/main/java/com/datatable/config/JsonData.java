package com.datatable.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author tangzhiqian
 * @create 2021-04-05 19:07
 * @description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JsonData {
    private int code;

    private String msg;

    private long count;

    private Object data;

    public static JsonData success(long count,Object data){
        return new JsonData(0,null,count,data);
    }
}
