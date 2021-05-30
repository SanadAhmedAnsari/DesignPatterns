import DesignPatternsExecutionExample.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("***********----Menu------**************");
        System.out.println("Enter the number against the option");
        System.out.println("Press 1 for Factory Example");
        System.out.println("Press 2 for Abstract Factory Example");
        System.out.println("Press 3 for Eager Instantiation of Singleton Class Example");
        System.out.println("Press 4 for Lazy Instantiation of Singleton Class Example");
        System.out.println("Press 5 for Lazy Instantiation thread unsafe Singleton Class Example");
        System.out.println("Press 6 for Lazy Instantiation thread safe with double checked locking Singleton Class Example");
        System.out.println("Press 7 for Singleton Class Pattern with enum Example");
        int input = scanner.nextInt();
        switch (input){
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
        }

    }
}
