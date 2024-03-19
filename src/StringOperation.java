import java.util.Arrays;

import org.testng.annotations.Test;

public class StringOperation {

	@Test
	public void RverseTringWithCaps() {
		//		I/P: “Today is Friday hi”
		//		O/P: “Hi Friday Is Today”



		String str= "Today is Friday hi";

		String[] input = str.split(" ");
		String l1 = input[0].substring(0,1).toUpperCase()+input[0].substring(1);
		String l2 = input[1].substring(0,1).toUpperCase()+input[1].substring(1);	
		String l3 = input[2].substring(0,1).toUpperCase()+input[2].substring(1);
		String l4 = input[3].substring(0,1).toUpperCase()+input[3].substring(1);

		System.out.println(l4+" "+l3+" "+l2+" "+l1+" ");
	}
	@Test
	public void RverseOpereation() {
		char  ch[] = {'1','2','3','4','5','6','7','9'};
		String s = new String ("Ashutosh");
		System.out.println(s);

		System.out.println(s.charAt(0));

		System.out.println(s.length());
		System.out.println(s.substring(2));
		System.out.println(s.substring(2,4));
		String s2 = "ashutosh";
		System.out.println(s.contains(s2));
		String newName = "ashutosh kumar sharma ";
		System.out.println(s.concat(s2));
		System.out.println(newName.replaceAll("sharma", "Gautam"));
		System.out.println(s.equalsIgnoreCase(s2));
		System.out.println(s.replace("Ashutosh", "ashu"));
		System.out.println(s.toUpperCase());
		System.out.println("new char arry ="+s.toCharArray());
		StringBuilder sb = new StringBuilder("string builder ");
		sb.append("new strng ");
		System.out.println(sb);
		System.out.println("delete ="+sb.delete(1,4));
		String s3 = "krjgnerkgnerk@#$$";
		String format= String.format(s, s3);
		System.out.println(String.format("%s%s",s2,s3));
		String text= new String("Hello, My name is Sachin");  
		String[] sentence = text.split("\\,");
		for(String sen : sentence) {
			System.out.println(sen);
		}
		System.out.println(Arrays.toString(sentence));







	}
}
