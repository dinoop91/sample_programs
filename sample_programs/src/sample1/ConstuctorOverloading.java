package sample1;

public class ConstuctorOverloading {

	static int a=10;
	ConstuctorOverloading(){
		System.out.println("no param");
	}
	ConstuctorOverloading(String param){
		System.out.println("one param "+param);
	}
	ConstuctorOverloading(String param1, String param2){
		System.out.println("two params "+param1+param2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstuctorOverloading c1 = new ConstuctorOverloading();
		ConstuctorOverloading c2 = new ConstuctorOverloading("abcd");
		ConstuctorOverloading c3= new ConstuctorOverloading("abcd", "efgh");
		
	}
	
}
