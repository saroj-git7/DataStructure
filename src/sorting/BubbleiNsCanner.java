package sorting;
import java.util.Scanner;
public class BubbleiNsCanner {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String []a=new String[10];
	System.out.println("Enter the String Value:");
	String n=sc.nextLine();

	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextLine();
	}
	System.out.println("Entered VALUE:");
	System.out.println();

	String temp;
	for (int i=0;i<a.length;i++)
	{
	  int flag=0;
	  for(int j=0;j<a.length-1-i;i++)
	  {
		  if(a[j].compareTo(a[j+1])>0);
		  {
			  temp=a[j];
			  a[j]=a[j+1];
			  a[j+1]=temp;
			  flag=1;
		  }
	  }
	  if(flag==0)
	  {
		  break;
	  }
	}
for(int i=0;i<a.length;i++)
{
	System.out.println(a[i]+" ");
}
	}

}
