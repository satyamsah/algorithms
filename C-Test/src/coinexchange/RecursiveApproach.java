package coinexchange;

public class RecursiveApproach {

	
	public static void main(String[] str){
		
		int coins[] = {9, 6, 5, 1};
	    int V = 11;
	   
	    
	    System.out.println(minimumCoins(coins,V));
	}

	private static int minimumCoins(int[] coins, int V) {
			
		if(V==0){
			return 0;
		}
		int res=Integer.MAX_VALUE;
		for(int i=0;i<coins.length;i++){
			
			if(coins[i]<=V){
				int subprob=minimumCoins(coins, V-coins[i]);
				if(subprob!=Integer.MAX_VALUE && subprob+1<res){
					res=subprob+1;
				}
			}	
		}
		return res;
	}
	
}
