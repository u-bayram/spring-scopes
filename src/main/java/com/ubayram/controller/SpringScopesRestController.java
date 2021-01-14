package com.ubayram.controller;

import com.ubayram.service.DataApplicationScopeService;
import com.ubayram.service.DataRequestScopeService;
import com.ubayram.service.DataSessionScopeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: ubayram
 * Date: 14.01.2021
 * Time: 13:42
 */
@RestController
public class SpringScopesRestController {

    @Autowired
    private DataRequestScopeService dataRequestScopeService;

    @Autowired
    private DataSessionScopeService dataSessionScopeService;

    @Autowired
    private DataApplicationScopeService applicationScope;

    @GetMapping(value = "requestScopeSample")
    public String requestScopeSample() {
        String sampleData = "Reqeust Scope Sample Data " + dataRequestScopeService.getSampleData();
        dataRequestScopeService.setSampleData(dataRequestScopeService.getSampleData() + 1);
        return sampleData;
    }

    @GetMapping(value = "sessionScopeSample")
    public String sessionScopeSample() {
        String sampleData = "Session Scope Sample Data " + dataSessionScopeService.getSampleData();
        dataSessionScopeService.setSampleData(dataSessionScopeService.getSampleData() + 1);
        return sampleData;
    }

    @GetMapping(value = "applicationScopeSample")
    public String applicationScopeSample() {
        String sampleData = "Application Scope Sample Data " + applicationScope.getSampleData();
        applicationScope.setSampleData(applicationScope.getSampleData() + 1);
        return sampleData;
    }
}
