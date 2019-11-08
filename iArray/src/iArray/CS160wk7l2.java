package iArray;

public class CS160wk7l2 {

	static int[] iArray = new int[10]; 
	static char[] cArray = new char[26];
	//person array
	static Person[] people = new Person[] {
			new Person (19, "John"),
			new Person(50, "Jane"),
			new Person(30, "Bob"),
			
	};
	
	public static void main(String[] args) {
		
		for(Person p : people) {
			System.out.println(p.name + ": " + p.age);
		}
		
		
		
//		//************letters**************
//		
//		int i = 0;
//		while(i < cArray.length) {
//			cArray[i] = (char)(i + 97);
//			++i;
//			
//			//33 is exclamation mark
//			//97 is A
//			
//		}
//		
//		for ( int j = 0; j < cArray.length; ++j) {
//			System.out.println(cArray[j]);
//			//j<cArray.length = conditional
//			
//		}
		//******numbers**************
		
//		//values
		
//		int i = 0;
//		int count = 1;
//		while(i< iArray.length) {
//				iArray[i] = i* 17;
//				++i;
//		}
		
//		//positions
		
//		for(int j = 0; j < iArray.length; ++j) {
//			System.out.println(iArray[j]);
//
//		
		
		

	}

}
