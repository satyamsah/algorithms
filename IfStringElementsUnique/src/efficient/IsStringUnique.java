package efficient;



public class IsStringUnique {
	
	public static void main(String [] args)
	{
		String str="abcda";
		
		System.out.println(isStringCharacterUnique( str));		
		
	}
	
	static boolean isStringCharacterUnique(String str)
	{
		boolean [] seriesOfUniqueCharacters= new boolean[256];
		//boolean returnValue=true;
		if(str.length()>256)
		{
			 return false;
		}
		else
		{
			
			for(int i=0;i<str.length();i++)
			{
				if(seriesOfUniqueCharacters[str.charAt(i)])
				{
					return false;
				}
				seriesOfUniqueCharacters[str.charAt(i)]=true;
			}
			return true;
		}
	}

}
