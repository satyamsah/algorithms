package date;

public class Satyam {

	public static void main(String[] args) {
		
		String abc =" sgfs , 12434 ";
		String [] fcc= abc.split(",");
		
		String key=fcc[0].trim();
        Integer value=Integer.parseInt(fcc[1].trim());
		System.out.println(key);
		System.out.println(value);
		System.out.println(Integer.toString(value)+"sadsa");
       
	}

}
