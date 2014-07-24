package sample2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Date {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		//Convert a given string as "11/12/2010" to a Date object. 
		String  dateStr= "11/12/2010";
		SimpleDateFormat smp= new SimpleDateFormat("dd/MM/yyyy");
		java.util.Date date = smp.parse(dateStr);
		System.out.println(date);
		
		//Find out the number of days in between two  given dates ? 
		
		java.util.Date date2 = smp.parse("15/12/2010");
		System.out.println(date2);
		
	
	}

}
