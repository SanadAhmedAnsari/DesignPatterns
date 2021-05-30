package com.abstractFactory;

import com.abstractFactory.shape.Rectangle;
import com.abstractFactory.shape.RounderRectangle;
import com.abstractFactory.shape.RounderSquare;
import com.abstractFactory.shape.Square;

public class RoundedShapeFactory extends ShapeFactory{
    @Override
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new RounderRectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new RounderSquare();
        }
        return null;
    }
}
