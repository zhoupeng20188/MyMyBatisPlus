package com.zpycloud.mymybatisplus.entity;

import com.zpycloud.mymybatisplus.enums.SexEnum;
import lombok.Data;

import java.io.Serializable;

@Data
public class JSONTest implements Serializable {
    private SexEnum sex;
//    private Integer sex;
}
