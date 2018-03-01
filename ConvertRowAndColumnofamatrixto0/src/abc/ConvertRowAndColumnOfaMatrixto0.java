package abc;

import java.util.Scanner;

public class ConvertRowAndColumnOfaMatrixto0 {

	public static void main(String [] args)
	{
		
		int matrix[][]=   {{1,21,1},{0,0,4},{5,4,4}};
//		for(int i=0;i<3;i++)
//		{
//			for(int j=0;j<3;j++)
//			{
//				Scanner sc= new Scanner(System.in);
//				matrix[i][j]=sc.nextInt();
//			}
//		}
		
		
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(matrix[i][j]);
				System.out.print("\t");
			}
			
			System.out.println();
		}
		
		System.out.println("--------------");
		
		int [][] matrix2= covertoZeros(matrix);
		
	
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(matrix2[i][j]);
				System.out.print("\t");
			}
			
			System.out.println();
		}
		
		
		System.out.println("----------------");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(matrix[i][j]);
				System.out.print("\t");
			}
			
			System.out.println();
		}
		
		System.out.println(matrix.length);
	}

	private static int [][] covertoZeros(int matrix[][]) {
		
		//int [][]matrix2= new int[matrix.length][matrix[0].length];
		
		boolean row[]=new boolean[matrix.length];
		boolean col[]= new boolean[matrix[0].length];

		for( int i =0;i<matrix.length;i++)
		{
			for( int j=0;j< matrix.length;j++)
			{
				if(matrix[i][j]==0)//if(matrix[i][j]==0)
				{
					row[i]=true;
					col[j]=true;
					//row[i]=1;
					//col[j]=1;
				}
				
			}
		}
		
		for(int i=0;i<matrix.length;i++)
		{
			for( int j=0;j< matrix.length;j++)
			{
				if(row[i]==true|| col[j]==true) //if(row[i]==1|| col[j]==1)
				{
					matrix[i][j]=0;//matrix[i][j]=1; 
				}
				
			}
		}
		
		return matrix;
	}
	
	
	
}
