
public class SubsetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {1,3,5,7};
		int sum=11;
		
		boolean [][]matrix= new boolean[arr.length][sum];
		
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix.length;j++){
				
				
				if(j==0 && i==0){
					matrix[i][j]=true;
					continue;
				}
				else if(i==0 && j!=0){
					matrix[i][j]=false;
				}else{
					matrix[i][j]=matrix[i-1][j]|| matrix[i-1][j-arr[i]];
				}
				
				
			}
		}
		

	}

}
