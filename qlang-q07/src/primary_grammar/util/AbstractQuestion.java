package util;

import java.util.Scanner;

public abstract class AbstractQuestion {
    protected String question;
    protected static Scanner scanner = new Scanner(System.in);

    public AbstractQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        System.out.println(this.question);
        System.out.print("Answer: ");
        return this.getScanner().nextLine();
    }

    public Scanner getScanner() {
        return scanner;
    }

    public abstract Fraction execute();
}
