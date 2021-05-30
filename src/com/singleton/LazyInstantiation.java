package com.singleton;

public class LazyInstantiation {
    public static LazyInstantiation lazyInstantiation;
    private LazyInstantiation(){
        System.out.println("Lazy Instantiation done");
    }
    public static synchronized LazyInstantiation getLazyInstantiation(){
        if(lazyInstantiation == null){
            lazyInstantiation = new LazyInstantiation();
        }
        return lazyInstantiation;
    }
}
