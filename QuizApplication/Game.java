package com.QuizApplication;

public class Game {

	Question[] questions = new Question[5];
	Player player = new Player();
	String[] questionsData = { "Who is the founder of Apple?", "Who is the founder of Microsoft?",
			"Who is the founder of Facebook?", "Who is the founder of Google?", "Who is the founder of Amazon?" };

	String[] option1 = { "LarryPage", "Mark", "Satya Nadella", "Larrypage", "Steve Jobs" };
	String[] option2 = { "Tim Cook", "Bill Gates", "Jack Ma", "Harry", "Bill Gates", "Satya Nadella" };
	String[] option3 = { "Steve Jobs", "Sundar Pichai", "Bran Jhonson", "Sundar Pichai", "Jeff Bezoz" };
	String[] option4 = { "Elon Musk", "Warren Buffet", "Mark Zuckerburg", "Steve Jobs", "Tim Cook" };
	int[] answers = { 3, 2, 4, 1, 3 };

	public void init() {
		for (int i = 0; i < 5; i++) {
			questions[i] = new Question();
		}
		for (int i = 0; i < 5; i++) {
			questions[i].question = questionsData[i];
			questions[i].option1 = option1[i];
			questions[i].option2 = option2[i];
			questions[i].option3 = option3[i];
			questions[i].option4 = option4[i];
			questions[i].correctAnswer = answers[i];
		}
	}

	public void play() {
		player.getDetails();
		for (int i = 0; i < 5; i++) {
			boolean status = questions[i].askQuestion();
			if (status == true) {
				System.out.println("Correct Answer!");
				player.score++;
			} else {
				System.out.println("Wrong Answer!");
				System.out.println("Right Answer is option:" + answers[i]);
			}
		}
		System.out.println(player.name + ", your score is " + player.score + "/5");
	}
}
