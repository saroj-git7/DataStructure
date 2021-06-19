package sorting;

public class StringSelectionSorting {

	public static void main(String[] args) 
	{	
int min;
String temp=" ";
String []a= {"Deepak","Saroj","Rahul","Amit","Kamlesh"};
for(int i=0;i<a.length;i++)
{
	min=i;
	for(int j=i+1;j<a.length;j++)
	{
		if (a[j].compareTo(a[min])<0) 
		{
			min=j;
		}
	}
	temp=a[i];
	a[i]=a[min];
	a[min]=temp;
}
for(int i=0;i<a.length;i++)
{
	System.out.println(a[i]+" ");
}
	}

}
