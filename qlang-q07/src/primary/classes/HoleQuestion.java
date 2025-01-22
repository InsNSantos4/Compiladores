package classes;
import java.util.Scanner;

import FractionValue;
import QuestionInterface;

public class HoleQuestion implements QuestionInterface {
	private String prompt;
	private String answer;
	private String response;
	public HoleQuestion(String prmpt, String ans) {
		this.prompt = prmpt;
		this.answer = ans;
	}
	
	public FractionValue execute() {
		System.out.println(this.prompt);
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int den = 1;
		this.response = sc.nextLine();
		
		if (this.response.equals(this.answer)) {
			num = 1;// alter numerador to 1 -> resposta certa
		}
		sc.close();
		return new FractionValue(num, den);
	}
	
}
