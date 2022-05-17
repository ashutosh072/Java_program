import java.util.Arrays;
public class Second_LargestNo {
	
//	 static int secondHighest(int... nums) {
//		    int high1=0;
//		    int high2 =0;
//		   
//		    for (int num : nums) {
//		      if (num > high1) {
//		        high2 = high1;
//		        high1 = num;
//		      } else if (num > high2) {
//		        high2 = num;
//		      }
//		    }
//		    return high2;
//		 }
//	public static void main(String[] args) {
//		int arr[]= {10,20,30,40,40,4050};
//	System.out.println(	secondHighest(arr));
//		
//		}
	
	public static void main(String[] args) {
	int[] randomIntegers = {1, 5, 4, 2, 8, 1, 1, 6, 7, 8, 9};
    Arrays.sort(randomIntegers);
    System.out.println(randomIntegers[randomIntegers.length-2]);
	
	
	}
}