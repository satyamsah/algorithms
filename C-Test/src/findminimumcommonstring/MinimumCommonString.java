package findminimumcommonstring;

public class MinimumCommonString {

	public static void main(String[] args){
		
		String s1="abccdes";
		String s2="abccd";		
		String s3="abc";
		String s4="abccd";
		String [] arrStr={s1,s2,s3,s4};
		int minlength=0;
		String minString="";
		for(int i=0;i<arrStr.length;i++){
			if(minlength>arrStr[i].length())
			{
				minlength=arrStr[i].length();
				minString=arrStr[i];
			}
		}
		
		StringBuilder common=new StringBuilder();
		String first=arrStr[0];
		String second=arrStr[1];
		int smallerlength=first.length()<second.length()?first.length():second.length();
		for(int a=0;a<smallerlength;a++){
			if(first.charAt(a)==second.charAt(a)){
				common.append(first.charAt(a));
			}
		}
		
		if(common.length()==0){
			System.out.println("not possible");
		}
		else{
			if(arrStr.length>2){
				for(int i=2;i<arrStr.length;i++){
					StringBuilder temp=common;
					int smallerlength2=temp.length()<arrStr[i].length()?temp.length():arrStr[i].length();
					common.delete(0, common.length());
					for(int index=0;index<smallerlength2;index++){
						if(arrStr[i].charAt(index)==temp.charAt(index)){
							common.append(arrStr[i].charAt(index));
						}
						else{
							break;
						}
						
					}
					if(common.length()==0){
						System.out.println("not possible");
						break;
					}
				}
			}
		}
		
		System.out.println(common.toString());
			
	}
		
}

	
