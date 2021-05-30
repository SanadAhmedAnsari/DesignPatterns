package DesignPatternsExecutionExample;

import com.singleton.LazyThreadUnsafeSingleton;

public class ThreadUnSafeSingletonDemo {
    public static void threadUnSafeSingletonDemoMethod() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from thread 1");
                LazyThreadUnsafeSingleton.getLazyInstantiation();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from thread 2");
                LazyThreadUnsafeSingleton.getLazyInstantiation();
            }
        });
        thread1.start();
        thread2.start();
    }
}
