package Java_Basic_Assignment;

// Write a program in Java to display the cube of the number upto given an integer.

import java.util.Scanner;

public class Q_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input number of turns:");
        int a = scan.nextInt();
        int i;
        for(i=1;i<=a;i++){
            System.out.println("Number is: "+i+" and cube of 1 is : "+(i*i*i));
        }
    }
}
