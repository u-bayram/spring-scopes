package com.ubayram;

import com.ubayram.prototype.service.OrderService;
import com.ubayram.prototype.service.ProductService;
import com.ubayram.singleton.service.ClassService;
import com.ubayram.singleton.service.SchoolService;
import com.ubayram.singleton.service.StudentService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * User: ubayram
 * Date: 14.01.2021
 * Time: 15:54
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringScopesTest {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void singletonScopeTest() {
        ClassService classService = (ClassService) applicationContext.getBean("classService");
        SchoolService schoolService = (SchoolService) applicationContext.getBean("schoolService");
        StudentService studentService = (StudentService) applicationContext.getBean("studentService");
        Assert.assertEquals("same beans",classService.getStudentDao(), studentService.getStudentDao());
        Assert.assertEquals("same beans",classService.getStudentDao(), schoolService.getStudentDao());
        Assert.assertEquals("same beans",schoolService.getStudentDao(), studentService.getStudentDao());
    }

    @Test
    public void prototypeScopeTest() {
        OrderService orderService = (OrderService) applicationContext.getBean("orderService");
        ProductService productService = (ProductService) applicationContext.getBean("productService");
        Assert.assertNotEquals("Not same beans",orderService.getProductDao(), productService.getProductDao());
    }

}
