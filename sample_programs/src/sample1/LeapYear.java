package sample1;

public class LeapYear {

	//.Writea java program to check the given year is leap year or not
	
	public static void check(int year){
		if(year %4 ==0)
			System.out.println("leap year");
		else
			System.out.println("not leap year");
	}
	
	public static void main(String[] args) {
		int year=2004;
		check(year);
		year=2014;
		check(year);
		
	}

}
