package com.wqh.city.dao;

import com.wqh.city.api.dto.City;
import com.wqh.city.api.dto.CityList;
import com.wqh.common.util.XmlBuilder;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

/**
 * @author wanqh
 * @date 2018/02/01 17:12
 * @description:
 */
@Repository
public class CityDataDao {

    public List<City> listCity() throws Exception {
        //读取xml文件
        Resource resourcee = new ClassPathResource("citylist.xml");
        BufferedReader br = new BufferedReader(new InputStreamReader(resourcee.getInputStream(),"utf-8"));
        StringBuffer sb = new StringBuffer();
        String line = "";
        while ((line = br.readLine()) != null){
            sb.append(line);
        }
        br.close();
        CityList cityList = (CityList) XmlBuilder.xmlStrToObject(CityList.class, sb.toString());
        return cityList.getCityList();
    }
}
