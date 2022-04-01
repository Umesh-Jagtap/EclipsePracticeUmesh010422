package coreJava;

public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1234;
		int rev=0,temp;
		temp=num;
		while(num>0)
		{
			rev =rev*10+num%10;
			num = num/10;
			
		}
		
		System.out.println(rev);
		if(temp==rev)
		{
			System.out.println("Palindrom");
		}
		else
		{
		System.out.println("NotPalindrom");
		}
		
		 /*int r,sum=0,temp;    
		  int n=124;//It is the number variable to be checked for palindrome  
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  */
		

	}

}
