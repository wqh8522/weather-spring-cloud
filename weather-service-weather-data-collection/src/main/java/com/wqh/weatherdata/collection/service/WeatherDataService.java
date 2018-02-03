package com.wqh.weatherdata.collection.service;


/**
 * @author wanqh
 * @date 2018/01/31 11:20
 * @description: 天气数据接口
 */
public interface WeatherDataService {

    /**
     * 同步天气数据到redis
     * @param cityId
     */
    void syncDateByCityId(String cityId);
}
