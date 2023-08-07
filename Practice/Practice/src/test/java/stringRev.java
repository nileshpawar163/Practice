import java.util.Scanner;

public class stringRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str;
		System.out.println("Enter the string: ");
	    Scanner scn = new Scanner(System.in);
	    str=scn.nextLine();
	    
	    System.out.println(strRev(str));

	}
	
	public static String strRev(String str)
	{
		//char ch;
		String rev="";
		for(int i=0;i<str.length();i++) {
			rev=str.charAt(i)+rev;
		//rev=ch+rev;
		}
		return rev;
	}

}
