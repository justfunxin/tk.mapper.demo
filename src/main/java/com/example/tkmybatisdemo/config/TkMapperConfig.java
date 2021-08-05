package com.example.tkmybatisdemo.config;

import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author pangxin01822
 */
@Configuration
@MapperScan("com.example.tkmybatisdemo.mapper")
public class TkMapperConfig {
}
