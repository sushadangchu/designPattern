package com.ldl.singleton;

/**
 * @Author ldl
 * @Date 2021/5/19 19:12
 *
 * 双重检查锁可以做到只有在第一次实例化时候加锁，其他情况直接返回，没有性能问题
 */
public class SingletonDoubleCheckLock {
    private volatile static SingletonDoubleCheckLock uniqueInstance;

    private SingletonDoubleCheckLock() {

    }

    public static SingletonDoubleCheckLock getInstance() {
        if (uniqueInstance == null) {
            synchronized (SingletonDoubleCheckLock.class) {
                if (uniqueInstance == null) {
                    return new SingletonDoubleCheckLock();
                }
            }
        }

        return uniqueInstance;
    }
}
