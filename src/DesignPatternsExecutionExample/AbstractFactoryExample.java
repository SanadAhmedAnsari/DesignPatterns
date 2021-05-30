package DesignPatternsExecutionExample;

import com.abstractFactory.AbstractFactory;
import com.abstractFactory.FactoryProducer;
import com.abstractFactory.Shape;

public class AbstractFactoryExample {
    public static void getAbstractFactoryExample() {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
        Shape shape3 = shapeFactory1.getShape("RECTANGLE");
        shape3.draw();

        Shape shape4 = shapeFactory1.getShape("SQUARE");
        shape4.draw();
    }
}
