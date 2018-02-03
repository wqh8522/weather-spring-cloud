package com.wqh.city.service;

import com.wqh.city.api.dto.City;
import com.wqh.city.api.service.CityDataService;
import com.wqh.city.dao.CityDataDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wanqh
 * @date 2018/02/01 17:10
 * @description:
 */
@RestController
public class CityDataServiceImpl implements CityDataService {

    @Autowired
    private CityDataDao dataDao;

    @Override
    public List<City> listCity() throws Exception {
        return dataDao.listCity();
    }
}
