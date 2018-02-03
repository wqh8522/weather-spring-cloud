package com.wqh.weatherreport.client;

import com.wqh.weather.data.api.service.WeatherDataService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @author wanqh
 * @date 2018/02/02 14:28
 * @description:
 */
@FeignClient(name = "WEATHER-DATA-SERVICE")
public interface WeatherDataClientService extends WeatherDataService{
}
