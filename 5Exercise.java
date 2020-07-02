public class Exercise5 {
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter num of elemets:");
                int n = sc.nextInt();
 
		int array[] = new int[n];
                System.out.println("Enter the elements:");
		for (int i = 0; i < array.length; i++)
		{
			array[i] = sc.nextInt();
		}
 
		int num1,num2, temp;
 
		num1 = array[0];
		num2 = array[1];
 
		if (num1 < num2)
		{
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
 
		for (int i = 2; i < array.length; i++)
		{
			if (array[i] > num1)
			{
				num2 = num1;
				num1 = array[i];
			}
			else if (array[i] > num2 && array[i] != num1)
			{
				num2 = array[i];
			}
		}
 
		System.out.println ("The First largest num is " + num1);
		System.out.println ("The Second largest  num is " + num2);
 
	}
	
	}

