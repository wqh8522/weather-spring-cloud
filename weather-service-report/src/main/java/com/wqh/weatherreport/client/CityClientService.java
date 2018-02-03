package com.wqh.weatherreport.client;

import com.wqh.city.api.service.CityDataService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @author wanqh
 * @date 2018/02/02 14:25
 * @description:
 */
@FeignClient(name = "CITY-SERVICE")
public interface CityClientService  extends CityDataService{
}
