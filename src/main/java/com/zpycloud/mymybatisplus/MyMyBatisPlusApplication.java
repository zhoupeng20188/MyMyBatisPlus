package com.zpycloud.mymybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zpycloud.mymybatisplus.mapper")
public class MyMyBatisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyMyBatisPlusApplication.class, args);
    }

}
