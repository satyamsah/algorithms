import java.util.*;
import java.util.Collections;
class Solution {
    public List<List<Integer>> permute(int[] nums) {

      List <Integer> numsList = new ArrayList<>();
        for( int num: nums){
            numsList.add(num);
        }
       List<List<Integer>> resultarr = new ArrayList<>();
        return permuteUtil(numsList,0,nums.length,resultarr);
    }
    
    public static List<List<Integer>> permuteUtil( List <Integer> numsList ,int left,int right,List <List<Integer>> resultarr){
          if(left==right){
              resultarr.add(numsList);
          }else{
              for(int i=left;i<right;i++){
                   Collections.swap(numsList, left,i);
                    permuteUtil(numsList,left+1,i,resultarr);
                   Collections.swap(numsList, left,i);
              }
             
          }
     }

}