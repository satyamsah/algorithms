package naive;


public class BubbleSort {

	public static void main(String [] args){
		int [] arr= {1,2,3123,3,21,31,3};
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1;j++){
				if(arr[j]>arr[j+1]){
					swap(arr,j,j+1);
				}
			}
		}
		
		for( int i=0;i< arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

	private static void swap(int arr[] ,int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
}
