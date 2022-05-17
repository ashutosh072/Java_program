

	
public class RverseSring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  String str= "Geeks", nstr="";
	        char ch;
	       
	      System.out.print("Original word: ");
	      System.out.println("Geeks"); //Example word
	       
	      for (int i=0; i<str.length(); i++)
	      {
	        ch= str.charAt(i); //extracts each character
	        nstr= ch+nstr; //adds each character in front of the existing string
	        
//	        g
//	        eg
//	        eeg
//	        keeg
//	        skeeG
	      }
	      System.out.println("Reversed word: "+ nstr);
	    }

//		 String input = "Geeks for Geeks";
//		 
//	        StringBuilder input1 = new StringBuilder(input);
//	 
//	        // append a string into StringBuilder input1
//	       
//	 
//	        // reverse StringBuilder input1
//	        input1.reverse();
//	 
//	        // print reversed String
//	        System.out.println(input1);
		
		
////		fabicony sereries 
//		
//		int n1=0, n2 =1 ,n3 , num=0;
//		 	
//		
//		
//		for (int i=0;i<10 ;++i) {
//			n3=n1+n2;
//			System.out.println(n3);
//			n1=n2;
//			n2=n3;
//			
//		}
		
//	    }
		
		
	}


