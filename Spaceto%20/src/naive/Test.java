package naive;

public class Test {

	
	public static void main(String [] args)
	{
		String str="ab cda";
		
		System.out.println(isStringCharacterUnique( str));		
		
	}
	
	static char[] isStringCharacterUnique(String str)
	{
		char[] str1=str.toCharArray();
		int spacecnt=0;
		for(int i=0;i< str1.length;i++)
		{
			if (str1[i]==' ')
			{
				spacecnt++;
			}
			
			int newLength= str1.length+(2*spacecnt);
			str1[newLength]='\0';
			for(int j=str1.length-1;j>=0;j--)
			{
				if(str1[j]==' ')
				{
					str1[newLength-1]='0';
					str1[newLength-2]='2';
					str1[newLength-3]='%';
					newLength=newLength-3;
				}
				else
				{
					str1[newLength-1]=str1[j];
					newLength=newLength-1;
					
				}
			}
		}
		
		return str1;
		
	}
	
}

