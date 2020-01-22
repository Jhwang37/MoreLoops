package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("----------------------");
        System.out.println("1. Print numbers 1- 10");
        System.out.println("----------------------");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("-----------------------");
        System.out.println("2. Write 1 - 10 backwards");
        System.out.println("-----------------------");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("------------------------------");
        System.out.println("3. Print odd numbers from 1-20");
        System.out.println("------------------------------");
        for(int i = 1; i <= 20; i++){
            if(i % 3 == 0){
                System.out.println(i);
            }
        }
        System.out.println("-----------------------------------");
        System.out.println("4. Print all even numbers from 1-20");
        System.out.println("-----------------------------------");
        for(int i = 1; i <=20; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
        System.out.println("------------------------");
        System.out.println("5. Print user value to 1");
        System.out.println("------------------------");
        System.out.println("Enter a number: ");
        int input = scan.nextInt();
        for(int i = input; i >= 1; i--){
            System.out.println(i);
        }

        System.out.println("------------------------");
        System.out.println("6. Sum all values from 1-10");
        System.out.println("------------------------");
        int sum = 0;
        for(int i = 1; i <= 10; i++){
            sum = i + sum;
            System.out.println(sum);
        }

        System.out.println("---------------------------------");
        System.out.println("7. Sum all values from user input");
        System.out.println("---------------------------------");
        System.out.println("Enter a number: ");
        int input1 = scan.nextInt();
        int sum1 = 0;
        for(int i = input1; i >= 1; i--){
            sum1 = i + sum1;
            System.out.println(sum1);
        }

        System.out.println("----------------");
        System.out.println("8. Print pattern");
        System.out.println("----------------");
        for(int i = 0;i <= 3; i++){
            System.out.println("**********");
        }

        System.out.println("-----------------");
        System.out.println("8b. Print pattern");
        System.out.println("-----------------");
        int i, j;
        for(i = 0; i < 5; i++){
            for(j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("-----------------");
        System.out.println("8c. Print pattern");
        System.out.println("-----------------");
        int k, l;
        for(k = 5; k >= 0; k--){
            for(l = 0; l <=k; l++){
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println("------------------------");
        System.out.println("9. Factorial of a number");
        System.out.println("------------------------");
        System.out.println("Enter a number to get the factorial: ");
        int i1;
        int fact = 1;
        int input3 = scan.nextInt();
        for(i1 = input3; i1 >=1; i1--){
            fact = fact * i1;
            System.out.println(fact);
        }
    }
}
