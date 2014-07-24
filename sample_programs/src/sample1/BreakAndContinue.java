package sample1;

public class BreakAndContinue {

	/**
	 * @param args
	 */

//	Write a java program to perform break and continue statements in java
	
	public static void main(String[] args) {
		for(int i=0; i<=1000 ;i++){
			if(i==0)
				continue;
			if(i==5)
				break;
			System.out.println("sqaure of "+i+"is "+i*i );
		}
	}

}
