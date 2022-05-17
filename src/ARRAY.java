
public class ARRAY {

	public static void main(String[] args) {
		int count =0;
		int sum=0;
		int []a = {1,2,3,4,5,6,7,78,90};
		for (int i = 0; i <a.length; i++) {
			System.out.println(a[i]);
			count++;
	    sum = count +a[i];
			
			
		}
		System.out.println("sumation ="+sum);
	}

}
