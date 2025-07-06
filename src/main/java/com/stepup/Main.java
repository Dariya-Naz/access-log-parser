package com.stepup;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    System.out.println("Введите первое число:");
    int number_1 = new Scanner(System.in).nextInt();
    System.out.println("Введите второе число:");
    int number_2 = new Scanner(System.in).nextInt();


    //сумма int
    int sum=number_1+number_2;
    System.out.println("Сумма: "+sum);
    //разность int
    int difference =number_1-number_2;
    System.out.println("Разность: "+ difference);
    //произведение int
    int proizv=number_1*number_2;
    System.out.println("Произведение: "+proizv);
    //частное double
    double quotient=(double) number_1/number_2;
    System.out.println("Частное: "+ quotient);
        }
    }