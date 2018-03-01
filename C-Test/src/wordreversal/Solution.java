package wordreversal;

class Solution {
	
	public static void main(String [] arr){
		System.out.println(reverseWords("The time  of India"));
	}
	public static String reverseWords(String s) {
		if (s == null || s.length() == 0) {
			return "";
		}
 
		// split to words by space
		String[] arr = s.split(" ");
		StringBuilder sb = new StringBuilder();
		int i = arr.length - 1;
		for (; i >= 1; --i) {
//			if (!arr[i].equals("")) {
//				sb.append(arr[i]).append(" ");
//			}
			
			
				sb.append(arr[i]).append(" ");
			
		}
		
		sb.append(arr[i]);
		return sb.length() == 0 ? "" : sb.substring(0, sb.length());
	}
}