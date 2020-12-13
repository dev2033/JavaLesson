package com.company;
import java.util.Scanner;


public class Lesson {

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

        /*"""Массивы"""

        // int[] name = new int[] {23, 45, 74};    // полная инициализация массива
        // System.out.println(name[1]);

        int [] a;
        int n;
        Scanner in = new Scanner(System.in);    // Создаем объект in класса Scanner
        System.out.print("Enter numbers of array: ");
        n = in.nextInt();                       // Присваиваем переменной n ввод данных от пользователя
        a = new int [n];                        // В зависимости какое число ввел пользователь,
                                                // в переменную a отводиться память под массив
        // Далее через цикл мы просим у пользователя заполнить массив
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a[" + i + "] = ");
            a[i] = in.nextInt();
        }
            */

        /*"""Многомерные массивы"""*/
        // грубо говоря, многомерный массив - это массив в массиве.
//       float[] array = new float[] {2.3f, 123.423f, 43.43f, 12.323f};   // одномерный массив
//       char[][] arr = new char[2][3];
//       arr[0][0] = 'C';

        /*
         * Функции
         * */
//        int temp = func(3, 4);
//        System.out.println(temp);
    }
//    public static int func(int a, int b) {
//        int result = 1;
//        for(int i = 0; i < b; i++) {
//            result *= a;
//        }
//        return result;
//    }
}
