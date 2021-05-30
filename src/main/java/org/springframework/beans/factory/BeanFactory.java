package org.springframework.beans.factory;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author hawdies
 * @date 2021/5/30
 **/
public class BeanFactory {
    private static ConcurrentHashMap<String, Object> singletonObjects = new ConcurrentHashMap<>();

    public void register(String key, Object value) {
        singletonObjects.put(key, value);
    }

    public Object getBean(String key) {
        return singletonObjects.get(key);
    }
}
