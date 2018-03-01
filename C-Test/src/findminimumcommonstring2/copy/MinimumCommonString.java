package findminimumcommonstring2.copy;

public class MinimumCommonString {

	public static void main(String[] args) {

		String s1 = "abccdes";
		String s2 = "ad";
		String s3 = "abd";
		String s4 = "abccd";
		String[] arrStr = { s1, s2, s3, s4 };

		String min = min(arrStr);
		System.out.println(min);
	}

	static String min(String[] arrStr) {

		StringBuilder common = new StringBuilder(arrStr[0]);

		if (arrStr.length == 1) {
			return common.toString();
		}

		if (arrStr.length >= 2) {
			for (int i = 1; i < arrStr.length; i++) {
				int smallerlength = common.length() < arrStr[i].length() ? common.length() : arrStr[i].length();
				int index = 0;
				for (; index < smallerlength; index++) {
					if (arrStr[i].charAt(index) == common.charAt(index)) {
						
						continue;
					} else {
						//System.out.println(arrStr[i].charAt(index) + ":" + common.charAt(index));
						break;
					}
				}
				System.out.println("index"+index);
				common.delete(index, common.length());
				if (common.length() == 0) {
					return "0";
				}
			}

		}

		return common.toString();

	}

}
