package com.wqh.weather.data.api.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wanqh
 * @date 2018/01/31 11:09
 * @description: 未来天气
 */
@Data
public class Forecast implements Serializable {

	private static final long serialVersionUID = 1L;
	private String date;
	private String high;
	private String fengli;
	private String low;
	private String fengxiang;
	private String type;


}
