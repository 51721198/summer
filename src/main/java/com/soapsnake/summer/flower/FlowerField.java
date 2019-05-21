package com.soapsnake.summer.flower;

/**
 * 花田
 * @Auther soapsnake@gmail.com
 * @Date 2019-02-21 10:34
 */
public interface FlowerField {

    /**
     * 获取flower
     * @param name
     * @return
     * @throws Exception
     */
    Object getFlower(String name) throws Exception;

    <T> T getFlower(String name, Class<T> requiredType) throws Exception;

    <T> T getFlower(Class<T> requiredType) throws Exception;

    Object getFlower(String name, Object... args) throws Exception;

    <T> T getFlower(Class<T> requiredType, Object... args) throws Exception;


    boolean containsFlower(String name);

    boolean isSingleton(String name) throws Exception;

    boolean isPrototype(String name) throws Exception;

//    boolean isTypeMatch(String name, ResolvableType typeToMatch) throws Exception;

    boolean isTypeMatch(String name, Class<?> typeToMatch) throws Exception;

    Class<?> getType(String name) throws Exception;

    String[] getAliases(String name);

}
