package week5.practicum4;

import java.io.Serializable;

public class Leerling implements Serializable{
    private String naam;
    private double cijfer;

    public Leerling(String name) {
        naam = name;
    }

    public String getNaam() {
        return naam;
    }

    public void setCijfer(double grade) {
        cijfer = grade;
    }

    public double getCijfer() {
        return cijfer;
    }

    public String toString() {
        return naam + " heeft cijfer: " + cijfer;
    }
}