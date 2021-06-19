package sorting;
public class MergeSort {
	int [] array;
	int [] tempmergeArr;
	int length;
	
	public static void main(String[] args) {
		
		int[] inputArray= {48,98,55,45,32,32,34,56};
		MergeSort ms=new MergeSort();
		ms.sort(inputArray);
		 
		for(int i:inputArray)
		{
			System.out.print(i+" ");
		}
		
		
	}
	public void sort(int inputArr[])
	{
		this.array=inputArr;
		this.length=inputArr.length;
		this.tempmergeArr=new int[length];
		divideArray(0,length-1);
	}
	
	public void divideArray(int lowerindex,int higherindex) {
		if(lowerindex<higherindex)
		{
			int middle=lowerindex+(higherindex-lowerindex)/2;
			
			//This is for sorting left side array
			divideArray(lowerindex,middle);
			
			//This is for sorting right side array
			
			divideArray(middle+1,higherindex);
			
				
			mergeArray(lowerindex,middle,higherindex);
		}
	}
	public void mergeArray(int lowerindex,int middle,int higherindex)
	{
		for(int i=lowerindex;i<=higherindex;i++)
		{
			tempmergeArr[i]=array[i];
		}
		
		int i=lowerindex;
		int j=middle+1;
		int k=lowerindex;
		
		while(i<=middle && j<=higherindex)
		{
			if(tempmergeArr[i]<=tempmergeArr[j])
			{
				array[k]=tempmergeArr[i];
				i++;
			}
			
			else
			{
				array[k]=tempmergeArr[j];
				j++;
			}
			k++;
			while(i<=middle)
			{
				array[k]=tempmergeArr[i];
				k++;
				i++;
			}
		}
	}

}
//

//this is not giving proper sorting of the integer value