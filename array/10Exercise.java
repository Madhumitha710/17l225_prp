import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter array size:");
int n=sc.nextInt();
int temp;
int arr[]=new int[n];
System.out.println("Enter array elements");
for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
}
for(int j=0;j<n;j++) {
for(int i=1;i<n;i++) {
if(arr[i-1]%2!=0) {
	temp=arr[i-1];
	arr[i-1]=arr[i];
	arr[i]=temp;
}
	}
}
for(int i=0;i<n;i++) {
	System.out.println(arr[i]);
}
	}
}