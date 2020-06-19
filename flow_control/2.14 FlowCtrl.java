import java.util.Scanner;

public class Factorial {
	public static void main(String args[])
	{
		int count=0;
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			count=count+i;
		}
		System.out.println(count);
		
	}
}