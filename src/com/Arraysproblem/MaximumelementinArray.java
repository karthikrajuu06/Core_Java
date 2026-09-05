package com.Arraysproblem;
import java.util.*;
public class MaximumelementinArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 elements:");

        // Read all elements
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Assume first element is maximum
        int max = arr[0];

        // Compare remaining elements
        for(int i = 1; i < arr.length; i++) {

            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println( max);

    }
}