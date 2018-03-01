package abc;

import java.math.BigInteger;

public class ATOI {

	public static void main(String[] args) {
		
		String string="489";
		if(!string.matches("\\d+"))
			System.out.println();
			
		char[] array = string.toCharArray();
		
		int length = array.length;
		BigInteger number=  BigInteger.valueOf(0);
			
		for(int i = length - 1; i >= 0; -- i)
			number += 
				Math.pow(10, length - i - 1) 
					* (array[i] - 48);
			
		System.out.println(number);
	}

}
