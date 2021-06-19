package sorting;
import java.util.Scanner;
public class BubbleByScanner {
	public static void main(String[] args) {
	
int []a =new int[10];
Scanner sc=new Scanner (System.in);
System.out.println("Enter the sorting value:");
 int n=sc.nextInt();
 
 for (int i=0;i<a.length;i++)
 {
	 a[i]=sc.nextInt();
 }
 
 System.out.print("Your Entered value:");
 System.out.println();
 int temp;
 for(int i=0;i<a.length;i++)
 {
     int flag=0;
	 for(int j=0;j<a.length-1-i;j++)
	 {
         if(a[j]>a[j+1])
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
	 System.out.print(a[i]+"  ");
 }
	
}
}