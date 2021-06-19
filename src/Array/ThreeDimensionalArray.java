package Array;

public class ThreeDimensionalArray {
	public static void main(String[] args) 
	{
	//you can also create 3d array like this	
		//int [][][] a=new int [3][4][5];
		//then after initializing and then retreiving
		
		
	int [][][] a=new int[][][] {{{10,39,59},{66,56,33,45},{88,45,65,87,99}}};
	 
	for(int i=0;i<a.length;i++)
	{
		for(int j=0; j<a[i].length;j++)
{
	for (int k=0;k<a[i][j].length;k++)
	{
		System.out.print(a[i][j][k]+" ");
	}
	System.out.println();
}
	

	}

}
}
