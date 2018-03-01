package abc;

class Solution {
	
	public static void main(String []arr){
		System.out.println(climbStairs(2));
	}
    public static int climbStairs(int n) {
        if(n==0){
            return 1;
        }
        if(n<0){
        	return 0;

        }
        return climbStairs(n-2)+climbStairs(n-1);
    }
}