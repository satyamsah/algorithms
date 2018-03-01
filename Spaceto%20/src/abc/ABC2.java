package abc;

public class ABC2 {

	public static void main(String[] args) {
		System.out.println(replaceSpaces("hj jhh"));

	}

	
	public static char[] replaceSpaces(String abc ) {
		char[] str=abc.toCharArray();
		int length=str.length;
		 int spaceCount = 0, newLength, i;
		for (i = 0; i < length; i++) {
			
			if (str[i] == ' ') {
				spaceCount++;
				}
				}
				 newLength = length + spaceCount * 2;
				 str[newLength] = '\0';
				for (i = length - 1; i >= 0; i--) {
				 if (str[i] == ' ') {
				 str[newLength - 1] = '0';
				 str[newLength - 2] = '2';
				 str[newLength - 3] = '%';
				 newLength = newLength - 3;
				} else {
				 str[newLength - 1] = str[i];
				newLength = newLength - 1;
				 }
				}
				
				return str;
				 }
	
}
