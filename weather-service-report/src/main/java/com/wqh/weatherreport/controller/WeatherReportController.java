package com.wqh.weatherreport.controller;

import com.wqh.weatherreport.client.CityClientService;
import com.wqh.weatherreport.service.WeatherReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author wanqh
 * @date 2018/02/02 14:32
 * @description:
 */
@RestController
@RequestMapping("/report")
public class WeatherReportController {

    @Autowired
    private CityClientService cityClientService;

    @Autowired
    private WeatherReportService weatherReportService;

    @GetMapping("/cityId/{cityId}")
    public ModelAndView getWeatherReportByCityId(@PathVariable("cityId")String cityId, Model model) throws Exception {
        model.addAttribute("title", "天气预报");
        model.addAttribute("cityId", cityId);
        model.addAttribute("cityList", cityClientService.listCity());
        model.addAttribute("report",weatherReportService.getDataByCityId(cityId));
        return new ModelAndView("weather/report","reportModel",model);
    }
}
