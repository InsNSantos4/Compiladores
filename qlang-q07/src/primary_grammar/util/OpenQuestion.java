package util;

public class OpenQuestion extends AbstractQuestion {

    public OpenQuestion(String question) {
        super(question);
    }

    @Override
    public Fraction execute() {
        String answer = this.getAnswer();

        return null;
    }
}
