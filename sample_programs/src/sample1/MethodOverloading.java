package sample1;

public class MethodOverloading {

	/**
	 * @param args
	 */
	static int area=0;
	public static void area(int a){
		area=a*a;
		System.out.println("area is "+area);
	}
	public static void area(int a, int b){
		area=a*b;
		System.out.println("area is "+area);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		area(6);
		area(3,7);
	}

}
