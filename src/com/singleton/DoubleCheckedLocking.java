package com.singleton;

public class DoubleCheckedLocking {
    public static DoubleCheckedLocking doubleCheckedLocking;
    private DoubleCheckedLocking(){
        System.out.println("Lazy Instantiation done");
    }
    public static DoubleCheckedLocking getDoubleCheckedLocking(){
        if(doubleCheckedLocking == null){
            synchronized (DoubleCheckedLocking.class) {
                if(doubleCheckedLocking == null) {
                    doubleCheckedLocking = new DoubleCheckedLocking();
                }
            }
        }
        return doubleCheckedLocking;
    }
}
