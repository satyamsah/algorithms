/*
 3) Reverse a number, add it to the original number.
  Check whether the resultant number is a 
  palindrome or not. If not, repeat the process 
  else return the number of steps you took to 
  reach a palindromic number
 */

package pallindrom;

public class Pallindrome {
	
	public static void main(String args[]){
		int number=121;
		
		//System.out.println(reverse(number));
		
		int limit=Integer.MAX_VALUE;
		int returnvalue=1;
		while(number<limit){
			int reversed=reverse(number);
			if(reversed==number){
				break;
			}
			else{
				 number=number+reversed;
				 returnvalue++;
			}
			
		}
		
		System.out.println(returnvalue);
	}


	private static int reverse(int number) {
		int result=0;
		
		while(number!=0){
			
			int reminder=number%10;
			result=result*10+reminder;
			number=number/10;
		}
		
		return result;
		
	}
	
	

}
