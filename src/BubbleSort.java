
public class BubbleSort {

	public static void main(String[] args) {
	
			
				int arr[] = { 5,4,7,3,2,9,8};
				
				//outer loop will provide iteration
				for(int i=0;i<arr.length;i++) {
					//inner loop will check item to its next item
					for(int j=0;j<arr.length-1;j++) {
						
						if(arr[j]>arr[j+1]) {
							
							int temp=arr[j];
							arr[j]=arr[j+1];
							arr[j+1]=temp;
						}
					}
				}
				for(int x:arr) {
					System.out.print(x+" ");
				}
			}
	
		//worst case : O(n^2)
		//Best Case : O (n)

		

	}


