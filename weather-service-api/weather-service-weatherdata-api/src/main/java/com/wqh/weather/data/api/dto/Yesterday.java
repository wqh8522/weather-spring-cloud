package com.wqh.weather.data.api.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wanqh
 * @date 2018/01/31 11:09
 * @description:
 */
@Data
public class Yesterday  implements Serializable{

    /**
     * 日期
     */
    private String date;
    /**
     * 最高气温
     */
    private String high;
    /**
     * 风向
     */
    private String fx;
    /**
     * 最低气温
     */
    private String low;
    /**
     * 风力
     */
    private String fl;
    /**
     * 天气
     */
    private String type;
}
