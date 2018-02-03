package com.wqh.weatherdata.collection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author wqh
 *  天气数据采集微服务
 */
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
@EnableScheduling
public class WeatherDataCollectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherDataCollectionApplication.class, args);
	}
}
