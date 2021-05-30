package DesignPatternsExecutionExample;

import com.singleton.SingletonWithEnum;

public class SingletonEnumDemo {
    public static void getSingletonEnumDemo(){
        SingletonWithEnum singletonWithEnum = SingletonWithEnum.INSTANCE;
        singletonWithEnum.i = 10;
        singletonWithEnum.show();


        SingletonWithEnum singletonWithEnum2 = SingletonWithEnum.INSTANCE;

        singletonWithEnum2.i = 30;

        singletonWithEnum.show();
    }
}
