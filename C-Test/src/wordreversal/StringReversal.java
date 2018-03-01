package wordreversal;

import java.util.Scanner;

public class StringReversal {

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		String input=sc.nextLine();
		String [] splitted=input.toString().split(" ");
		StringBuilder sb= new StringBuilder();
		
		for(String s: splitted){
			System.out.println(s);
		}
		int i=splitted.length-1;
		for( ;i>=1;i--){
			
			if(!splitted[i].equals("")){
				sb.append(splitted[i]);
				sb.append(" ");
			}
			
//			if (!splitted[i].equals("")) {
//				sb.append(splitted[i]).append(" ");
//			}
		}
		sb.append(splitted[i]);
		System.out.println(sb);
	    
		
	   
		
	}
	
}
