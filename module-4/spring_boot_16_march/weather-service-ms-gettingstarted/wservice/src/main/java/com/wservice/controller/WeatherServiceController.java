package com.wservice.controller;

import com.wservice.dto.AppInfoDto;
import com.wservice.service.WeatherService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class WeatherServiceController {

    @Autowired
    private AppInfoDto appInfoDto;

    @Autowired
    private WeatherService weatherService;

    @GetMapping(path="weatherinfo/{temp}")
    public String getWeatherInfo(@PathVariable int temp){
        log.info("getWeatherInfo method is started with temp {}", temp);
        String weatherInfo= weatherService.getWeatherInfo(temp);
        log.info("getWeatherInfo method is done with temp {}", temp);
        return weatherInfo;
    }

    @GetMapping(path = "appinfo")
    public AppInfoDto getAppInfoDto(){
        return appInfoDto;
    }
}
