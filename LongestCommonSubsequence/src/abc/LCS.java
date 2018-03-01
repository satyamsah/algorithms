package abc;

public class LCS {

	static class LCSData{
		int max;
		String s;
		
		
	}
	public static void main(String[] args){
		String str1="SCAC";
	    String str2="SCCC";
	    
	    LCSData d=lcsDP(str1.toCharArray(),str2.toCharArray());
	    System.out.println(d.max);
	    System.out.println(d.s);
	}

	private static LCSData lcsDP(char[] str1arr, char[] str2arr) {
		int temp[][]= new int[str1arr.length+1][str2arr.length+1];
		LCSData lcsdata= new LCSData();
		
		int max=0;
		StringBuilder s= new StringBuilder();
		for(int i=1;i<temp.length;i++){
			for(int j=1;j<temp[i].length;j++){
				{
					if(str1arr[i-1]==str2arr[j-1]){	
						temp[i][j]=temp[i-1][j-1]+1;
						
					}
					else{
						temp[i][j]=Math.max(temp[i-1][j], temp[i][j-1]);
					}
				}
				if(temp[i][j]>max){
					//System.out.println("hi");
					max=temp[i][j];
				}
				
			}
			
		}
		lcsdata.max=max;
		
		//System.out.println(s.toString());
		int i=temp.length-1;
		int j=temp[0].length-1;
		StringBuffer s1= new StringBuffer();
		while(i>0 && j >0){
			if(temp[i-1][j]==temp[i][j]-1&& temp[j-1][i]==temp[i][j]-1 && temp[i-1][j-1]==temp[i][j]-1){
//				System.out.println("hi");
				s1.append(str1arr[i-1]);
				i--;
				j--;
			}else if(temp[i][j]==temp[i][j-1]){
				j--;
			}else{
				i--;
			}
			
		}
		lcsdata.s=s1.reverse().toString();
		
		return lcsdata;
	}
	
	
}
