package com.oop.set.collection;

public class GenericDemo<E> {
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }

    public <M> void test(M m) {

    }
    public static void main(String[] args) {
        GenericDemo<String> stringGenericDemo = new GenericDemo<>();
        stringGenericDemo.setName("jjj");

        GenericDemo<Integer> integerGenericDemo = new GenericDemo<>();
        integerGenericDemo.setName(1);

        System.out.println(stringGenericDemo.getName());
        System.out.println(integerGenericDemo.getName());
    }
}
