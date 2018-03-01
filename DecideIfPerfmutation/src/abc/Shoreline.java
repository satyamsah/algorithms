package abc;

import java.util.ArrayList;
import java.util.Arrays;

public class Shoreline {

	
	public static void main(String [] arr)
	{
	  String str1="fsd";
	  String str2="dfs";
	 System.out.println(checkIfPermuation(str1,str2));
	  
	}

	 static boolean checkIfPermuation(String str1, String str2) {
		
		if(str1.length()!=str2.length())
		{
			return false;
		}
		else
		{
			char[] temp1str= str1.toCharArray();
			
			char[] temp2str= str2.toCharArray();
			
			
			Arrays.sort(temp1str);
			Arrays.sort(temp2str);
			
			for(int i=0;i<temp1str.length;i++)
			{
				if(temp1str[i]==temp2str[i])
				{
					continue;
				}
				else
				{
					return false;
				}
			}
			return true;
			
		}
	}
	
	
}
