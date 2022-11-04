package Java_Basic_Assignment;

import java.util.Scanner;

public class Q_9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1 = s.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = s.nextInt();
        System.out.println("Enter 3rd number: ");
        int num3 = s.nextInt();

        if(num1>num2 && num2>num3){
            System.out.println("Decreasing order");
        } else if (num1<num2 && num2 < num3) {
            System.out.println("Increasing order");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
