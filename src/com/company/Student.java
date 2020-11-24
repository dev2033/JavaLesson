package com.company;

public class Student extends Person {
    /*
    * Конструктор класса*/
    /*
     *Ключевое слово super нужно чтобы обращаться
     * к основному классу из класса наследника */

    public Student (String FirstName, String SecondName) {
        super(FirstName, SecondName);
    }

    void tell () {
        System.out.println(super.firstName);
        System.out.println(super.secondName);
    }
}
