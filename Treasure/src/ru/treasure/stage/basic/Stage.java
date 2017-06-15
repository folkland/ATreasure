package ru.treasure.stage.basic;

public class Stage {

	private int id;
	private Question question;
	
	private final int minGold = 40;
	private final int bonus = 10;
	
	public Stage(int id, Question question) {
		setId(id);
		setQuestion(question);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
}
