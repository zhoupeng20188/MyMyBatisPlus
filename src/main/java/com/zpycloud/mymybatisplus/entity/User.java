package com.zpycloud.mymybatisplus.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import com.zpycloud.mymybatisplus.enums.SexEnum;
import com.zpycloud.mymybatisplus.typehandler.MyJSONTestTypeHandler;
import com.zpycloud.mymybatisplus.typehandler.SexEnumTypeHandler;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@TableName(value = "`user`", autoResultMap = true)
public class User implements Serializable {
    private Long id;
    private String name;
    private SexEnum sex;
    private Integer age;
    private String email;

    /**
     * [{"sex": 0}, {"sex": 1}]
     */
    @TableField(typeHandler = MyJSONTestTypeHandler.class)
    private List<JSONTest> json;

    /**
     * {"sex": 0}
     */
    @TableField(typeHandler = JacksonTypeHandler.class)
    private JSONTest json2;

    /**
     * [0,1]
     */
    @TableField(typeHandler = SexEnumTypeHandler.class)
    private List<SexEnum> json3;
}