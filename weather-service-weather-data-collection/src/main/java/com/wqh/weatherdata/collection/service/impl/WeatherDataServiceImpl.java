package com.wqh.weatherdata.collection.service.impl;

import com.wqh.common.constants.RedisConstant;
import com.wqh.weatherdata.collection.service.WeatherDataService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.TimeUnit;

/**
 * @author wanqh
 * @date 2018/01/31 11:21
 * @description:
 */
@Service
@Slf4j
public class WeatherDataServiceImpl implements WeatherDataService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public void syncDateByCityId(String cityId) {
        String uri = RedisConstant.WEATHER_URI + "citykey=" + cityId;
        String body = null;
        String key = uri;
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(uri, String.class);
        if(200 == responseEntity.getStatusCodeValue()){
            body = responseEntity.getBody();
        }
        //将数据保存到缓存。一个参数是key ，第二个是保存的value，第三个是有效期，第四个是有效期的单位
        ops.set(key,body,RedisConstant.WEATHER_DATA_TIME_OUT,TimeUnit.SECONDS  );
    }
}
