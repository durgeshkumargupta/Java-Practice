package com.durgesh.generic;

public class SimpleGeneric<T>
{
    private T t;

    public SimpleGeneric() {
    }

    public SimpleGeneric(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

}
