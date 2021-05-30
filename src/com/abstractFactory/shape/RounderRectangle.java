package com.abstractFactory.shape;

import com.abstractFactory.Shape;

public class RounderRectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside RoundedRectangle::draw() method.");
    }
}
