package com.galaxy;

import com.galaxy.mapper.UserMapper;
import com.galaxy.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisplusSpringbootApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Test
    void contextLoads() {
//        List<User> list = userMapper.selectList(null);
//        for (User user : list) {
//            System.out.println(user);
//        }

        userMapper.selectList(null).forEach(System.out::println);
    }

}
