import java.util.Scanner;

public class Zad10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę dodatnią: ");

        int number = scanner.nextInt();
        int number1 = 0;
        int number2 = 0;
        int i = 10;

        if (number < 10) {
            System.out.println(number);
        } else {

            do {
                number1 = number / i;
                number2 = number % 10;
                i *= 10;


            } while (number1 > 0);
        }
        System.out.println(number1 + number2);


    }
}
