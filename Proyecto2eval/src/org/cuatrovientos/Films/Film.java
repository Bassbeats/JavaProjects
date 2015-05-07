/**
 * 
 */
package org.cuatrovientos.Films;

/**
 * @author Javier
 *
 */
public class Film extends Room {
	private String name;
	private int session;
	
	public Film(String name, int session) {
		this.name = name;
		this.session = session;
	}
	public String show () {
	return String.valueOf(session) + " " + name;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the session
	 */
	public int getSession() {
		return session;
	}
	/**
	 * @param session the session to set
	 */
	public void setSession(int session) {
		this.session = session;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Film [name=" + name + ", session=" + session + "]";
	}
	
	
}
