package Zadanie15;

import java.util.Scanner;

public class Zad15 {

    private Scanner scanner = new Scanner(System.in);

    public Number[] getNumbers() {

        Number[] numbers = new Number[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Podaj liczbę");
            int value = scanner.nextInt();

            boolean find = false;

            for (Number number : numbers) {
                find = isFind(value, number);

            }
            if (!find) {
                numbers[i] = new Number(value, 1);
            }

        }

        return numbers;
    }

    private boolean isFind(int value, Number number) {
        boolean find = false;
        if (number != null && number.getValue() == value) {
            number.setIloscWystapien(number.getIloscWystapien() + 1);
            find = true;
        }
        return find;
    }

    public void printNumbers(Number[] numbers) {
        for (Number number : numbers) {
            if (number != null && number.getIloscWystapien() > 1) {
                System.out.println(number.getValue());

            }

        }


    }
}
