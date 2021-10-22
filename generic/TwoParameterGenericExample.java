package com.durgesh.generic;

public class TwoParameterGenericExample <T,V>
{
    private T t;
    private V v;

    public TwoParameterGenericExample() {
    }

    public TwoParameterGenericExample(T t, V v) {
        this.t = t;
        this.v = v;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return "TwoParameterGenericExample{" +
                "t=" + t +
                ", v=" + v +
                '}';
    }
}
