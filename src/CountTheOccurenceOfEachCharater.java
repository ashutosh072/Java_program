
public class CountTheOccurenceOfEachCharater {
	public static void main(String[] args) {
		int MAX_CHAR = 256;
		int count[] =	new int[MAX_CHAR];
	
		String str 	 	 	  ="aasshhutosh";
		int len = str.length();
		// Initialize count array index

		for (int i = 0; i < len; i++)
			count[str.charAt(i)]++;

		// Create an array of given String size
		char ch[] = new char[str.length()];
		//        System.out.println("ch value is ="+ch);
		for (int i = 0; i < len; i++) {
			ch[i] = str.charAt(i);
			int find = 0;
			for (int j = 0; j <= i; j++) {
				// If any matches found
				if (str.charAt(i) == ch[j])
//				if (ch[i] == ch[j])	
					find++;
			}
			if (find == 1)
				System.out.println(
						"Number of Occurrence of "
								+ str.charAt(i)
								+ " is:" + count[str.charAt(i)]);

		}

		
//	int max_count= 256;	
//	int  count[] = new int[max_count];
//	
//	String str ="askcjsdkvkvwv";
//	int len = str.length();
//	
//	for (int i = 0; i < len; i++) 
//	
//	     count[ str.charAt(i)]++;
//	
//	char ch[] = new char[str.length()];
//	
//	for (int i = 0; i < len; i++) {
//		ch[i]=str.charAt(i);
//		int find =0;
//	for (int j = 0; j <=i ; j++) {
//		ch[j]=str.charAt(j);
//		
//		
//		if (str.charAt(i)==ch[j])
//			find++;
//		
//		
//	}
//	if (find==1)
//	System.out.println("character is = "+ str.charAt(i) +"   count is "+count[str.charAt(i)]);
//		
//	}
		
		
		
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
			
				
		
	
	
//	
	}	

}

