package sample1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LargestNumber {

	/**
	 * @param args
	 */
	//.Write a java program to larger number of given three numbers
	
	public static void largest(){
		try{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the first no");
		int firstNo=Integer.parseInt(br.readLine());
		System.out.println("enter the second no");
		int secondNo=Integer.parseInt(br.readLine());
		System.out.println("enter the third no");
		int thirdNo=Integer.parseInt(br.readLine());
		if(firstNo>secondNo&&firstNo>thirdNo){
			System.out.println("value of a is Bigger"+"\t"+firstNo);
		}
		else if(secondNo>thirdNo){
			System.out.println("value of B is Bigger"+"\t"+secondNo);
		}
		else {
			System.out.println("value of C is Bigger"+"\t"+thirdNo);
		}
		}catch(Exception e){
			e.printStackTrace();
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		largest();
	}

}
