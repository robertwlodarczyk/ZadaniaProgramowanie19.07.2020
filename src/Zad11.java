import java.util.Scanner;

public class Zad11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj słowo");

        String text = scanner.nextLine();
        int dlugosc = 0;
        String text2 = "Nie podano żadnego tekstu";

        while (!text.equals("Starczy")) {

            if (text.isBlank()) {
                System.out.println("Nie podano żadnego tekstu");
            }


            if (dlugosc < text.length()) {
                dlugosc = text.length();
                text2 = text;
            }
            text = scanner.nextLine();

        }
        System.out.println(text2);

    }
}
