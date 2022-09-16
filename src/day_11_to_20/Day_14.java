package day_11_to_20;

import javax.swing.plaf.synth.SynthOptionPaneUI;

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
		System.out.println("-------------------------------------");
		//2.Insertion
		insertionOperation(arr);
		System.out.println("-------------------------------------");
		//3.Deletion Operation
		deletionOperation(arr);
		System.out.println("-------------------------------------");
		//4.Search Operation
		searchOperation(arr);
		System.out.println("-------------------------------------");
		//5.Update Operation
		updateOperation(arr);
			
	}
	
	
	private static void updateOperation(int[] arr) {
	
		int value=9,postion=4;
		System.out.println("Update Array Position :"+postion+" value :"+value);
		for(int i=0;i<arr.length;i++)
		{
			if(i==postion)
			{
				arr[i]=value;
			}
			System.out.println("Array Position :"+i+"  value :"+arr[i]);
			
		}
		
	}
	private static void searchOperation(int[] arr) {
		
		int n=5;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==n)
			{
				System.out.println("search value: "+n+"  Position :"+i);
				break;
			}
		}
		
		
	}
	private static void deletionOperation(int[] arr) {
		
		int index=4;
		int n=arr.length;
		
		int[] newarr=new int[n-1];
		 
		for(int i=0,k=0;i<n;i++)
		{
			if(i==index)
				continue;
			newarr[k++]=arr[i];
		}
		System.out.println("Deleting Index Postion :"+index);
		System.out.println("After Deleting Array ");
		
		for(int i=0;i<newarr.length;i++)
			System.out.println("Array "+i+"value :"+newarr[i]);
		
		
	}

}
