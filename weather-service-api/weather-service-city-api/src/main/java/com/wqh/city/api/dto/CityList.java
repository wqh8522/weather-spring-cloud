package com.wqh.city.api.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * @author wanqh
 * @date 2018/01/31 14:34
 * @description:
 */
@XmlRootElement(name = "c")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class CityList implements Serializable {

    @XmlElement(name = "d")
    private List<City> cityList;

}
