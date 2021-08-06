package com.example.tkmybatisdemo.entity;

import lombok.Data;

import java.util.List;

/**
 * @author kangaroo_xin
 */
@Data
public class UserInfo {

    private String info1;

    private List<UserInfo2> info2;

}
