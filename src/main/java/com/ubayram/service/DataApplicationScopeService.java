package com.ubayram.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

/**
 * User: ubayram
 * Date: 14.01.2021
 * Time: 13:46
 */
@Service
@ApplicationScope
public class DataApplicationScopeService {
    private Integer sampleData = 1;

    public Integer getSampleData() {
        return sampleData;
    }

    public void setSampleData(Integer sampleData) {
        this.sampleData = sampleData;
    }
}
