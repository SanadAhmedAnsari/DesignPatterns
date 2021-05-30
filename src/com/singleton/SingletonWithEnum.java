package com.singleton;

public enum SingletonWithEnum {
    INSTANCE;
    public int i;
    public void show(){
        System.out.println(i);
    }
}
