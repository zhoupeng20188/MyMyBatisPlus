package com.zpycloud.mymybatisplus;

import com.baomidou.mybatisplus.core.toolkit.Assert;
import com.zpycloud.mymybatisplus.entity.User;
import com.zpycloud.mymybatisplus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MybatisPlusJsonColumnTest {

    @Autowired
    private UserMapper userMapper;

    /**
     * List<JSONTest>的json使用默认的JacksonTypeHandler不能正常解析，需要自定义TypeHandler
     * 如果是单个的JSONTest的json可以使用JacksonTypeHandler
     */
    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        Assert.isTrue(5 == userList.size(), "");
        userList.forEach(System.out::println);
    }

}