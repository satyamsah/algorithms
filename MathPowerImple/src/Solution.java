
class Solution {
	public double myPow(double x, int n) {
		double[] cache;
		if(n>0){
			cache = new double[n + 1];
		}else{
			cache = new double[(n*(-1)) + 1];
		}
		cache[0]=1;
		if (n > 0) {
			for (int i = 1; i <= n; i++) {
				cache[i] = cache[i - 1] * x;

			}
		} else if (n < 0) {
			n = n * (-1);
			for (int i = 1; i <= n; i++) {
				cache[i] = cache[i - 1] * (1 / x);
			}
		}
		return cache[n];

	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.myPow(2, 0));
	}
}