package sample1;

public class Array {


	//	.Write a java program to display sum and average of given array.
	// Write a java program to display the given array in reverse order.
	static int myArray[] = new int[4];
	
	public static void initialize(){
		myArray = new int[] {10,20,30,40,50,60,71,80,90,91 };
	}	
	public static int sum(){
		int sum=0;
		for(int i=0;i<myArray.length;i++){
			sum=sum+myArray[i];
		}
		System.out.println("sum is "+sum);
		return sum;
	}
	public static void avg(){
		System.out.println("avg is "+sum()/myArray.length);
	}
	public  static void reverse(){
		for(int i=myArray.length-1; i>=0; i--){
			System.out.println(myArray[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		myArray[0]=10;
		myArray[1]=20;
		myArray[2]=30;
		myArray[3]=40;
		//myArray[4]=40;     java.lang.ArrayIndexOutOfBoundsException:
		initialize();
		sum();
		avg();
		reverse();
	}

}
