package Array;
import java.util.Scanner;
public class EntryInStringValue {
	public static void main(String[] args) 
	{	
	
		Scanner sc=new Scanner(System.in);
		String [][]a =new String[5][5];
		System.out.println("Enter the value of atleast 25 string value: ");
for (int i =0;i<a.length;i++)
{
	for(int j=0;j<a[i].length;j++)
	{
		a[i][j]=sc.nextLine();
	}
}
System.out.println("The value you have entere:");

for (int i=0;i<a.length;i++)
{
	for(int j=0;j<a[i].length;j++)
	{
		System.out.print(a[i][j]+ "   ");
	}
	System.out.println();
	System.out.println();
}
	}}
