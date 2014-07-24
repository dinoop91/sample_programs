package sample2;

public class DivideAndMultiply {

	/**
	 * @param args
	 */
	public static int divide(int num){
		int divide=-1;
		while(num >=0 ){
			num=num-2;
			divide++;
		}
		return divide;
	}
	public static int multiply(int num){
		int multiply=0;
		int count=0;
		while(count!=num){
			multiply=multiply+2;
			count++;
		}
		return multiply;
	}
	public static void main(String[] args) {
		
		// How to divide a number by 2 without using / operator ? 
		System.out.println(divide(2));
		System.out.println(divide(15));
		System.out.println(divide(98));
	
		//How to multiply a number by 2 without using * operator ? 
		System.out.println(multiply(10));
		System.out.println(multiply(11));
		System.out.println(multiply(-1));
	}

}
