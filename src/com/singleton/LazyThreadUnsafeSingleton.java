package com.singleton;

public class LazyThreadUnsafeSingleton {
    public static LazyThreadUnsafeSingleton lazyThreadUnsafeSingleton;
    private LazyThreadUnsafeSingleton(){
        System.out.println("Lazy Instantiation done");
    }
    public static synchronized LazyThreadUnsafeSingleton getLazyInstantiation(){
        if(lazyThreadUnsafeSingleton == null){
            lazyThreadUnsafeSingleton = new LazyThreadUnsafeSingleton();
        }
        return lazyThreadUnsafeSingleton;
    }
}
