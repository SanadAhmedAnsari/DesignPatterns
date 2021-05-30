package DesignPatternsExecutionExample;

import com.factory.Shape;
import com.factory.ShapeFactory;

public class FactoryExample {
    public static void getFactoryExample(){
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("Rectangle");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("Square");
        shape2.draw();
        Shape shape3 = shapeFactory.getShape("Circle");
        shape3.draw();
    }
}
