package abc;

public class Satyam {

	
	public static void main(String [] args)
	{
		String str1="abcda";
		String str2="bcada";
		
		System.out.println(isSubString(str1,str2));		
		
	}
	
	static boolean isSubString( String str1,String str2)
	{
		if((str1+str1).contains(str2))
		{
			return true;
		}
		return false;
	}
}
