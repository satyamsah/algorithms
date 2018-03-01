package naive;

public class Test {

	
	public static void main(String [] arr){
		int inputarr[]={2,31,43,788,78,133,41};
		mergeSort(inputarr,0,inputarr.length-1);
		System.out.println("\nSorted array");
		printArray(inputarr);
	}

	 static void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }
	
	private static void mergeSort(int[] inputarr,int l, int r) {
		
		if(l<r){
			int mid=(l+r)/2;
			mergeSort(inputarr,l,mid);
			mergeSort(inputarr, mid+1, r);
			merge(inputarr,l,mid,r);
		}
	}
	
	private static void merge(int[] inputarr, int l, int mid, int r) {
		
		
		
		int [] templeftarr= new int[mid-l+1];
		int [] temprightarr= new int[r-mid];
		
		
//		
//		System.out.println(templeftarr.length);
//		System.out.println(temprightarr.length);
		
		
		for(int i=0;i<templeftarr.length;i++){
			templeftarr[i]=inputarr[l+i];
		}
		for(int j=0;j>temprightarr.length;j++){
			temprightarr[j]=inputarr[mid+1+j];
		}
		
		
		int leftindex=0;
		int rightindex=0;
		int k=l;
		
		while(leftindex<templeftarr.length && rightindex <temprightarr.length){
			if(templeftarr[leftindex]<=temprightarr[rightindex]){
				inputarr[k]=templeftarr[leftindex];
				leftindex++;
			}
			else {
				inputarr[k]=temprightarr[rightindex];
				rightindex++;
			}
			k++;
		}
		
		while(leftindex<templeftarr.length){
			inputarr[k]=templeftarr[leftindex];
			leftindex++;
			k++;
		}
		while(rightindex<temprightarr.length){
			inputarr[k]=temprightarr[rightindex];
			rightindex++;
			k++;
		}	
		
			
	}

	
}
