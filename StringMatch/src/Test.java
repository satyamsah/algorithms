

public class Test {

	public static void main(String [] args){
		String str1= "abcdabcde";
		String str2="abcdp";
		for(int i=0;i<str1.length();i++){
			int temp=i;
			int j=0;
			for(j=0;j<str2.length();j++){
				if(str1.charAt(i)==str2.charAt(j)){
					

					System.out.println("testing..."+i+ " " +j);
					i++;
					continue;
				}else{
					System.out.println("catch"+i+ " " +j);
					break;
				}
				
			}
			if(j==str2.length()){
				System.out.println("True");
				break;
			}
			else{
				i=temp;
			}
		}
		System.out.println("False");
	}
}
