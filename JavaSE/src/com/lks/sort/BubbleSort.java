package com.lks.sort;

public class BubbleSort {
    public static void bubble(int[] array) {
        //外层决定循环次数
        for (int i = 0; i < array.length - 1; i++) {
            //每进行一次，将一个未排序的最大的数字归位
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp;
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    //test
    public static void main(String[] args) {
        int[] a = {1, 8, 6, 4, 2, 7};
        BubbleSort.bubble(a);
        for (int j : a) {
            System.out.println(j);
        }
    }
}
