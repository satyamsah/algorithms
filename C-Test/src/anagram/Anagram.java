package anagram;

public class Anagram {

	
	public static void main(String [] args){
	
		String str1 = "abca";
		String str2 = "caba";

		System.out.println(anagram(str1,str2));
		
	}

	private static boolean anagram(String str1, String str2) {
		if(str1.length()!=str2.length()){
			return false;
		}
		else{
			char[] str1arr= str1.toCharArray();
			char[] str2arr= str2.toCharArray();
			for( int i=0;i< str1arr.length;i++){
				boolean matchflag=false;
				for( int j=0;j<str2arr.length;j++){
					if(str1arr[i]==str2arr[j]){
						matchflag=true;
						break;
					}
				}
				if(matchflag==false){
					
					return false;
				}
				
			}
			return true;
			
		}
		
		
	}
}
