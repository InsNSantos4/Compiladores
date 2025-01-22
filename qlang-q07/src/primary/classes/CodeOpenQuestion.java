package classes;
import java.util.Scanner;

import FractionValue;
import QuestionInterface;

public class CodeOpenQuestion implements QuestionInterface {
	private String code;
	private String prompt;
	private String answer;
	
	public CodeOpenQuestion(String c, String p) {
		this.code = c;
		this.prompt = p;
	}
	
	public FractionValue execute() {
		System.out.println(this.prompt);
		Scanner sc = new Scanner(System.in);
		this.answer = sc.nextLine();
		if (this.answer.equals(this.code)) {
			return new FractionValue(1,1);	
		}
		return new FractionValue(0,1);
	}

}
