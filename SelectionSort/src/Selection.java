
public class Selection {

	public static void main(String[] args) {
		int[] a = { 2, 7, 4, 1, 5, 3 };
		for (int i = 0; i < a.length-1; i++) {
			int min = a[i];
			int minindex = i;
			for (int j =i+1 ; j < a.length; j++) {
				if (a[j] < min) {
					min = a[j];
					minindex = j;
				}
			}
			int temp=a[i];
			a[i]=a[minindex];
			a[minindex]=temp;
			
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
