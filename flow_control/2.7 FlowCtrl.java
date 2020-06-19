public class Exercise7 {
	public static void main(String args[])
	{
		char ch='a';
		int num=ch;
		if(num>=97 && num<=123)
		{
			num=num-32;
			System.out.println((char)num);
			
		}
		else
		{
			num=num+32;
			System.out.println((char)num);
		}
	}

}
