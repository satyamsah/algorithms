import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1=new int[]{1, 3, 15, 11, 2};
		int[] arr2= new int[]{23, 127, 235, 19, 8} ;
		System.out.println(findSmallestDifference(arr1,arr2));
	}
	static int findSmallestDifference(int arr1[], int arr2[]){
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int pointer1=0;
		int pointer2=0;
		int mindiff=Integer.MAX_VALUE;
		while(pointer1<arr1.length && pointer2<arr2.length){
			int diff=Math.abs(arr1[pointer1]-arr2[pointer2]);
			if(diff<=mindiff){
				mindiff=diff;
			}

			if(arr1[pointer1]<arr2[pointer2]){
				pointer1++;
			}else{
				pointer2++;
			}
				
		}
		return mindiff;
	}
		
}


