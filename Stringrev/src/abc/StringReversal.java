package abc;

public class StringReversal {

	
	public static void main(String [] arr){
		String abc ="I am a good guy bdds";
		char [] strArray=abc.toCharArray();
		int strlength=strArray.length;
		for(int i=0;i<strlength/2;i++){
			char temp= strArray[i];
			strArray[i]=strArray[strlength-1-i];
			strArray[strlength-1-i]=temp;
		}
		
		StringBuilder result=new StringBuilder();
		for(int i=0;i<abc.length();i++){
			result.append(strArray[i]);
		}
		
		//System.out.println(result.toString());
		
		String [] splitted=result.toString().split(" ");
		//System.out.println(splitted.length);
		StringBuilder finalstr=new StringBuilder();
		for(String singlesplitString: splitted){
			//System.out.println(singlesplitString);
			char [] arrofchar= singlesplitString.toCharArray();
			int singleStringLength= arrofchar.length;
			for(int i=0;i<singleStringLength/2;i++){
				char temp= arrofchar[i];
				arrofchar[i]=arrofchar[singleStringLength-1-i];
				arrofchar[singleStringLength-1-i]=temp;
				System.out.println("arrofchar[i] ->"+arrofchar[i]);
				System.out.println("arrofchar[singleStringLength-1-i]->"+arrofchar[singleStringLength-1-i]);
			}
			finalstr.append(arrofchar);
			finalstr.append(" ");
		}
		
		System.out.println(finalstr);
		System.out.println(finalstr.length());
		
		
	}
}
