/**
 * 
 */
package org.cuatrovientos.Films;

import java.util.Scanner;

/**
 * @author Javier
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Cinema cinema = new Cinema();
		int sessions = 0;
		String name = "Superman";
		String room = "";
		
		
		Scanner	reader = new Scanner(System.in);
		String option =	"";
		Cinema myCinema = new Cinema();
		
		do	{	
			System.out.println("------------ Cinema --------------");
		
		System.out.println("Select one option:\n");
		System.out.println("1. Assign new film");
		System.out.println("2. Deassign film");
		System.out.println("3. List all Rooms");
		System.out.println("4. Exit");
		option = reader.nextLine();	
		
		switch (option) {
		case "1": 
			System.out.println("Please, enter film name");
			name = reader.nextLine();
			System.out.println("Please, enter film sessions");
			sessions = reader.nextInt();
			
			Film myfilm = new Film(name,sessions);
			
			System.out.println("Please, enter room number");
			room = reader.nextLine();
			
			
			myCinema.rooms.put(room, myfilm);
			
			break;
			
		case "2":
			System.out.println("Please, enter room number.");
			room = reader.nextLine();
			myCinema.rooms.put(room, null);
			break;
		case "3":
			for (int i = 0; i<cinema.rooms.size() - 1 ;i++){
				System.out.println();
				System.out.println(myCinema.rooms.get(room).toString() + myCinema.rooms.get(room).readAll());
				
			}
			
			break;
		case "4":
			System.out.println();
			System.out.println("Bye");
			break;
		default:
			System.out.println();
			System.out.println("TRY AGAIN");
			break;
			}
	
		
		} while (!option.equals("4"));
		}}
