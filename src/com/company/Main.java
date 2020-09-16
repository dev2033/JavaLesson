package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    /*"""Scanner - получение данных от пользователя"""
	    * """Математические операции"""

        Scanner str = new Scanner(System.in);
        float num1, num2, result;
        System.out.print("Введите число a = ");
        num1 = str.nextFloat();
        System.out.print("Введите число b = ");
        num2 = str.nextFloat();
        result = num1 + num2;
        System.out.print("Ответ: " + result);

	     */



                /*"""Условные операторы"""

        Scanner str = new Scanner(System.in);
        int a, b, c;
        System.out.print("Введите число a = ");
        a = str.nextInt();
        System.out.print("Введите число b = ");
        b = str.nextInt();
        System.out.print("Введите число c = ");
        c = str.nextInt();
        if(a > b && c > b){
            System.out.println(a + " больше чем " + b + " и " + c + " больше чем " + b);
        }else {
            System.out.println("Такого условия я не знаю!!");
        }

        //Конструкция switch case

        Scanner str = new Scanner(System.in);
        int a, b;
        System.out.print("Введите число(от 1 до 3х) a = ");
        a = str.nextInt();
        System.out.print("Введите число b(от 1 до 3х) = ");
        b = str.nextInt();

        switch (a){     //проверка a
            case 1:     // если a = 1
                System.out.println("Вы ввели: a = " + a);  //то выводим в консоль это
                break;          //заканчиваем кейс
            case 2:
                System.out.println("Вы ввели: a = " + a);
                break;
            case 3:
                System.out.println("Вы ввели: a = " + a);
                break;
            default:    //если ни один кейс не попал, то выводим дефолт
                System.out.println("Такого условия нет!!!");
        }
        //если код повоторяется его можно сократить вот так:
        switch (b) {
            case 1:
            case 2:
            case 3:
                System.out.println("Вы ввели: b = " + b);
                break;
            default:
                System.out.println("Такого условия нет!!!");
        }
        */




    }
}
