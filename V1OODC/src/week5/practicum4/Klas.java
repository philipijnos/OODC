package week5.practicum4;
import java.io.Serializable;
import java.util.ArrayList;

public class Klas implements Serializable {
    private String klascode;
    private ArrayList<Leerling> deKlas;

    public Klas(String classCode) {
        klascode = classCode;
        deKlas = new ArrayList<Leerling>();
    }

    public void voegLeerlingToe(Leerling student) {
        if(student != null) {
            deKlas.add(student);
        }
        else {
            System.out.println("Student is null");
        }
    }

    public void wijzigCijfer(String studentName, double newGrade) {
        for(Leerling student : deKlas) {
            if(student.getNaam().equals(studentName)) {
                student.setCijfer(newGrade);
                break;
            }

        }
    }
    public ArrayList<Leerling> getLeerlingen() {
        return deKlas;
    }
    public int aantalLeerlingen() {
        return deKlas.size();
    }

    public String toString() {
        String s = "In klas " + klascode + " zitten de volgende leerlingen:" + "\n";
        for(Leerling studenten : deKlas) {
            s += studenten + "\n";
        }
        return s;
    }
}