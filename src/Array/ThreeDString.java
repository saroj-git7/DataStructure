package Array;
import java.util.Scanner;
public class ThreeDString {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 String [][][] a=new String[2][2][2];
	 System.out.print("Enter the String value for 3d array");
	 for(int i=0;i<a.length;i++)
	 {
		 for(int j=0;j<a[i].length;j++) 
		 {
			 for (int k=0;k<a[i][j].length;k++)
			 {
				 a[i][j][k]=sc.nextLine();
			 }
		 }
	 }
	 System.out.println("These are the value that you have entered:");
	 
for(int i=0;i<a.length;i++)
{
	for(int j=0;j<a[i].length;j++)
	{
		for (int k=0;k<a[i][j].length;k++)
		{
			System.out.print(a[i][j][k]+"   ");
		}
	}System.out.println();
}
	 
	}

}
