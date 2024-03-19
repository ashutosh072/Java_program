import java.util.ArrayList;
import java.util.HashSet;

public class Practice {

	public static void main(String[] args) {
		String str  = "aabbccddegh";
		int []count = new int [256];
		
		int len = str.length();
		for (int i = 0; i < len; i++) 

			count[str.charAt(i)]++;
		char []ch= new char [str.length()];
		for (int i = 0; i < str.length(); i++) {
			ch[i] =  	str.charAt(i);
			int find =0;
			for (int j = 0; j <=i; j++) {
				ch[j] =  	str.charAt(j);
				if(str.charAt(i)==ch[j])
					find++;
			}
			if(find==1) 
				System.out.println("charatect is "+str.charAt(i)+" and count is ="+count[str.charAt(i)]);
		}
	}
}

	

