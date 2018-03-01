package abc;

import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a=new int[10];
		a[0]=5;
		a[1]=15;
		a[2]=25;
		int[] b={1,10,20};
		merge(a,3,b,3) ;
		
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}

	}
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int originalm=m;
		int originaln=n;
        Stack<Integer> stack = new Stack();
        if(nums1.length==0 && nums2.length==0){
            return;
        }
        m=m-1;
        n=n-1;
        while(m>=0 && n>=0){
            if(nums1[m]>nums2[n]){
                stack.push(nums1[m]);
                m--;
            }else if(nums2[n]>nums1[m]){
                stack.push(nums2[n]);
                n--;
            }
        }
            while(m>=0){
                stack.push(nums1[m]);
                m--;
            }
            
            while(n>=0){
                stack.push(nums2[n]);
                n--;
            }
//            while(stack.isEmpty()==false){
//            	System.out.println(stack.pop());
//            }
            for(int i=0;i<originalm+originaln;i++){
                 nums1[i]=(Integer)stack.pop();
            }
            
//            for(int i=0;i<nums1.length;i++){
//    			System.out.println(nums1[i]);
//    		}
            
        
    }
}
