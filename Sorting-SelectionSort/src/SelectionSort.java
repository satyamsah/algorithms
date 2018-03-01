
public class SelectionSort {

	
	public static void main(String args[]){
		int arr[] = {12,2,77,89,3,7,33};
		selectionsort(arr);
		
		for( int i: arr){
			System.out.print(i+" ");
		}
		
	}

	private static void selectionsort(int[] arr) {
		for(int i=0;i<arr.length-1;i++){
			int min_index=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[min_index]>arr[j]){
					min_index=j;
				}
			}
			
			int temp=arr[i];
			arr[i]=arr[min_index];
			arr[min_index]=temp;
		}
		
	}
}
