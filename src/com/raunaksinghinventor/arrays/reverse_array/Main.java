package com.raunaksinghinventor.arrays.reverse_array;

import java.util.Arrays;

public class Main {
    public static void reverse(int[] array) {
        System.out.println("Array = " + Arrays.toString(array)); // [1,2,3,4,5,6]
        int mid = array.length/2; // mid = index 3
        int j = array.length-1; // last index
        for(int i = 0; i < mid; i++) {
            // switch indexes i and j
            int tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
        }
        System.out.println("Reversed Array = " + Arrays.toString(array));
    }

    public static void main(String[] args) {
        reverse(new int[] {0,1,2,3,4});
    }
}
