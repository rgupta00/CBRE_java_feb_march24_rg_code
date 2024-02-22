package com.calapp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class CityApiTest {

    private CityApi cityApi;
    @BeforeEach
    void setUp() {
        cityApi=new CityApi();
    }
    @Test
    void getCityName() {
        assertTimeout(Duration.ofMillis(2500), ()->cityApi.getCityName(4));
    }
    @AfterEach
    void tearDown() {
        cityApi=null;
    }


}