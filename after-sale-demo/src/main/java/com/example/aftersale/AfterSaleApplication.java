package com.example.aftersale;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 售后管理示例启动类
 */
@SpringBootApplication
@MapperScan("com.example.aftersale.mapper")
public class AfterSaleApplication {

    public static void main(String[] args) {
        SpringApplication.run(AfterSaleApplication.class, args);
    }
}
