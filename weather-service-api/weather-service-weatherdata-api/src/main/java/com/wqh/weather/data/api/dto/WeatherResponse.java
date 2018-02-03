package com.wqh.weather.data.api.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wanqh
 * @date 2018/01/31 11:09
 * @description: 天气信息
 */
@Data
public class WeatherResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	private Weather data;
	private Integer status;
	private String desc;
}
