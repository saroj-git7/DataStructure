package Array;
public class JaggedArray {
	public static void main(String[] args) 
	{
		//These are the process to declare and creation of jagged array
		
		int [][]a =new int [2][];
		a[0]=new int [4];
		a[1]=new int [5];

		//INITIALIZATION IS SAME LIKE TWO D ARRAY;
		 
		a[1][2]=40;
		a[0][2]=90;
		
		//aru index value ma default value basxa output aauda i.e 0;
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
	}

}
