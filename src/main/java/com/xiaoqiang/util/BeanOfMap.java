package com.xiaoqiang.util;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 黄豪强
 * @create 2019/8/13 11:16
 */
public class BeanOfMap {

    /**
     * 转换bean为map
     *
     * @param source 要转换的bean
     * @param <T>    bean类型
     * @return 转换结果
     */
    public static <T> Map<String, Object> bean2Map(T obj) throws IllegalAccessException {
        Map<String, Object> map = new HashMap<>();
        Class<?> clazz = obj.getClass();
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            String fieldName = field.getName();
            Object value = field.get(obj);
            map.put(fieldName, value);
        }
        return map;
    }
}
