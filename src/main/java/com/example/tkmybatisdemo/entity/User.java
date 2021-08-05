package com.example.tkmybatisdemo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import com.example.tkmybatisdemo.enums.GenderEnum;
import lombok.Data;
import tk.mybatis.mapper.annotation.ColumnType;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author pangxin01822
 */
@Data
@Table(name = "user")
@TableName(autoResultMap = true)
public class User {

    @Id
    private Long id;

    private String name;

    private Integer age;

    @Column
    private GenderEnum gender;

    private String mobile;

    @ColumnType(typeHandler = JacksonTypeHandler.class)
    @TableField(typeHandler = JacksonTypeHandler.class)
    private UserInfo[] infos;

    private Date createTime;

    private Date updateTime;

}
