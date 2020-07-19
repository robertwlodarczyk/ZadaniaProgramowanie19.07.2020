package Zadanie15;

import Zadanie15.Number;
import Zadanie15.Zad15;

public class Main {

    public static void main(String[] args) {

//        Zad13 zad13 = new Zad13();
//        zad13.run();

        // zad 15

        Zad15 zad15 = new Zad15();
        Number[] numbers = zad15.getNumbers();
        zad15.printNumbers(numbers);

    }
}
