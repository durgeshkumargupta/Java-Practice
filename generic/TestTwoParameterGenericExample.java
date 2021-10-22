package com.durgesh.generic;

import java.util.ArrayList;
import java.util.List;

public class TestTwoParameterGenericExample
{
    public static void main(String[] args) {
        System.out.println("______________________________________");
        TwoParameterGenericExample<String,String> obj=new TwoParameterGenericExample<>();

        obj.setT("1RV20MC015");
        obj.setV("Durgesh");
        System.out.println(obj.getT());
        System.out.println(obj.getV());

        System.out.println("_________________List with generic______________");

        TwoParameterGenericExample<String,List<Student>> obj2=new TwoParameterGenericExample<>();

        List<Student> al=new ArrayList();
        al.add(new Student("1RV20MC088","BGP"));
        al.add(new Student("1RV20MC089","Delhi"));
        al.add(new Student("1RV20MC090","Mumbai"));

        obj2.setT("MCA");
        obj2.setV(al);
        System.out.println(obj2.getT());
        System.out.println(obj2.getV());

        System.out.println("________________Another department________________________");

        List<Student> al2=new ArrayList();
        al2.add(new Student("1RV20CS088","BGP"));
        al2.add(new Student("1RV20CS089","Delhi"));
        al2.add(new Student("1RV20CS090","Mumbai"));

        obj2.setT("CSE");
        obj2.setV(al2);
        System.out.println(obj2.getT());
        System.out.println(obj2.getV());


    }
}
