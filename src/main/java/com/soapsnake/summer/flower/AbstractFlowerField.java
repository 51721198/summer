package com.soapsnake.summer.flower;

import org.omg.CORBA.Object;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 抽象基础容器
 */
public abstract  class AbstractFlowerField implements FlowerField {

    private Map<String, Object> baseContainer = new ConcurrentHashMap<>(16);

    @Override
    public Object getFlower(String name) throws Exception {
        return baseContainer.get(name);
    }

    @Override
    public <T> T getFlower(String name, Class<T> requiredType) throws Exception {
        return null;
    }

    @Override
    public <T> T getFlower(Class<T> requiredType) throws Exception {
        return null;
    }

    @Override
    public java.lang.Object getFlower(String name, java.lang.Object... args) throws Exception {
        return null;
    }

    @Override
    public <T> T getFlower(Class<T> requiredType, java.lang.Object... args) throws Exception {
        return null;
    }

    @Override
    public boolean containsFlower(String name) {
        return false;
    }

    @Override
    public boolean isSingleton(String name) throws Exception {
        return false;
    }

    @Override
    public boolean isPrototype(String name) throws Exception {
        return false;
    }

    @Override
    public boolean isTypeMatch(String name, Class<?> typeToMatch) throws Exception {
        return false;
    }

    @Override
    public Class<?> getType(String name) throws Exception {
        return null;
    }

    @Override
    public String[] getAliases(String name) {
        return new String[0];
    }


}
