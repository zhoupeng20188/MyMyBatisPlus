package com.zpycloud.mymybatisplus.typehandler;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.extension.handlers.AbstractJsonTypeHandler;
import com.zpycloud.mymybatisplus.entity.JSONTest;
import com.zpycloud.mymybatisplus.enums.SexEnum;

public class SexEnumTypeHandler extends AbstractJsonTypeHandler<Object> {

    @Override
    protected Object parse(String json) {
        return JSON.parseArray(json, SexEnum.class);
    }

    @Override
    protected String toJson(Object obj) {
        return JSON.toJSONString(obj);
    }
}
