package com.wqh.city.api.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * @author wanqh
 * @date 2018/01/31 14:30
 * @description:
 */
@XmlRootElement(name = "d")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class City implements Serializable{

    @XmlAttribute(name ="d1")
    private String cityId;

    @XmlAttribute(name = "d2")
    private String cityName;

    @XmlAttribute(name = "d3")
    private String cityCode;

    @XmlAttribute(name = "d4")
    private String provice;
}
