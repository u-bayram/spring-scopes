package com.ubayram.singleton.dao;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

/**
 * User: ubayram
 * Date: 14.01.2021
 * Time: 12:36
 */
@Repository
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class StudentDao {

}
