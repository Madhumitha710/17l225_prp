public class Exercise3 {
	public static void main(String args[])
	{
		 int[] arr = new int[]{53,46,11,83,27};
		 Scanner sc=new Scanner(System.in);
		 int num=sc.nextInt();
		 
		 int count=0;
		 for(int i=0;i<5;i++)
		 {
			 if(arr[i]==num)
			 {
				 count++;			
				 
			 }
			
		 }
		 if(count==1)
		 {
			 System.out.println("yes");
		 }
		 else
		 {
			 System.out.println("no");

			 
		 }
		 
	}

}