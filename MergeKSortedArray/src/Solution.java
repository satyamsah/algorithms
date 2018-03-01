import java.util.PriorityQueue;
import java.util.*;


class ArrayContainer implements Comparable<ArrayContainer>{
	int [] arr;
	int index;
	
	public ArrayContainer(int arr[], int index){
		this.arr=arr;
		this.index=index;
	}
	
	public int compareTo(ArrayContainer c){
		return (this.arr[index]> c.arr[index])?1:-1;
	}
}

class Solution {
	
	public static int[] mergeKSortedArray(int[][] arr) {
		
		PriorityQueue<ArrayContainer> pq= new PriorityQueue<>();
		int outputArrSize=0;
		
		for (int i=0;i<arr.length;i++){
			pq.add(new ArrayContainer(arr[i], 0));
			outputArrSize=outputArrSize+arr[i].length;
		}
		
		
		int [] outputarr= new int [outputArrSize];
		int indexofoutputarr=0;
		
		
		while(!pq.isEmpty()){
			ArrayContainer cantainerarr= pq.poll();
			outputarr[indexofoutputarr]=cantainerarr.arr[cantainerarr.index];
			indexofoutputarr++;
			if(cantainerarr.index+1<cantainerarr.arr.length){
				pq.add(new ArrayContainer(cantainerarr.arr, cantainerarr.index+1));
			}
		}
		return outputarr;
		
		
	}
 
	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 7 };
		int[] arr2 = { 2, 4, 6, 8 };
		int[] arr3 = { 0, 9, 10, 11 };
 
		int[] result = mergeKSortedArray(new int[][] { arr1, arr2, arr3 });
		System.out.println(Arrays.toString(result));
	}
}