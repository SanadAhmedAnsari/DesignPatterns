package com.abstractFactory.shape;

import com.abstractFactory.Shape;

public class RounderSquare implements Shape {

    @Override
    public void draw(){
            System.out.println("Inside RoundedSquare::draw() method.");
    }
}
