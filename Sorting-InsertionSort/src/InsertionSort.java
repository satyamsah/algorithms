
public class InsertionSort {

	
	public static void main(String args[]){
		int arr[] = {12,2,77,89,3,7,33};
		insertionSort(arr);
		
		for( int i: arr){
			System.out.print(i+" ");
		}
		
	}
	static void insertionSort(int[] arr){
	
		for(int i=1;i<arr.length;i++){
			int val=arr[i];
			int hole=i;
			while(hole>0 && arr[hole-1]>val){
				
				arr[hole]=arr[hole-1];
				hole=hole-1;
				
			}
			arr[hole]=val;
		}
	}
}
