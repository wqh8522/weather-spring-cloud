package com.wqh.weatherdata.service;

import com.google.gson.Gson;
import com.wqh.common.constants.RedisConstant;
import com.wqh.weather.data.api.dto.WeatherResponse;
import com.wqh.weather.data.api.service.WeatherDataService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.TimeUnit;

/**
 * @author wanqh
 * @date 2018/01/31 11:21
 * @description:
 */
@RestController
@Slf4j
public class WeatherDataServiceImpl implements WeatherDataService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private Gson gson;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public WeatherResponse getDataByCityId(@PathVariable("cityId")String cityId) {
        String uri = RedisConstant.WEATHER_URI + "citykey=" + cityId;
        return getWeather(uri);
    }
    @Override
    public WeatherResponse getDataByCityName(@PathVariable("cityName")String cityName) {
        String uri = RedisConstant.WEATHER_URI  + "city=" + cityName;
        return getWeather(uri);
    }


    private WeatherResponse getWeather(String uri){
        String body = null;
        //先查询缓存中是否有数据
        String key = uri;
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        if(stringRedisTemplate.hasKey(key)){
            log.info("Redis Cache Has Data");
            body = ops.get(key);
        }else {
            log.info("Redis Cache Don't Has Data");
            //缓存中没有数据，请求接口，并将数据保存到缓存。
            ResponseEntity<String> responseEntity = restTemplate.getForEntity(uri, String.class);
            if(200 == responseEntity.getStatusCodeValue()){
                body = responseEntity.getBody();
            }
            //将数据保存到缓存。一个参数是key ，第二个是保存的value，第三个是有效期，第四个是有效期的单位
            ops.set(key,body,RedisConstant.WEATHER_DATA_TIME_OUT,TimeUnit.SECONDS  );
        }
        WeatherResponse weatherResponse = gson.fromJson(body, WeatherResponse.class);
        return weatherResponse;
    }
}
