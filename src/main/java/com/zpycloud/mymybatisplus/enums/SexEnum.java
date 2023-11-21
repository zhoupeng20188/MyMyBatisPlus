package com.zpycloud.mymybatisplus.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonCreator;

public enum SexEnum {
    MAN(0, "男"),
    WOMAN(1, "女"),
    ;

    @EnumValue
    private Integer code;
    private String desc;

    SexEnum(int i, String s) {
        this.code = i;
        this.desc = s;
    }

    public Integer getCode() {
        return code;
    }

    @JsonCreator
    public SexEnum getSex(Integer code) {
        for (SexEnum sexEnum : SexEnum.values()) {
            if (sexEnum.getCode().equals(code)) {
                return sexEnum;
            }
        }
        return null;
    }
}
