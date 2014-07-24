package sample1;

public class EvenOdd {

	//Write a java program to check the given number is Even-Odd. 
	
	
	/**
	 * @param args
	 */
	public String check1(int num){
		if(num % 2 == 0)
			return "even";
		else
			return "odd";
	}
	public String check2(int num){
		while(num >1){
			num=num-2;
		}
		if(num ==1)
			return "odd";
		else
			return "even";
	}
	
	public static void main(String[] args) {
		EvenOdd ex1= new EvenOdd();
			System.out.println(ex1.check1(4));
			System.out.println(ex1.check1(9));
			
			System.out.println(ex1.check2(11));
			System.out.println(ex1.check2(8));
	}

}
