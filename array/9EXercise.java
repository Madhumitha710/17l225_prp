import java.util.Scanner;

public class Exercise11 {
	public static void main(String args[])
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number of elements:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		
		}
		for(int i=0;i<n;i++)
		{
			
					if(arr[i]==1 || arr[i]==4)
		{
					count++;		
			}
		
					if(count==1)
					{
						System.out.println("true");
					}
					else
					{
						System.out.println("false");
					}

		}
		
}
}

