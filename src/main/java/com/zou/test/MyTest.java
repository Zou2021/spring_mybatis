package com.zou.test;

import com.zou.entity.User;
import com.zou.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author: 邹祥发
 * @date: 2021/5/8 14:41
 */
public class MyTest {
    @Test
    public void selectTest() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = (UserMapper)applicationContext.getBean("userMapper");
        List<User> users = userMapper.selectList();
        for (User user: users){
            System.out.println(user);
        }
    }
}
