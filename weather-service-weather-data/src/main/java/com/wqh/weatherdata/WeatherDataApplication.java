package com.wqh.weatherdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author wqh
 * 天气服务
 */
@SpringBootApplication
@EnableEurekaClient
public class WeatherDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherDataApplication.class, args);
	}
}
