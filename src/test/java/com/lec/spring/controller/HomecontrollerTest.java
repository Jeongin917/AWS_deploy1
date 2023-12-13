package com.lec.spring.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HomecontrollerTest{

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void hello(){
        ResponseEntity<String> response = restTemplate.getForEntity("/aws/v1", String.class);
        assertEquals("<h1>AWS 배포 v1</h1>", response.getBody()); // expected와 똑같은 결과여야만 한다
    }

}