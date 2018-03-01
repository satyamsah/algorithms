package coinexchange;

import java.util.ArrayList;
import java.util.Arrays;

 class GreedySatyam {
	
	public static void main(String [] args){

		int deno[] = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
		
		findminnumber(deno,93);
	}

	private static void findminnumber(int[] deno, int val) {
	
		ArrayList<Integer> result= new ArrayList<>();
		Arrays.sort(deno);
		
		int denolength=deno.length;
		for(int i=denolength-1;i>=0;i--){
			
			while(val>=deno[i]){
				val=val-deno[i];
				if(result.contains(deno[i])){
					continue;
				}
				result.add(deno[i]);
			}
		}
		
		for(int i=0;i<result.size();i++){
			System.out.println(result.get(i));
		}
		
	}

}
