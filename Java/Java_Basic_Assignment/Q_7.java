package Java_Basic_Assignment;

import java.util.Scanner;

public class Q_7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = s.nextInt();
        if(num>0){
            System.out.println("Number is positive");
        }else {
            System.out.println("Number is negative");
        }
    }
}
