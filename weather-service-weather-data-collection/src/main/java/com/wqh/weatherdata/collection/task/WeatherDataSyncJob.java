package com.wqh.weatherdata.collection.task;

import com.wqh.city.api.dto.City;
import com.wqh.weatherdata.collection.service.CityClientService;
import com.wqh.weatherdata.collection.service.WeatherDataService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * @author wanqh
 * @date 2018/01/31 15:04
 * @description:
 */
@Slf4j
@Component
public class WeatherDataSyncJob {

    @Autowired
    private WeatherDataService weatherDataService;

    @Autowired
    private CityClientService cityClientService;

    @Scheduled(fixedDelay = 1000*60*60,initialDelay = 5000)
    public void syncWeather() throws Exception {
        log.info("Weather Data Sync Job. Start！");
        List<City> cities = cityClientService.listCity();
        for (City city : cities){
            log.info("Weather Data Sync Job, cityName{};cityId{}",city.getCityName(),city.getCityId());
            weatherDataService.syncDateByCityId(city.getCityId());
        }
        log.info("Weather Data Sync Job，End");
    }
}
