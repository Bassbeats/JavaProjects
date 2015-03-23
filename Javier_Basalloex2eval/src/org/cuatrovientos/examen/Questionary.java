/**
 * 
 */
package org.cuatrovientos.examen;

import java.util.Random;
import java.util.Vector;

/**
 * @author Javier Basallo
 * Represents a Questionary with questions
 */
public class Questionary {
	private Vector<Question> questions;

	/**
	 * @param questions
	 * default constructor, inits vector of questions
	 */
	public Questionary() {
		questions = new Vector<Question>();
	}
	/**
	 * adds a question
	 * @param question
	 */
	public void addQuestion (Question question) {
		questions.add(question);
		}
	/**
	 * removes a question from the Vector
	 * @param question
	 */
	public boolean deleteQuestion (int index) {
		if (index < questions.size()) {
			questions.remove(index - 1);
			return true;
		} else {
			return false;
		}
	}
	/**
	 * extracts a random question from vector
	 * @return a random question
	 */
	public Question showRandom(){
		Random random = new Random();
		int index = random.nextInt(questions.size());
		
		return questions.elementAt(index);
	}
	/**
	 * Checks if the answer the user enters to a question is correct
	 * @param index
	 * @param answer
	 * @return if the answer was correct, true, if not, false
	 */
	public boolean checkAnswer(int index, String answer){
		if (questions.elementAt(index).getAnswer() == answer) {
			return true;
		} else {
			return false;
		} 
		
		
	}
	/**
	 * shows all the questions
	 * @return
	 */
	public String showAll() {
		String result = "";
		for (Question question: questions) {
		result = result + question.toString() + "\n";
		}
		return result;
		}
	
	
}

