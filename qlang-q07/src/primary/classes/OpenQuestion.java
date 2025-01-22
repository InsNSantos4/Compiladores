package classes;
import java.util.Scanner;

import FractionValue;
import QuestionInterface;

public class OpenQuestion implements QuestionInterface {
	private String prompt;
	private String answer;
	
	public OpenQuestion(String p) {
		this.prompt = p;
	}

	public FractionValue execute() {
		System.out.println(prompt);
		Scanner sc = new Scanner(System.in);
		this.answer = sc.nextLine();
		return null;
	}
}
