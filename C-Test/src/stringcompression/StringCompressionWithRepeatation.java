package stringcompression;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StringCompressionWithRepeatation {

	
	public static void main(String args[]){
		
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		//String str="aaabbccaa";
		StringBuilder sb1=new StringBuilder();
		for(int i=0;i<n;i++){
			sb1.append(sc.next());
		}
		String str=sb1.toString();
		//String str="aaabbccaa";
		sc.close();
		
		
		
		
		
		String result="";
		int count=1;
		int i=0;
		for(;i<str.length()-1;i++){
			if(str.charAt(i)==str.charAt(i+1)){
				count++;
			}
			else{
				result=result+str.charAt(i);
				result=result+count;
				count=1;
			}
		}

			result=result+str.charAt(i);
			result=result+count;
		
		
		

		System.out.println(result.toString());
		
		
		
	}
}
