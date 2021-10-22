package com.durgesh.generic;

import java.util.ArrayList;
import java.util.List;

public class TestSimpleGeneric
{
    public static void main(String[] args) {
        SimpleGeneric<String> obj1=new SimpleGeneric<>();

        System.out.println("____________________String Data Enter_________________");
        obj1.setT("Durgesh");
        System.out.println(obj1.getT());

        System.out.println("_____________List type of data Enter________________________");
        SimpleGeneric<List> obj2=new SimpleGeneric<>();
        List<String> al=new ArrayList<>();
        al.add("Durgesh");
        al.add("Prince");
        al.add("Adity");

        obj2.setT(al);
        System.out.println(obj2.getT());

        System.out.println("____________________List with Student Information____________________");

        SimpleGeneric<List<Student>> obj3=new SimpleGeneric<>();
        List<Student> al2=new ArrayList<>();

        al2.add(new Student("Pankaj","Nepal"));
        al2.add(new Student("Anurag","UP"));
        al2.add(new Student("Aman","Bangal"));

        obj3.setT(al2);
        System.out.println(obj3.getT());
    }
}
