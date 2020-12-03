package com.ly.testt;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 11/25/20
 */
public class Generic <T extends Cloneable & List & Serializable>{
    private T data;
    private int code;
    private String msg;

    public Generic(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    static void setMethod(List<String>data){

    }
    static void setMethod(List<Integer>data,int a){

    }

    @Override
    public String toString() {
        return "Generic{" +
                "data=" + data +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
