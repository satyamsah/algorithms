package snippet;

public class Snippet {
	 static long countSum(int[] numbers) {
	        int sum=0;
	        for(int i=0;i<numbers.length;i++){
	            int num=numbers[i];
	            for(int j=1;j<num/2;j++){
	                if(j==1){
	                    sum=sum+1;
	                }else{
	                    if(j%2!=0 && num%j==0){
	                        sum=sum+j;
	                    }
	                }
	            }
	        }
	        return sum;
	
	    }
}

