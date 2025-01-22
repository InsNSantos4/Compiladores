package util;

public class HoleQuestion extends AbstractQuestion {
    private String ans;

    public HoleQuestion(String question, String ans) {
        super(question);
        this.ans = ans;
    }

    @Override
    public Fraction execute() {
        String answer = this.getAnswer();

        if (answer.equals(this.ans)) {
            return new Fraction(1, 1);
        } else {
            return new Fraction(0, 1);
        }

    }
}
