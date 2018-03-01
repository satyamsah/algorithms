package abcd;

import java.util.Arrays;

public class Solution {

	    public static void main(String[] args)
	    {
	    	int []a={5,6,8,5,8};
	    	System.out.println(countMoves(a));
	    	
	    	
	    }


	    public static int countMoves(int[] numbers) {
	        
	         int cnt=0;
		        while(true){
		            Arrays.sort(numbers);
		            if (checkallElementsEqual(numbers)==true){
		                return cnt;
		            }
		            else{
		                for(int i=0;i<numbers.length-1;i++){
		                    numbers[i]=numbers[i]+1;
		                }
		                cnt++;
		            }
		            
		        }
	    }
	    

		  static boolean checkallElementsEqual(int [] numbers){
		      for(int i=0;i< numbers.length-1;i++){
		          if(numbers[i]==numbers[i+1]){
		              continue;
		          }
		          else{
		              return false;
		          }
		      }
		      return true;
		      
		  }

	}