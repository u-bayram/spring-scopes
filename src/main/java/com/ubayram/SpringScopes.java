package com.ubayram;

import com.ubayram.prototype.service.OrderService;
import com.ubayram.prototype.service.ProductService;
import com.ubayram.singleton.service.ClassService;
import com.ubayram.singleton.service.SchoolService;
import com.ubayram.singleton.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * User: ubayram
 * Date: 14.01.2021
 * Time: 12:38
 */
@SpringBootApplication
public class SpringScopes {

    public static void main(String[] args) {
        SpringApplication.run(SpringScopes.class, args);
    }


}
