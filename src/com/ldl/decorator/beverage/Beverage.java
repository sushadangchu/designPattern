package com.ldl.decorator.beverage;

/**
 * @Author ldl
 * @Date 2021/5/14 15:08
 */
public abstract class Beverage {
    String description = "未知饮料";
    String size;

    public abstract double cost();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
