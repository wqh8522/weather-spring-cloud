package com.wqh.weatherreport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @author wqh
 * 天气预报服务，从城市服务中获取城市信息，才天气服务中获取天气
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class WeatherReportApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherReportApplication.class, args);
	}
}
