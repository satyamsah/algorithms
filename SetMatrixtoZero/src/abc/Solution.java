package abc;

import java.util.Scanner;

class Solution {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int [][]matrix=new int[3][3];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				matrix[i][j]=sc.nextInt();
			}	
		}
		
		sc.close();
		
		setZeroes(matrix);
	}
    public static void setZeroes(int[][] matrix) {
        
       int rows=matrix.length;
       int columns=matrix[0].length;
       int[][] resultmat=new int[rows][columns];
       for(int i=0;i<rows;i++){
           for(int j=0;j<columns;j++){
               if(matrix[i][j]==0){
                    for(int x=0;x<rows;x++){
                        resultmat[x][j]=0;
                    }
                   for(int y=0;y<columns;y++){
                        resultmat[i][y]=0;
                    }
               }
               else{
                   if(resultmat[i][j]!=0){
                       resultmat[i][j]=matrix[i][j];
                   }
               }
           }
           
       }
        for(int i=0;i<rows;i++){
           for(int j=0;j<columns;j++){
               System.out.print(resultmat[i][j]);
           }
            System.out.println();
        }
    }
}