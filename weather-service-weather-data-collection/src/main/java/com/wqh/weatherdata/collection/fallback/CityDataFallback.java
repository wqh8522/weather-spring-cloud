package com.wqh.weatherdata.collection.fallback;

import com.google.common.collect.Lists;
import com.wqh.city.api.dto.City;
import com.wqh.weatherdata.collection.service.CityClientService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author wanqh
 * @date 2018/02/02 10:25
 * @description:
 */
@Component
@RequestMapping("/city-fallback")
public class CityDataFallback implements CityClientService{

    @Override
    public List<City> listCity() {
        List<City> cities = Lists.newArrayList();
        City city = new City();
        city.setCityId("-1");
        city.setCityName("错误");
        cities.add(city);
        return cities;
    }
}
