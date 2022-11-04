package Java_Basic_Assignment;

import java.util.Scanner;

// Write a program in Java to input 5 numbers from the keyboard and find their sum and average.

public class Q_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter five number: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();

        int sum = a+b+c+d+e;
        int avg = (a+b+c+d+e)/5;

        System.out.println("The sum of 5 no. is: "+sum);
        System.out.println("The average is: "+avg);


    }

}
