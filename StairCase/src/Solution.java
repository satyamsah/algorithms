class Solution {
	public int climbStairs(int n) {
    int[] cache= new int[n+1];
        for(int i=0;i<=n;i++){
          cache[i]=-9999;  
        }
    return climbStairsUtil(n,cache);
    
     
    }
    
    int climbStairsUtil(int n,int[] cache){
    	if(n<0){
    		return 0;
    	}
        if(cache[n]==-9999){
              if(n==0){
                 cache[n]=1; 
                 
              }else{
            	  cache[n]= climbStairsUtil(n-2,cache)+climbStairsUtil(n-1,cache);
            	  
              }
             
        }
        return cache[n];
    }
    public static void main(String[] args){
    	Solution s= new Solution();
    	System.out.println(s.climbStairs(4));
    }
}