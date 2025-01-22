import util.*;

public class Main {
    private static Result result = new Result();

    public static void main(String[] args) {
        AbstractQuestion q;
        Fraction g;

        q = new HoleQuestion("A atribuição de valor em PIL usa o operador .", ":=");
        g = q.execute();
        result.updateGrade(g);

        q = new OpenQuestion("Defina a estrutura de dados lista ligada.");
        g = q.execute();
        result.updateGrade(g);

        q = new CodeOpenQuestion("Implemente um programa que, pedindo um número inteiro do utilizador com o texto 'Number: ', escreva na consola se este é par (even) ou ímpar (odd).",
                "a");
        g = q.execute();
        result.updateGrade(g);

        result.exportToFile("result.txt");
    }
}
