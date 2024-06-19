import java.util.ArrayList;

public class Question {
String question;
ArrayList<String> choice;
int answer;

	public Question(String question, ArrayList<String> choice,int answer) {
		this.question=question;
		this.choice=choice;
		this.answer=answer;
		
	}

	/**
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * @return the choice
	 */
	public ArrayList<String> getChoice() {
		return choice;
	}

	/**
	 * @return the answer
	 */
	public int getAnswer() {
		return answer;
	}

	/**
	 * @param question the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}

	/**
	 * @param choice the choice to set
	 */
	public void setChoice(ArrayList<String> choice) {
		this.choice = choice;
	}

	/**
	 * @param answer the answer to set
	 */
	public void setAnswer(int answer) {
		this.answer = answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
