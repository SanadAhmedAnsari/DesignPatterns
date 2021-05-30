package com.abstractFactory.shape;

import com.abstractFactory.Shape;

public class Square implements Shape {
    @Override
    public void draw(){
        System.out.println("Inside Square::draw() method.");
    }
}
