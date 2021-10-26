package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Enter two numbers:");
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input2.nextInt();
        add2Number numbers = new add2Number(number1,number2);
        System.out.println("The addition of the numbers is: " + numbers.add());
    }
}
