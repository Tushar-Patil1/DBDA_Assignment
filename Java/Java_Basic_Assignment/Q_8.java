package Java_Basic_Assignment;

import java.util.Scanner;

public class Q_8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = s.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = s.nextInt();
        System.out.println("Enter 3rd number: ");
        int c = s.nextInt();
        if(a==b && a==c && b==c){
            System.out.println("All numbers are equal");
        }else if (a!=b && a!=c && b!=c){
            System.out.println("All no. are different");
        }else{
            System.out.println("Neither All are equal nor different");
        }
    }
}
