package com.ldl.observer.myobserver.observer;

/**
 * @Author ldl
 * @Date 2021/5/13 15:43
 */
public interface Observer {
    public void update(float temperature, float humidity, float pressure);
}
