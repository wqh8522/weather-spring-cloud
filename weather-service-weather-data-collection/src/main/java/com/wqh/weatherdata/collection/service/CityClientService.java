package com.wqh.weatherdata.collection.service;

import com.wqh.city.api.service.CityDataService;
import com.wqh.weatherdata.collection.fallback.CityDataFallback;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @author wanqh
 * @date 2018/02/02 9:51
 * @description: 使用Feign的继承特性
 */
@FeignClient(name = "CITY-SERVICE",fallback = CityDataFallback.class)
public interface CityClientService extends CityDataService {
}
