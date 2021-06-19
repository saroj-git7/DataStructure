package Array;
import java .util.Scanner;
public class TWODarray {

	public static void main(String[] args) {
int i,j,row,col;
int [][]a=new int [10][10];
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of row =");
row=sc.nextInt();
System.out.println("Enter the number of Coloumn =");
col=sc.nextInt();
System.out.println("Enter the "  + (row*col) +"  "
		+ "Array Element");
for (i=0;i<row ;i++)
{
        for(j=0;j<col;j++)
        {
        a [i][j]=sc.nextInt();//this line is written for initialize the data in array ;
        }
	
}
System.out.print("The array are: \n");

//NOW THIS IS THE TIME TO RETREIVE THE VALUE;
for (i=0;i<row ;i++)
{
	for (j=0;j<col;j++)
	{
		System.out.print(a[i][j] +"   ");
	}
	System.out.println();
}

	}

}
