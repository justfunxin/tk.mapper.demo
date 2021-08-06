package com.example.tkmybatisdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import com.example.tkmybatisdemo.entity.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author kangaroo_xin
 */
@Repository
public interface User2Mapper extends BaseMapper<User> {

    @Results(value = {
            @Result(column = "infos", property = "infos", typeHandler = JacksonTypeHandler.class)
    })
    @Select("select * from user")
    List<User> listAll();
}
