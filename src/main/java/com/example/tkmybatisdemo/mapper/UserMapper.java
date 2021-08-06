package com.example.tkmybatisdemo.mapper;

import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import com.example.tkmybatisdemo.entity.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author kangaroo_xin
 */
@Repository
public interface UserMapper extends Mapper<User> {

    @Results(value = {
            @Result(column = "infos", property = "infos", typeHandler = JacksonTypeHandler.class)
    })
    @Select("select * from user")
    List<User> listAll();
}
