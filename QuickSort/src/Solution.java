
public class Solution {

	public static void main(String[] args) {
		
		int[] arr={1,5,8,4,7,0};
		
		//{1,5,8,4,7,0};
		//{0,			5,8,4,7,1}
		//		1,8,4,7,5
		
			//		8,4,7,5
			//			,8
			//	   7 
		//4,5,
		
		//4
		quicksort(arr,0,arr.length-1);
		for(int a: arr){
			System.out.println(a);
		}
	}

	private static void quicksort(int[] arr, int start, int end) {
		if(start<end){
			return;
		}
		int pivotIndex=partition(arr,start,end);
		quicksort(arr, start, pivotIndex-1);
		quicksort(arr, pivotIndex+1, end);
		
		
	}

	private static int partition(int[] arr, int start, int end) {
		int pivotIndex=start;
		int pivotval=arr[end];
		
		for(int i=0;i<end-1;i++){
			if(arr[i]<=	pivotval){
				
				//swap arr[i] with arr[pivotindex]
				int temp=arr[i];
				arr[i]=arr[pivotIndex];
				arr[pivotIndex]=temp;
			}
			
		}	
		//swap arr[i] with arr[pivotindex]
		int temp=arr[pivotIndex];
		arr[pivotIndex]=arr[end];
		arr[end]=temp;
		return pivotIndex;
	}
}
