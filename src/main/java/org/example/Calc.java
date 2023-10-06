package org.example;

import java.awt.*;

public class Calc {
    public int summ(int a, int b){
        int result;
        result = a + b;
        System.out.printf("Результат сложения %d и %d равен %d \n", a, b, result);
        //System.out.println("Результат сложения " + a + " и " + b + " равен " + result);
        return result;
    };
    public int substraction(int a, int b){
        int result;
        result = a - b;
        System.out.printf("Результат вычитания %d и %d равен %d \n", a, b, result);
        //System.out.println("Результат вычитания " + a + " и " + b + " равен " + result);
        return result;
    }
    //public int multiply(int a, int b){
    //    int result;
    //    result = a * b;
    //    System.out.printf("Результат умножения %d и %d равен %d \n", a, b, result);
        //System.out.println("Результат умножения " + a + " и " + b + " равен " + result);
    //    return result;
    }
    //public int divide(int a, int b){
    //    int result;
    //    result = a / b;
    //    System.out.printf("Результат деления %d и %d равен %d \n", a, b, result);
    //    System.out.println("Результат деления " + a + " и " + b + " равен " + result);
    //    return result;
    //}
//}
