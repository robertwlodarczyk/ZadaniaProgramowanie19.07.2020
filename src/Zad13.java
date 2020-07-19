import java.util.Scanner;

public class Zad13 {
    private String pobierz() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    private String[] split(String text) {
        return text.split(" ");

    }
    private void wypisz(String[] text) {
        StringBuilder sb = new StringBuilder();


        for (String word : text) {
            sb.append(word)
                    .append(" ")
                    .append(word)
                    .append(" ");

        }
        System.out.println(sb.toString());
    }
    public void run(){
        wypisz(split(pobierz()));
    }
}

