package com.wqh.weatherreport.service.impl;

import com.wqh.weather.data.api.dto.Weather;
import com.wqh.weather.data.api.dto.WeatherResponse;
import com.wqh.weatherreport.client.WeatherDataClientService;
import com.wqh.weatherreport.service.WeatherReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wanqh
 * @date 2018/02/02 14:36
 * @description:
 */
@Service
public class WeatherReportServiceImpl implements WeatherReportService{

    @Autowired
    private WeatherDataClientService weatherDataClientService;

    @Override
    public Weather getDataByCityId(String cityId) {
        // 由天气数据API微服务来提供
        WeatherResponse resp = weatherDataClientService.getDataByCityId(cityId);
        Weather data = resp.getData();
        return data;
    }
}
