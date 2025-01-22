package util;

import java.io.FileWriter;
import java.io.IOException;

public class Result {
    String name;
    String id;
    Fraction grade;

    public Result() {
        this.name = "";
        this.id = "";
        this.grade = null;
    }

    public void updateGrade(Fraction grade) {
        if (grade != null) {
            if (this.grade == null) {
                this.grade = grade;
                return;
            }
            this.grade.add(grade);
            this.grade.incDenominator();
        }
    }

    public void exportToFile(String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Name: " + name + "\n");
            writer.write("ID: " + id + "\n");
            writer.write("Grade: " + grade.toString() + "\n");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public Fraction getGrade() {
        return grade;
    }
}
