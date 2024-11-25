package com.ftv.mybatislombok;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ftv.mybatislombok.mapper")
public class MyBatisLombokApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBatisLombokApplication.class, args);
    }

}
