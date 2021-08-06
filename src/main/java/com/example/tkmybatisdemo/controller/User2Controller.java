package com.example.tkmybatisdemo.controller;

import com.example.tkmybatisdemo.entity.User;
import com.example.tkmybatisdemo.mapper.User2Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @author kangaroo_xin
 */
@RestController
@RequestMapping("/user2")
public class User2Controller {

    @Autowired
    private User2Mapper user2Mapper;

    @PostMapping("/save")
    public int save2(@RequestBody User user) {
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        return user2Mapper.insert(user);
    }

    @GetMapping("/listAll")
    public List<User> listAll() {
        return user2Mapper.selectList(null);
    }

    @GetMapping("/listAll2")
    public List<User> listAll2() {
        return user2Mapper.listAll();
    }
}
