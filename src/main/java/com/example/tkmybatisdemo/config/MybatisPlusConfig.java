package com.example.tkmybatisdemo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author kangaroo_xin
 */
@Configuration
@MapperScan("com.example.tkmybatisdemo.mapper")
public class MybatisPlusConfig {
}
