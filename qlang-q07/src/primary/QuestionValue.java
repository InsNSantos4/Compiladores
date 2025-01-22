public class QuestionValue extends QValue{
    private String question_mode;

    private static QuestionType type = new QuestionType();


    public QuestionValue(String question_mode){
        setQuestionValue(question_mode); 
    }

    @Override
    public QType type(){
        return type;
    }

    @Override
    public void setQuestionValue(String question_mode){
        this.question_mode = question_mode;
    }

    @Override
    public String toString(){
        return "Question "+this.question_mode;
    }

}
