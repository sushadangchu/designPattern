package com.ldl.singleton;

/**
 * @Author ldl
 * @Date 2021/5/19 19:08
 *
 * 理论上只有第一次实例化才需要加锁，但是这种粗粒度实现存在性能问题，如果单例类使用不频繁的话，可以考虑
 */
public class SingletonLazy {
    private static SingletonLazy uniqueInstance;

    private SingletonLazy() {

    }

    public static synchronized SingletonLazy getInstance() {
        if (uniqueInstance == null) {
            return new SingletonLazy();
        }

        return uniqueInstance;
    }
}
