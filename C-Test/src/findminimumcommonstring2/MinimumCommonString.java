package findminimumcommonstring2;

public class MinimumCommonString {

	public static void main(String[] args) {

		String s1 = "abccdes";
		String s2 = "abccd";
		String s3 = "abcc";
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
				String temp = common.toString();
				int smallerlength = temp.length() < arrStr[i].length() ? temp.length() : arrStr[i].length();
				common.delete(0, common.length());
				// System.out.println(temp.length());
				// System.out.println(arrStr[i].length());
				for (int index = 0; index < smallerlength; index++) {
					if (arrStr[i].charAt(index) == temp.charAt(index)) {
						common.append(arrStr[i].charAt(index));
					} else {
						break;
					}

				}
				// System.out.println(common+":"+i);
				if (common.length() == 0) {
					return "0";
				}
			}

		}

		return common.toString();

	}

}
