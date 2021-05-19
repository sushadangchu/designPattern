package com.ldl.singleton;

/**
 * @Author ldl
 * @Date 2021/5/19 19:11
 *
 * 在类被加载的时候就实例化对象，避免了同步问题，但是要确保单例类一定会被使用，否则就是浪费资源
 */
public class SingletonQuick {
    private static SingletonQuick uniqueInstance = new SingletonQuick();

    private SingletonQuick() {

    }

    public static SingletonQuick getInstance() {
        return uniqueInstance;
    }
}
