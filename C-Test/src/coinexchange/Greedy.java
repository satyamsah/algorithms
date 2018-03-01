package coinexchange;

import java.util.ArrayList;

class Greedy{
	public static void main(String [] args){
		//All denominations of Indian Currency
		int deno[] = {1, 2, 5, 10, 20, 50, 100, 500, 1000};

		findMin(93,deno);
	}

	static void findMin(int V,int [] deno){
		 // Initialize result
		 ArrayList<Integer> ans=new ArrayList<>();

		 // Traverse through all denomination
		 for (int i=deno.length-1; i>=0; i--) {
		     // Find denominations
		     while (V >= deno[i]){
		       V=V-deno[i];
		        ans.add(deno[i]);
		     }
		 }

		 // Print result
		 for (int i = 0; i < ans.size(); i++){
			 System.out.println(ans.get(i));
		 }
		       
		}

}

