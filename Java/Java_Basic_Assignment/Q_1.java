package Java_Basic_Assignment;

//Take three numbers from the user and print the greatest number.
//        Test Data
//        Input the 1st number: 25
//        Input the 2nd number: 78
//        Input the 3rd number: 87
//        Expected Output :
//        The greatest: 87


import java.util.Scanner;

public class Q_1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scan.nextInt();
        System.out.println("Enter second number: ");
        int b= scan.nextInt();
        System.out.println("Enter third number: ");
        int c = scan.nextInt();

        if(a>b && a>c){
            System.out.println("The greatest: "+a);
        } else if (b>c) {
            System.out.println("The greatest: "+b);
        } else {
            System.out.println("The greatest: "+c);
        }

    }


}
