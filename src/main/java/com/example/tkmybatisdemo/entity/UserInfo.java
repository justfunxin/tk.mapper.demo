package com.example.tkmybatisdemo.entity;

import lombok.Data;

import java.util.List;

/**
 * @author pangxin01822
 */
@Data
public class UserInfo {

    private String info1;

    private List<UserInfo2> info2;

}
