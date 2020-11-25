package com.company;

/*
* Анонимные и вложенные классы*/

public class Computer {
    class Processor {
        private boolean isStart = false;

        public void start () {
            isStart = true;
        }

        public void shutDown () {
            isStart = false;
        }
    }

    class RAM {
        private boolean isStart = false;

        public void start () {
            isStart = true;
            System.out.println("Компьютер включен");
        }

        public void shutDown () {
            isStart = false;
            System.out.println("Компьютер перезагрузился");
        }
    }

    Processor i7 = new Processor();
    RAM samsung = new RAM();
}
