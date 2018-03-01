
public class Bubble {
	public static void main(String[] args) {
		int[] a = {   2, 7, 4, 1, 5, 3,-3};
		for (int i = 0; i < a.length-i; i++) {
			for (int j =0 ; j < a.length-i-1; j++) {
				if (a[j] > a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int  i:a){
			System.out.print(i+",");
		}

	}

//	private static void swap(int[] a, int i, int minindex) {
//		int temp=a[i];
//		a[i]=a[minindex];
//		minindex=temp;
//		
//	}


}
