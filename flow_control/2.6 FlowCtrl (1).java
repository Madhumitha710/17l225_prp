import java.util.Scanner;

public class Exercise6 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String gender=sc.next();
		int age=sc.nextInt();
		if(age>0 && age<59)
		{
			if(gender.equals("male"))
			{
				System.out.println("8.4%");
			}
			else if(gender.equals("female"))
			{
				System.out.println("8.2%");
			}
		}
		if(age>58 && age<100)
		{
			if(gender.equals("male"))
			{
				System.out.println("10.5%");
			}
			else if(gender.equals("female"))
			{
				System.out.println("9.2%");
			}
		}
	}

}
