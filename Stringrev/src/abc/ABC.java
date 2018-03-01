package abc;import java.io.CharConversionException;
import java.util.ArrayList;
import java.util.List;

public class ABC {

	
	public static void main(String[] args) {
		System.out.println(strrev("satyam"));
		List<Integer> list = new ArrayList<>();
		list.ad
			
	}

	
	public static String strrev(String str ) {
		
		char[] abc=str.toCharArray();
		
		for(int i=0;i<abc.length/2;i++)
		{
			
			char temp=abc[i];
			abc[i]=abc[abc.length-1-i];
			abc[abc.length-1-i]=temp;
		
		}
		StringBuffer sb=new StringBuffer();
		for( char c: abc)
		{
			sb.append(Character.toString(c));
		}
		
		return sb.toString();
	}
}

