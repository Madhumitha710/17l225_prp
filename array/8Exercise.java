import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
	
Scanner sc=new Scanner(System.in);
System.out.println("Enter size of Array:");
int n=sc.nextInt();
int arr[]=new int[n];
int sum=0;
System.out.println("Enter the Array Elements:");
for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
}
for(int i=0;i<n;i++) {
	for(int j=1;j<n;j++) {
		if((arr[i]==6)&&(arr[j]==7)){
			for(int k=i;k<=j;k++) {
				arr[k]=0;
			}
		}
	}
}
for(int i=0;i<n;i++) {
	sum=sum+arr[i];
}
System.out.println("Sum:"+sum);
	}

}
