package com.wqh.weather.data.api.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;


/**
 * @author wanqh
 * @date 2018/01/31 11:09
 * @description: 天气信息
 */
@Data
public class Weather implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String city;
	private String aqi;
	private String ganmao;
	private String wendu;
	private Yesterday yesterday;
	private List<Forecast> forecast;

}
