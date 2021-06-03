import DesignPatternsExecutionExample.abstracFactory.AbstractFactoryExample;
import DesignPatternsExecutionExample.builder.BuilderPatternDemo;
import DesignPatternsExecutionExample.factory.FactoryExample;
import DesignPatternsExecutionExample.prototype.PrototypePatternExample;
import DesignPatternsExecutionExample.singleton.*;
import com.structural.adapter.School;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("***********----Menu------**************");
            System.out.println("***********----Press 0 to quit------**************");
            System.out.println("Enter the number against the option");
            System.out.println("Enter 1 for Factory Example");
            System.out.println("Enter 2 for Abstract Factory Example");
            System.out.println("Enter 3 for Eager Instantiation of Singleton Class Example");
            System.out.println("Enter 4 for Lazy Instantiation of Singleton Class Example");
            System.out.println("Enter 5 for Lazy Instantiation thread unsafe Singleton Class Example");
            System.out.println("Enter 6 for Lazy Instantiation thread safe with double checked locking Singleton Class Example");
            System.out.println("Enter 7 for Singleton Class Pattern with enum Example");
            System.out.println("Enter 8 for Builder Class Pattern with enum Example");
            System.out.println("Enter 9 for Prototype Pattern Example");
            System.out.println("Enter 10 for Adapter Pattern Example");
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    FactoryExample.getFactoryExample();
                    break;
                case 2:
                    AbstractFactoryExample.getAbstractFactoryExample();
                    break;
                case 3:
                    EagerInstantiationDemo.getEagerInstantiationDemo();
                    break;
                case 4:
                    LazyInstantiationDemo.getEagerInstantiationDemo();
                    break;
                case 5:
                    ThreadUnSafeSingletonDemo.threadUnSafeSingletonDemoMethod();
                    break;
                case 6:
                    ThreadSafeSingletonWithDoubleCheckedLockingDemo.getThreadSafeSingletonWithDoubleCheckedLockingDemo();
                    break;
                case 7:
                    SingletonEnumDemo.getSingletonEnumDemo();
                    break;
                case 8:
                    BuilderPatternDemo.getBuilderPatternDemo();
                    break;
                case 9:
                    PrototypePatternExample.getPrototypePatternExample();
                    break;
                case 10:
                    School.AdapterDemo();
                    break;
                case 0:
                    return;
            }
        }
    }
}
