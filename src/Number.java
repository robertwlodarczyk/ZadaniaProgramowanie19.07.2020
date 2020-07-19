public class Number { // do zadania 15

    private int value;
    private int iloscWystapien;

    public Number(int value, int iloscWystapien) {           //konstruktor alt+n
        this.value = value;
        this.iloscWystapien = iloscWystapien;
    }

    public int getValue() {
        return value;
    }

    public int getIloscWystapien() {
        return iloscWystapien;
    }

    public void setIloscWystapien(int iloscWystapien) {
        this.iloscWystapien = iloscWystapien;
    }
}
