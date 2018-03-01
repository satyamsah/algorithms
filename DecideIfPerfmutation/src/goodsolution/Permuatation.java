package goodsolution;


import java.util.ArrayList;
import java.util.Arrays;

public class Permuatation {
	
	public static void main(String [] arr)
	{
		 String str1="fsd";
		  String str2="dfs";
		 System.out.println(checkIfPermuation(str1,str2));
	}

	private static boolean checkIfPermuation(String str1, String str2) {
		
		char[] arr1str= str1.toCharArray();
		char[] arr2str= str2.toCharArray();
		
		int [] letter= new int[256];
		if(str1.length()!=str2.length())
		{
			return false;
		}
		else
		{
			for(char s : arr1str)
			{
				letter[s]++;
			}
			
			for(int i=0;i<str2.length();i++)
			{
				if(--letter[str2.charAt(i)]<0)
				{
					return false;
				}
			}
			return true;
			
		}
		
		
	}
	
	
}
