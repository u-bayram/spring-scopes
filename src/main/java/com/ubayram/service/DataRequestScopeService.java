package com.ubayram.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

/**
 * User: ubayram
 * Date: 14.01.2021
 * Time: 13:44
 */
@Service
@RequestScope
public class DataRequestScopeService {
    private Integer sampleData = 1;

    public Integer getSampleData() {
        return sampleData;
    }

    public void setSampleData(Integer sampleData) {
        this.sampleData = sampleData;
    }
}
