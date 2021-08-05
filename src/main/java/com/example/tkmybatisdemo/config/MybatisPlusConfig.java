package com.example.tkmybatisdemo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author pangxin01822
 */
@Configuration
@MapperScan("com.example.tkmybatisdemo.mapper")
public class MybatisPlusConfig {
}
