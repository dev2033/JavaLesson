package com.company;

public class Person {
    public int height = 180;
    public String firstName;
    public String secondName;

    public Person(String FirstName, String SecondName) {
        firstName = FirstName;
        secondName = SecondName;
    }

    public void say(String name){
        System.out.println("Hello " + name);
    }
}
