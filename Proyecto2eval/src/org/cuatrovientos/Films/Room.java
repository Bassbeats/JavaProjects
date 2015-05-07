/**
 * 
 */
package org.cuatrovientos.Films;

import java.util.Vector;





/**
 * @author Javier
 *
 */
public class Room {
	private String number;
	private Vector<Film> films;
	
	public Room (String number) {
		this.number = number;
	}
	
	public Room (){
		films  = new Vector<Film>();
		
	}
	
	public void	addFilm (Film film) {
		films.add(film);
	}
	
	public boolean removeFilm (int index) {
		if	(index < films.size()) {
			films.remove(index);
			return true;
			}
			else
			{
			return false;
			}
	}
	
	

	public String readAll() {
		String result = "";
	for	(Film film : films) {
	result = result + film.show() +", ";
	}
	return result;
	}

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * @return the films
	 */
	public Vector<Film> getFilms() {
		return films;
	}

	/**
	 * @param films the films to set
	 */
	public void setFilms(Vector<Film> films) {
		this.films = films;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Room [number=" + number + ", films=" + films + "]";
	}

	
}
