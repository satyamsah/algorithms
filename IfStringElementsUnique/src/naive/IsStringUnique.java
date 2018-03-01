package naive;

import java.util.ArrayList;

public class IsStringUnique {
	
	public static void main(String [] args)
	{
		String str="abcd";
		
		System.out.println(isStringCharacterUnique( str));		
		
	}
	
	static boolean isStringCharacterUnique(String str)
	{
		ArrayList<Character> arr= new ArrayList<>();
		//boolean returnValue=true;
		
			for(int i=0;i<str.length()-1;i++)
			{
				arr.add(str.charAt(i));
				if(arr.contains(str.charAt(i+1)))
				{
					return false;
				}
			}
			return true;
		
	}

}
