package sample1;

public class PrimeNumber {

	/**
	 * @param args
	 */
	//.Write a java program to check the given number is prime numbers
	public static boolean  isPrime(int num){
		if(num==2)
			return true;
		if(num % 2 == 0)
			return false;
		
		for(int i=3 ; i*i<=num ; i=i+2){
			if(num%i == 0)
				return false;
		}
		return true;
		
	}
	public static void main(String[] args) {
		System.out.println(2%2);
		// TODO Auto-generated method stub
		System.out.println(isPrime(10));
		System.out.println(isPrime(15));
		System.out.println(isPrime(11));
		System.out.println(isPrime(90));
		System.out.println(isPrime(111));
		System.out.println(isPrime(3));
		System.out.println(isPrime(2));
		System.out.println(isPrime(19));
		System.out.println(isPrime(109));
	}

}
