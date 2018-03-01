package maximumgain;

import java.util.ArrayList;

public class MaxGain {

	public static void main(String args[]){
		int price[] = {100, 180, 260, 310, 40, 535, 695,70,770};
		System.out.println(getMaxGain(price,price.length));
		
		ArrayList<ArrayList<Integer>> two2array= getMaxGainInfo(price,price.length);
		
		for( ArrayList<Integer>onedArray : two2array){
			
			System.out.println("min="+onedArray.get(0)+" max="+onedArray.get(1));
		}
	
	}
	
	private static ArrayList<ArrayList<Integer>> getMaxGainInfo(int[] price, int length) {
		
		
		ArrayList<ArrayList<Integer>> twodArray= new ArrayList<>();
		int i=0;
		int maxGain=0;
		while(i<length){
	    ArrayList< Integer> onedArray= new ArrayList<>();
			while(i<length-1 && price[i+1]<price[i]){
				i++;
			}
			int min=price[i];
			onedArray.add(min);
			
			if (i == length - 1)
                break;
			
			i++;
			while(i<length-1 && price[i+1]>price[i]){
				i++;
			}
			int max=price[i];
			onedArray.add(max);
			maxGain=maxGain+max-min;
			if (i == length - 1)
                break;
			i++;
			twodArray.add(onedArray);
			
		}
		
		return twodArray;
		
	}
	

	
	private static int getMaxGain(int[] price, int length) {
		
		int i=0;
		int maxGain=0;
		while(i<length){
	
			while(i<length-1 && price[i+1]<=price[i]){
				i++;
			}
			int min=price[i];
			if (i == length - 1)
                break;
			i++;
			while(i<length-1 && price[i+1]>=price[i]){
				i++;
			}
			int max=price[i];
			
			maxGain=maxGain+max-min;
			
			if (i == length - 1)
                break;
			i++;
			
		}
		
		return maxGain;
		
	}
	
}
