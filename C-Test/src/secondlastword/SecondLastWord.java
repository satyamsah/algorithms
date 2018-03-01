package secondlastword;

import java.util.Scanner;

public class SecondLastWord {

	
	public static void main(String [] arr){
		Scanner sc = new Scanner(System.in);
		String abc= sc.nextLine();
		
		String [] strabc= abc.split(" ");
		String secondlast="";
		int i=0;
//		for( ;i< strabc.length-2;i++){
//			
//		}
		System.out.println("abc");
		System.out.println(strabc[strabc.length-2]);
		//System.out.println(strabc[i]);
	}
}
