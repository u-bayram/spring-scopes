package com.ubayram.singleton.service;

import com.ubayram.singleton.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User: ubayram
 * Date: 14.01.2021
 * Time: 12:36
 */
@Service
public class ClassService {

    private final StudentDao studentDao;

    @Autowired
    public ClassService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public StudentDao getStudentDao() {
        return studentDao;
    }
}
