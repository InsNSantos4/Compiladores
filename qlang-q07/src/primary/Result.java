import java.util.ArrayList;

public class Result {

    public String name;
    public int id;
    protected FractionValue grade;
    protected ArrayList<QuestionInterface> questions;
    protected ArrayList<FractionValue> grades;

    
    public Result(){
        this.name = "default";
        this.id = 0;
        this.grade = new FractionValue(0, 0);
        this.questions = new ArrayList<QuestionInterface>();
        this.grades = new ArrayList<FractionValue>();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public FractionValue getGrade() {
        return grade;
    }
    public void setGrade(FractionValue grade) {
        this.grade = grade;
    }

    public void upgradeGrade(FractionValue g){
        grades.add(g);
        int num = g.getNum() + this.grade.getNum();
        int den = g.getDen() + this.grade.getDen();

        this.grade.setFractionValue(num,den);
    }

    public void updateQuestion(QuestionInterface question){
        questions.add(question);
    }

    @Override
    public String toString() {
        String result = "Results [name=" + name + ", id=" + id + ", grade=" + grade.fractionValue()*100 + "% ]\n ";
        for (QuestionInterface q : questions) {
            result += "\nQuestion " + q.toString();
            result += "\n------------------------------------------------";
        }
        
        for (FractionValue g : grades) {
            result += "\nGrades " + g.fractionValue()*100 + "% ";
        }
            
        return result;
    }

    

}
