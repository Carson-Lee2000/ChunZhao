package com.lks.arguments;

public class Arguments {
    public static void main(String[] args) {
//        for (int i = 0; i < args.length; i++) {
//            System.out.println(args[i]);
//        }
        Arguments arguments = new Arguments();
        arguments.variable(1,2,3,4,5,6);
    }

    public void variable(int ...numbers) {
//        System.out.println(i[]);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
