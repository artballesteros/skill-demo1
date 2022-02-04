class SkillDemo {
	public static String reverseString(String s,int index) {
		if (index >= s.length()) {
			return "";
		}

		return reverseString(s, index + 1) + s.charAt(index);
	}
}

