package Java_Basic_Assignment;
//Write a Java program to find the k smallest elements in a given array. Elements in the array can be in any order.
//        Original Array:
//        [1, 4, 17, 7, 25, 3, 100]
//        3 largest elements of the said array are:
//        100 25 17

import java.util.Arrays;
import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        Integer a[] = new Integer[]{1, 4, 17, 7, 25, 3, 100};
        Scanner s = new Scanner(System.in);
        System.out.println("Enter limit you required: ");
        int n = s.nextInt();
        System.out.println("Original Array is: ");
        System.out.println(Arrays.toString(a));
        System.out.println(n + " smallest elements of the said array are: ");
        Arrays.sort(a);
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}
