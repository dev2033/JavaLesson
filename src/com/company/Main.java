package com.company;

public class Main {

<<<<<<< HEAD
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

           int[][] array = new int[][] {{1, 3, 4}, {1, 2, 41, 12}};
           System.out.println(array[0][0]);
=======
//    public static void main(String[] args){
    /*
     * Наследования + конструкторы*/
//        Student Vasya = new Student("Василий", "Рачковский" );
//        Vasya.tell();

    /*
     * Полиморфизм*/
//        Shape[] arr = new Shape[] {new Circle(), new Triangle(), new Square()};
//        for (int i = 0; i < arr.length; i++){
//            arr[i].draw();
//        }


//    }

//    public static void main(String[] args) {
//        /*
//        * Анонимные классы и вложенные классы*/
//        Computer comp = new Computer();
//        comp.i7.start();
//        comp.samsung.start();
//        comp.samsung.shutDown();
//
//        new Computer(){
//            void superPC () {
//                this.i7.start();
//                this.samsung.shutDown();
//            }
//        };
//    }

    /*
    * Абстрактные классы
    * */
//    public static void main(String[] args) {
//        AbstractShape circle = new AbsExstCircle();
//        circle.draw();
//    }


    public static void main(String[] args) {

>>>>>>> ebb8ecafd0c6e096874b6ec8db17dfbc6a25b983
    }
}