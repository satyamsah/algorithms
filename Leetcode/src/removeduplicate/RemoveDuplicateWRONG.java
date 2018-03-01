package removeduplicate;

class RemoveDuplicateWRONG {
	
	public static void main(String args[]){
		int a[]={1,1};
		int b[]=removeDuplicates(a);
		
		for( int c: b){
			System.out.print(c+",");
		}
	}
    public static int[] removeDuplicates(int[] nums) {
    	int resultantlastIndex=0;
        if (nums.length==0){
        	System.out.println(resultantlastIndex);
            return null;
        }	
        if(nums.length==1){
        	System.out.println(resultantlastIndex);
            return nums;
        }
        else{
            
            int i=0;
            for(;i<nums.length-1;i++){
                 if (i==0){
                       nums[resultantlastIndex]=nums[i];
                 }
                 else{
                        if(nums[i]!=nums[i+1]){
                            resultantlastIndex=resultantlastIndex+1;
                            nums[resultantlastIndex]=nums[i];
                        }

                     }

            }
            resultantlastIndex=resultantlastIndex+1;
            nums[resultantlastIndex]=nums[i];
            System.out.println(resultantlastIndex);
            return nums;
        }
       
    }
}