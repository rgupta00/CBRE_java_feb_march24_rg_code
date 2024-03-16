package com.wclient.controller;

import com.wclient.dto.AppInfoDto;
import com.wclient.service.WeatherClientService;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class WeatherServiceClientController {

    @Autowired
    private WeatherClientService weatherClientService;

    @Autowired
    private AppInfoDto appInfoDto;

    @GetMapping(path = "weatherclient/{temp}")
    public String weatherClient(@PathVariable int temp){
        log.info("weatherClient started with temp {}",temp);
        String info= "client :"+  weatherClientService.getWeatherInfo(temp);
        log.info("weatherClient done with temp {}",temp);
        return info;
    }


    @GetMapping(path = "appinfo")
    public AppInfoDto getAppInfoDto(){
        return appInfoDto;
    }

}