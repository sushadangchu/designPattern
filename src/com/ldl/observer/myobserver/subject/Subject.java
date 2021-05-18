package com.ldl.observer.myobserver.subject;

import com.ldl.observer.myobserver.observer.Observer;

/**
 * @Author ldl
 * @Date 2021/5/13 15:42
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
