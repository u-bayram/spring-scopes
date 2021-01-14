package com.ubayram.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

/**
 * User: ubayram
 * Date: 14.01.2021
 * Time: 13:44
 */
@Service
@SessionScope
public class DataSessionScopeService {
    private Integer sampleData = 1;

    public Integer getSampleData() {
        return sampleData;
    }

    public void setSampleData(Integer sampleData) {
        this.sampleData = sampleData;
    }
}
