package com.easypan.utils;

import com.alibaba.fastjson.*;
import org.slf4j.*;

import java.util.*;

public class JsonUtils {
    private static final Logger logger = LoggerFactory.getLogger(JsonUtils.class);

    public static String convertObj2Json(Object obj) {
        return JSON.toJSONString(obj);
    }

    public static <T> T convertJson2Obj(String json, Class<T> classz) {
        return JSONObject.parseObject(json, classz);
    }

    public static <T> List<T> convertJsonArray2List(String json, Class<T> classz) {
        return JSONArray.parseArray(json, classz);
    }

    public static void main(String[] args) {
    }
}
