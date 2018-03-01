package moreefficient;
class Solution {
    public void setZeroes(int[][] matrix) {
       if(matrix.length==0 || matrix.length==0){
           return;
       }
       int rows=matrix.length;
       int columns=matrix[0].length;
       int [] zerorows=  new int[rows];
       int [] zerocols= new int[columns];
      for (int i=0;i<zerorows.length;i++){
           zerorows[i]=Integer.MAX_VALUE;
       }
       for (int i=0;i<zerocols.length;i++){
           zerocols[i]=Integer.MAX_VALUE;
       }
       for(int i=0;i<rows;i++){
           for(int j=0;j<columns;j++){
               if(matrix[i][j]==0){
                   zerorows[i]=0;
                   zerocols[j]=0;
                    System.out.println("Inside main");
               }
           }

       }
        
       for( int i=0;i<zerorows.length;i++){
           if(zerorows[i]==0){
               for(int j=0;j<columns;j++){
                   matrix[i][j]=0;
                   System.out.println("Inside rowzero");
               }
               
           }
       }
     
       for( int j=0;j<zerocols.length;j++){
           if(zerocols[j]==0){
               for(int i=0;i<rows;i++){
                   matrix[i][j]=0;
                     System.out.println("Inside columnzero");
               }
               
           }
       }
    }
}