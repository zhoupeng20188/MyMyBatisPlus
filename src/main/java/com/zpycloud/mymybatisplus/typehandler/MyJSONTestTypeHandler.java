package com.zpycloud.mymybatisplus.typehandler;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.toolkit.Assert;
import com.baomidou.mybatisplus.extension.handlers.AbstractJsonTypeHandler;
import com.zpycloud.mymybatisplus.entity.JSONTest;

public class MyJSONTestTypeHandler extends AbstractJsonTypeHandler<Object> {

    @Override
    protected Object parse(String json) {
        return JSON.parseArray(json, JSONTest.class);
    }

    @Override
    protected String toJson(Object obj) {
        return JSON.toJSONString(obj);
    }
}
