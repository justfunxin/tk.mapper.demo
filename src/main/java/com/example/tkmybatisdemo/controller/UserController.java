package com.example.tkmybatisdemo.controller;

import com.example.tkmybatisdemo.entity.User;
import com.example.tkmybatisdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @author pangxin01822
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @PostMapping("/save")
    public int save(@RequestBody User user) {
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        return userMapper.insert(user);
    }

    @GetMapping("/listAll")
    public List<User> listAll() {
        return userMapper.selectAll();
    }

    @GetMapping("/listAll2")
    public List<User> listAll2() {
        return userMapper.listAll();
    }
}
