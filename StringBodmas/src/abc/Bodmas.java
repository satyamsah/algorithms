package abc;

public class Bodmas {
	
	public static void main(String[] arr){
		String equation="3+14*2+5+0*9";
		
		equation=equation.replaceAll("\\s","");
		System.out.println(equation);
		
		String[] splittedplus=equation.split("\\+");
		int sum=0;
		for( String s: splittedplus){
			
			String[] splittedmultiplication=s.split("\\*");
			int prod=1;
			for(String s2: splittedmultiplication){
				prod=prod*Integer.parseInt(s2);
			}
			sum=sum+prod;
		}
		
		System.out.println(sum);
	}
	
	

}
