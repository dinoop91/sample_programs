package sample1;

public class Palindrome {

	//.Write a java program to check the given number is palindrome.
	
	public static String check(String value){
		for(int i=0, j=value.length()-1; i<value.length(); i++,j-- ){
			if(value.charAt(i) != value.charAt(j) ){
				return "not palindrom";
			}
		}
		return "palindrom";
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(check("india"));
		System.out.println(check("malayalam"));
	}

}
