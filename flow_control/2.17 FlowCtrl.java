import java.util.Scanner;

public class Exercise17 {
	public static void main(String args[])
	{
		
			int rem,rev=0;    
			 Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");
			int n=sc.nextInt();
			int temp=n;    
			while(n>0){    
			   rem=n%10;   
			   rev=(rev*10)+rem;    
			   n=n/10;    
			  }    
			  if(temp==rev)    
			   System.out.println("The number is a Palindrome");    
			  else    
			   System.out.println("The number is not a Palindrome");    
			}  
			 
	}

