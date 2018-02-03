package com.wqh.weatherreport.service;

import com.wqh.weather.data.api.dto.Weather;

/**
 * @author wanqh
 * @date 2018/02/02 14:35
 * @description:
 */
public interface WeatherReportService {

    /**
     * 根据城市id查询天气
     * @param cityId
     * @return
     */
    Weather getDataByCityId(String cityId);

}
