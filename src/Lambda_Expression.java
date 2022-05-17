import java.util.ArrayList;

public class Lambda_Expression {

	
	
	
	
	public static void main(String[] args) {

		ArrayList list = new ArrayList<Integer>();

		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		//System.out.println(list);


		list.forEach( i ->System.out.println(i));
		System.out.println("hi");

	}

}
