package com.ubayram.controller;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

/**
 * User: ubayram
 * Date: 14.01.2021
 * Time: 13:50
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringScopesRestControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void requestScopeSampleTest() {
        String request1Result = testRestTemplate.getForObject("http://localhost:" + port + "/requestScopeSample", String.class);
        String request2Result = testRestTemplate.getForObject("http://localhost:" + port + "/requestScopeSample", String.class);
        Assert.assertEquals("Not same beans",request1Result, request2Result);
    }

}
