package anagram;

import java.util.Arrays;

public class SortedAnagram {

	public static void main(String []  args){

	String str1 ="gcdd";
	String str2 ="cdgd";
	System.out.println(anagram(str1,str2));
	
}

	private static boolean anagram(String str1, String str2) {
		if(!(str1.length()==str2.length())){
			return false;
		}
		char[] str1arr=str1.toCharArray();
		char[] str2arr=str2.toCharArray();
		
		Arrays.sort(str1arr);
		Arrays.sort(str2arr);
		
		
		for( int i=0;i<str1arr.length;i++){
			if(str1arr[i]!=str2arr[i]){
				return false;
				
			}
		}
		return true;
	}
}