
public class CollectionSort {

public static void main(String[] args) {
		
		int arr[] = { 5,4,7,3,2,9,8};
		//outer loop will hold single element
		for(int i=0;i<arr.length;i++) {
			//now assuming current i index element is
			//minimum element
			int min_pos=i;
			//this loop will iterate over array
			//find minimum value element's index
			for(int j=i;j<arr.length;j++) {
				if(arr[j]<arr[min_pos]) {
					//now minimum no. position i.e min_pos
					//will be set to new minimum element
					min_pos=j;
				}
			}
			//swapping
			int temp=arr[min_pos];
			arr[min_pos]=arr[i];
			arr[i]=temp;
		}
		for(int x:arr) {
			System.out.print(x+" ");
		}
	}
	

}
//Worst Case : O(n^2)
//Best Case : O(n)

