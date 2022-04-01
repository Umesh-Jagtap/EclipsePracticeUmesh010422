package coreJava;

public class stringclassDemo {
	
	public static void main(String[] args) {
		
		String s = "umesh";
		String t = "";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			t= t+s.charAt(i);
		}
		//System.out.println(t);
		
		if(s.equalsIgnoreCase(t))
		{
			System.out.println("palindrom");
		}
		System.out.println("Not pelindrom");
		
	}

}
