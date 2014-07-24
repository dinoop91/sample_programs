package sample1;

public class StringReverse {

	/**
	 * @param args
	 */
	public static String reverseIt(String source) {
	    int i, len = source.length();
	    StringBuffer dest = new StringBuffer(len);

	    for (i = (len - 1); i >= 0; i--)
	      dest.append(source.charAt(i));
	    return dest.toString();
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	
	String string="whatever";
	String reverse = new StringBuffer(string).reverse().toString();
	System.out.println(reverse);
	System.out.println(reverseIt("dinoop"));

	}

}
