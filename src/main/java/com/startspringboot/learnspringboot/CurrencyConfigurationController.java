package com.startspringboot.learnspringboot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CurrencyConfigurationController {
// course id, name, author

    @Autowired
    private CurrencyServiceConfiguration configuration;
    // 의존성 주입 및. Bean을 자동생성

    @RequestMapping(value="/currency-configuration")
    public CurrencyServiceConfiguration retrieveAllCourses(){
        return configuration;
    }
}
