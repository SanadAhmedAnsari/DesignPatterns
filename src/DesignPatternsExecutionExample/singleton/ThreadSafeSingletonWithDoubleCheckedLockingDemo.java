package DesignPatternsExecutionExample.singleton;

import com.singleton.DoubleCheckedLocking;

public class ThreadSafeSingletonWithDoubleCheckedLockingDemo {
    public static void getThreadSafeSingletonWithDoubleCheckedLockingDemo(){
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from thread 1");
                DoubleCheckedLocking.getDoubleCheckedLocking();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from thread 2");
                DoubleCheckedLocking.getDoubleCheckedLocking();
            }
        });
        thread1.start();
        thread2.start();
    }
}
