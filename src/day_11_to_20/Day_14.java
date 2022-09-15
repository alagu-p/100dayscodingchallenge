package day_11_to_20;

public class Day_14 {
	/*
	 * Algorithm is a step-but-step procedure,which defines a set of instructions to be executed in a certain oder to get the desired output
	 * 
	 * 
	 * Data structure point of view, following are some important categories of algorithms:
	 * 	1.Search − Algorithm to search an item in a data structure.
	 * 	2.Sort − Algorithm to sort items in a certain order.
	 * 3.Insert − Algorithm to insert item in a data structure.
	 * 4.Update − Algorithm to update an existing item in a data structure.
	 * 5.Delete − Algorithm to delete an existing item from a data structure.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public static void traverseOperation(int[] arr)
	{
		System.out.println("The Array Elemets:");
		for(int a: arr)
		{
			System.out.println("Array  :"+a);
		}
	}
	//insertion Operation
	public static void insertionOperation(int[] arr)
	{
		int item=10, k=3;
		int n=arr.length;
		int newarr[] =new int[n+1];
		System.out.println("Insert array Position "+k+"  values "+item);
		for(int i=0;i<newarr.length;i++)
		{
			if(i<k-1)
				newarr[i]=arr[i];
			else if(i==k)
				newarr[i]=item;
			else
				newarr[i]=arr[i-1];
			System.out.println("Insertion Array :"+newarr[i]);
		}
			
		
		
	}

	public static void main(String[] args) {
		
		int[] arr= {1,3,5,7,8};
		
		//Basic Operations Array
		// 1.Traverse
		traverseOperation(arr);
		insertionOperation(arr);
		
		

		
		
		
	}

}
