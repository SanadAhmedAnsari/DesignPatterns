package com.singleton;

public class EagerInstantiation {
    public static EagerInstantiation obj = new EagerInstantiation();
    private EagerInstantiation(){
        System.out.println("Eager Instantiation done");
    }
    public static EagerInstantiation getEagerInstance(){
        return obj;
    }
}
