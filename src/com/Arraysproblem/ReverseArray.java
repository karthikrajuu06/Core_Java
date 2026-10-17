package com.Arraysproblem;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        int start = 0;
        int end = arr.length - 1;
        
        // Swap elements from both ends moving inward
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
        
        // Print the reversed array using utility library
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}

