package com.oop.set.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericBianli {

    public static void main(String[] args) {
        ArrayList<String> string = new ArrayList<>();
        ArrayList<Integer> integers = new ArrayList<>();
        string.add("hh");
        string.add("jj");
        integers.add(1);
        integers.add(2);

        System.out.println("String Test");
        printArrayList(string);
        System.out.println("Integer Test");
        printArrayList(integers);
    }

    //?代表泛型通配符，只能作为方法的参数使用
    public static void printArrayList(ArrayList<?> arrayList) {
        for (Object o : arrayList) {
            System.out.println(o);
        }
    }
}
