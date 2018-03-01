package maxHeight;

public class Solution {
	
	public static void main(String [] args){
		int [] arr= {1,2,1};
		
		System.out.println(maxArea(arr));
	}
	
	 public static int maxArea(int[] height) {
	        int maxArea=0;
	        for(int i=0;i<height.length;i++){
	            for(int j=i+1;j<height.length;j++){
	                    int breadth=Math.abs(i-j);
	                    int length=Math.min(height[i],height[j]);
	                    int area= length*breadth;
	                  //  System.out.println(area);
	                    if(maxArea<area){
	                        maxArea=area;
	                }
	            }
	        }
	        return maxArea;
	        
	    }

}
