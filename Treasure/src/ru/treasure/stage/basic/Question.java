package ru.treasure.stage.basic;

public class Question {

	//переменные для вопроса
	private String question;
	private String answer;
	private String firstHint;
	private String secondHint;
	private String thirdHint;
	
	public Question(String question, String answer, String firstHint, String secondHint, String thirdHint) {
		setQuestion(question);
		setAnswer(answer);
		setFirstHint(firstHint);
		setSecondHint(secondHint);
		setThirdHint(thirdHint);
	}
	
	//проверяем правильный ли дан ответ
	public boolean checkAnswer (String attempt) {
		if (answer.toLowerCase().equals(attempt.toLowerCase()))
			return true;
		return false;
	}
	
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getFirstHint() {
		return firstHint;
	}
	public void setFirstHint(String firstHint) {
		this.firstHint = firstHint;
	}
	public String getSecondHint() {
		return secondHint;
	}
	public void setSecondHint(String secondHint) {
		this.secondHint = secondHint;
	}
	public String getThirdHint() {
		return thirdHint;
	}
	public void setThirdHint(String thirdHint) {
		this.thirdHint = thirdHint;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
}
