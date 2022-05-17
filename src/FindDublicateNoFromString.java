
public class FindDublicateNoFromString {

	public static void main(String[] args) {
		
//		String str = "aabccddefghtuuuuuuuuuuuuuu";
//		int count ;
//		char[] string = str.toCharArray();
//		
//		  for(int i = 0; i <string.length; i++) {  
//	            count = 1;  
//	            for(int j = i+1; j <string.length; j++) {  
//	                if(string[i] == string[j] ) {  
//	                    count++;  
//
//	                }  
//	            }  
//	            if(count > 1) { 
//	                System.out.println(string[i]); 
//	              
//	            }
//	        
//	        }  
//		
//	}

		
		
//		2nd methods 
		
		String str = "aabbccddefgh";
	
		  int cnt = 0;
		  char[] inp = str.toCharArray();
		  System.out.println("Duplicate Characters are:");
		  for (int i = 0; i < str.length(); i++) {
		   for (int j = i + 1; j < str.length(); j++) {
		    if (inp[i] == inp[j]) {
		     System.out.println(inp[j]);
		     System.out.print("=="+cnt++);
		     cnt++;
		     break;
		    }
		   }
		  }
		 }
		
		
		
}
