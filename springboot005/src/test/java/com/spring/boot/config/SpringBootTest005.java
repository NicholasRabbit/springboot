package com.spring.boot.config;

import com.spring.boot.config.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootTest005 {

    @Autowired
    User user;

    @Test
    public void testConfig(){
        System.out.println("user01==>" + user);
    }
}
