package org.cuatrovientos.examen;

import java.util.Scanner;

/**
 * 
 */

/**
 * @author Javier
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// variables for new questions
		Scanner reader = new Scanner(System.in);
		String answer = "";
		String wording = "";
		Question question = null;
		
		int index = 0;
		String option = "";
		
		Questionary questionary = new Questionary();
		
		do {
			System.out.println("************ Questionary ***********");
			System.out.println("Select one option:\n");
			System.out.println("1. Add new question");
			System.out.println("2. Delete question");
			System.out.println("3. Show random question");
			System.out.println("4. Check Answer to a question");
			System.out.println("5. Show all questions");
			System.out.println("6. Exit");
			option = reader.nextLine();
			
			switch (option) {
				case "1":
					System.out.println("Please, enter question wording");
					wording = reader.nextLine();
					System.out.println("Please, enter question answer");
					answer = reader.nextLine();
					question = new Question(wording,answer);
					questionary.addQuestion(question);
					System.out.println("Question " + wording + " added");
					break;
				case "2":
					System.out.println("Please, enter index	number of the question");
					index = reader.nextInt();
					questionary.deleteQuestion(index);
					System.out.println("Question deleted");
					break;
				case "3":
					System.out.println(questionary.showRandom().toString());
					break;
				case "4":
					System.out.println("Please, enter question index");
					index = reader.nextInt();
					System.out.println("Please, enter the answer to be checked");
					answer = reader.nextLine();
					if (questionary.checkAnswer(index, answer) == true) {
						System.out.println("The answer is correct");
					} else {
						System.out.println("The answer is incorrect");
					} 
					break;
				case "5":
					System.out.println(questionary.showAll());
					break;
				case "6":
					System.out.println();
					System.out.println("Bye");
					break;
				default:
					System.out.println();
					System.out.println("TRY AGAIN");
					break;
			}
			} while (!option.equals("6"));
		
	}

}
