package coreJava;

public class removeChar {	
	
		public static void main(String[] args) {
		String str = "India is my country";
		System.out.println(charRemoveAt(str, 7));
		System.out.println(str.trim());
		}
		public static String charRemoveAt(String str, int p) {
		return str.substring(0, p) + str.substring(p + 1);
		}

}
