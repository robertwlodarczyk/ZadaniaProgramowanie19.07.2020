import java.util.Scanner;

public class Zad10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę dodatnią: ");

        int number = scanner.nextInt();
        int signno = String.valueOf(number).length();

        int sum = 0;

        for (int i = 1; i <= signno; i++) {
            sum += number % 10;
            number = number / 10;


        }

        System.out.println(sum);


    }
}
