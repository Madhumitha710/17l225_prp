public class Exercise2 {
	public static void main(String args[])
	{
		 int[] arr = new int[]{5,4,1,3,2};
		 int min=arr[0];
		 
		 for(int i=0;i<5;i++)
		 {
			 			 if(arr[i]<min)
			 {
				 min=arr[i];
			 }
		 }
		 System.out.println("Minimun element is :" +min);
		 int max=arr[0];
		 for(int i=0;i<5;i++)
		 {
			 			 if(arr[i]>max)
			 {
				 max=arr[i];
			 }
		 }
		 System.out.println("Maximum element is :" +max);
	}

}
