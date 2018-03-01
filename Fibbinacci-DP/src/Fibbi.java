
public class Fibbi {
	static int n=10;
	static int[]cache= new int[n+1];
	public static void main(String[] args) {
		initialize(cache);
		System.out.println(fib(n));
	}
	static void  initialize(int[] cache){
		for(int i=0;i<cache.length;i++){
			cache[i]=Integer.MAX_VALUE;
		}
	}
	private static int fib( int n) {
		
		if(n<=1){
			if(cache[n]==Integer.MAX_VALUE){
				cache[n]=n;
			}
			return cache[n];
		}else{
			if(cache[n]==Integer.MAX_VALUE){
				cache[n]=fib(n-1)+fib(n-2);
			}
			return cache[n];
		}
		// TODO Auto-generated method stub
		
	}

}
