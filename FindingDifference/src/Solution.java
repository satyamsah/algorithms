import java.io.*;
import java.util.*;

class Solution {

  static int[][] findPairsWithGivenDifference(int[] arr, int k) {
    // your code goes here
    Set<Integer> set  = new HashSet();
    LinkedHashSet<int[]> res = new LinkedHashSet<>();
    
    // O(n)
    for(int i=0;i<arr.length;i++){
       set.add(arr[i]);
    }    
    
    // O(n)
    for(int i=0;i<arr.length;i++){
      int sum=arr[i]+k;
      int diff=arr[i]-k;
      
      if(set.contains(sum)){
         res.add(new int[]{Math.max(sum,arr[i]),Math.min(sum,arr[i])});
      }
      
      if(set.contains(diff)){
         res.add(new int[]{Math.max(diff,arr[i]),Math.min(diff,arr[i])});
      }
    }
    
    
    
    int[][] result = new int[res.size()][2];
    Iterator<int[]> iter = res.iterator();
    
    // O(n)
    for(int i = 0; i < res.size(); i++){
      int[] curr = iter.next();
      result[i][0] = curr[0];
      result[i][1] = curr[1];
    }
    
    return result;
  }

  

  public static void main(String[] args) {

  }

}

/**

arr= [0, -1, -2, 2, 1], k = 1

  i 
   [[1, 0], [0, -1], [-1, -2], [2, 1]]

Set= [0, -1, -2, 2, 1]
LinkedHashSet=[[0,1],[-1,0]]
[Max(a,b), Min(a,b)]

+/- k 
1) 0 
0+1=1 . Is it in the set? Y ->LHS.add(0,1)
0-1=-1. Y ->LHS.add(-1,0)

2) -1
-1-1=-2. Y ->LHS.add(-2,-1)
-1+1=0. Y -> LHS.add(-1,0)


        
**/