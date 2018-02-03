package com.wqh.weather.data.api.service;


import com.wqh.weather.data.api.dto.WeatherResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wanqh
 * @date 2018/01/31 11:20
 * @description: 天气数据接口
 */
@RequestMapping("weather")
public interface WeatherDataService {

    /**
     * 根据城市ID查询天气数据
     *
     * @param cityId
     * @return
     */
    @GetMapping("/cityId/{cityId}")
    WeatherResponse getDataByCityId(@PathVariable("cityId") String cityId);

    /**
     * 根据城市名称查询天气数据
     *
     * @param cityName
     * @return
     */
    @GetMapping("/cityName/{cityName}")
    WeatherResponse getDataByCityName(@PathVariable("cityName")String cityName);

}
