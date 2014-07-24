package sample1;

import java.util.ArrayList;
import java.util.List;

public class FibanociSeries {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num = new ArrayList<Integer>();
		while(true){
			if(num.size()==0)
				num.add(0);
			else if(num.size()==1)
				num.add(0+1);
			else{
				num.add(num.get(num.size()-1)+ num.get(num.size()-2));
			}
			if(num.get(num.size()-1)>=100){
				break;
			}
		}
		System.out.println(num);
		
	}

}
