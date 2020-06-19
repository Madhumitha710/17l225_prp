import java.util.Scanner;

public class Exercise13 {
	public static void main(String args[])
	{
		int n;
		int cnum;
		int count;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=10;i<=n;i++)
		{
			cnum=i;
			count=0;
			for(int j=10;j<=cnum;j++)
			{
			if(cnum%j==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(cnum);
		}
		
			}
}
}