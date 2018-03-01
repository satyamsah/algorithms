package spaceconversion;

public class SpaceConversion {

	
	
	public static void main(String[] args){
		String str ="abc ajc kdk";
		String [] arrStr=str.split(" ");
		String result="";
		int i=0;
		for(;i<arrStr.length-1;i++){
			result=result+arrStr[i];
			result=result+"%20";
		}
		result=result+arrStr[i];
		
		System.out.println(result);
	}
}
