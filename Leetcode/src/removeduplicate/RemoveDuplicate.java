package removeduplicate;

class RemoveDuplicate {
	
	public static void main(String args[]){
		int a[]={1};
		int b[]=removeDuplicates(a);
		
		for( int c: b){
			System.out.print(c+",");
		}
	}
    public static int[] removeDuplicates(int[] nums) {
    	int resultantlastIndex=0;
        for(int i=0;i<nums.length;i++){
        	if(i==0){
        		nums[resultantlastIndex]=nums[i];
        	}
        	if(nums[resultantlastIndex]!=nums[i]){
        		resultantlastIndex=resultantlastIndex+1;
        		nums[resultantlastIndex]=nums[i];
        	}
        }
        System.out.println(resultantlastIndex+1);
        return nums;
       
    }
}