package com.wqh.city.api.service;

import com.wqh.city.api.dto.City;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author wanqh
 * @date 2018/01/31 14:15
 * @description:
 */
@RequestMapping("/city")
public interface CityDataService {
    /**
     * 获取City列表
     * @return
     * @throws Exception
     */
    @GetMapping("/citylist")
    List<City> listCity() throws Exception;
}
