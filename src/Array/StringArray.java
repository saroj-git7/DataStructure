package Array;
public class StringArray {
	public static void main(String[] args) 
	{
	
	String[][] a;
	a=new String[2][2];
	
	a[0][0]="Saroj";
	a[0][1]="Deepak";
	a[1][0]="Bibek";
	a[1][1]="Manoj";
	for(int i= 0;i<a.length;i++)
	{
	 for(int j=0;j<a[i].length;j++)
	 {
		 System.out.print(a[i][j] +"  ");
	 }
	 System.out.println( "  ");
	 System.out.println();
	}

}
}
