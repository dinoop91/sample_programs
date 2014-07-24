package sample1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchStatement {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	// Write a java program to display day of the week for the given number(switch statement) 
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("enter number");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int no=Integer.parseInt(br.readLine());
		switch (no) {
		case 1: System.out.println("sunday");
			break;
		case 2: System.out.println("monday");
			break;
		case 3: System.out.println("tuesday");
		break;
		case 4: System.out.println("wed day");
		break;
		case 5: System.out.println("thurs day");
		break;
		case 6: System.out.println("friday");
		break;
		case 7: System.out.println("sat day");
		break;
		

		default: System.out.println(" invalid");
			break;
		}
	}

}
