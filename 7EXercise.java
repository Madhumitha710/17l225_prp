import java.util.*; 
public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array:");
int n=sc.nextInt();
int arr[]=new int[n];
int temp[]=new int[n];
System.out.println("Enter the array:");
for(int i=0;i<n;i++) {
arr[i]=sc.nextInt();
}
int j=0;
for(int i=0;i+1<n;i++) {

		if(arr[i]!=arr[i+1]) {
			temp[j++]=arr[i];
		}
	}
temp[j++]=arr[n-1];
for(int i=0;i<j;i++) {
	System.out.println(temp[i]);
}
}
	}