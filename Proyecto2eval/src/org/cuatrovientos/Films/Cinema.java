/**
 * 
 */
package org.cuatrovientos.Films;

import java.util.Hashtable;







/**
 * @author Javier
 *
 */
public class Cinema {

	Hashtable<String,Room> rooms = new Hashtable <String, Room>();
	

	
	/**
	 * default constructor
	 */
		public Cinema(){
			
			for (int i = 0; i<5 ;i++){
				Room myRoom = new Room(String.valueOf(i + 1));
				rooms.put(String.valueOf(i + 1), myRoom);
			}
			
		}
		
}
