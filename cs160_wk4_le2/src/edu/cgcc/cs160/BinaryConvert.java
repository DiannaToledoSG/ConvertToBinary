package edu.cgcc.cs160;

public class BinaryConvert {
	public static String convert(int i ) {
		String str = "";
		
		if(i == 0) {
			return "0/n1";
		}
		
		while(i > 0 ) {
			int a = i % 2;
			str = a + "" + str;
			i = i/2;
			
		}
		
		return format(str); 
	}
	
	private static String format (String s) {
		char [] cArray = s.toCharArray ();
		
		String sTop = "";
		String sBottom = "";
		
		for(int i =0; i < cArray.length; i++) {
			sTop = sTop + "\t" + cArray[i];
		}
		
		for( int i= cArray.length - 1; i >= 0; i--) {
			sBottom = sBottom + "\t" + (int)Math.pow(2,  i );
			
		}
		
		return sTop.trim() + "\n" + sBottom.trim();
	}
}
