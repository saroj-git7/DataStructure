package Array;
import java .util.Scanner;
public class OneDarray {

	public static void main(String[] args) {
		int i,n;
		int []a=new int [10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers to store the value =");
		n=sc.nextInt();
		
		for (i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("The list of Array are = ");
		for (i=0;i<a.length;i++)
		{
			System.out.print(a[i]+ " , ");
		}
	}
	
	

}
