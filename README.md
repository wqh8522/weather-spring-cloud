基于SpringCloud搭建的简单的天气系统
模块介绍

```
weather-spring-cloud

|----weather-common： 公用模块，比如常量、工具类等
|----weather-eureka-server：eureka的服务注册中心，端口8888
|----weather-gateway：api网关，端口80
|----weather-service-api：接口的定义
	|----weather-service-city-api：城市服务api
	|----weather-service-weatherdata-api：天气数据api
|----weather-service-city：城市服务，端口
|----weather-service-report：天气预报服务，主要提供页面的展示，端口9300
|----weather-service-weather-data：天气数据服务，提供天气查询借口，端口：9200
|----weather-service-weather-data-collection：天气采集微服务，端口：9100

```

主要使用的技术：springcloud：eureka，hystrix，feign，redis，zuul

