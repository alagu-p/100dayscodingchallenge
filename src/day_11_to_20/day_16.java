package day_11_to_20;

import java.util.Arrays;

public class day_16 {
	
	/*.Bubble Sort
	important steps:
	1.	loop
	2.	compare -edges end element
	3.	swap -  first element grader than secound element swap should happen --34>20 ==>20,34 
	⦁	 multiple passes over a given input array and swapping the unordered elements next to each other in the array.   
	⦁	the sorted array of the sorted list will bubble up to the end of the array.
	⦁	towards the end
	for example
	25,35,15,10,5,3 (arr)
	bubbleSort(arr)
		length=length(arr)
		for(i=1 until length)
		for(j=0 until length -1)
			if(arr[j]>arr[j+1])
				swap(arr,j,j+1)
	step:j=0==> 25,35,15,10,5,3  
	step:j=1==> 25,15,35,10,5,3
	step:j=2==> 25,15,10,35,5,3 
	step:j=3==> 25,15,35,10,5,35,3 
	step:j=4==> 25,15,35,10,5,3,35
	not loop end loop o(n2) there is worst case scanrio run time complexity 

* Array print in single line 
* 		Arrays.toString(arr);
*/
	public static void main(String[] args) {
		int[] arr= {22,33,22,121,12};
		sort(arr);
		System.out.println(Arrays.toString(arr));
		

	}
	public static void sort (int[] numbers)
	{
		for(int i=1;i<numbers.length;i++)
		{
			for(int j=0;j<numbers.length-1;j++)
			{
				if(numbers[j]>numbers[j+1])
				{
					int temp=numbers[j];
					numbers[j]=numbers[j+1];
					numbers[j+1]=temp;
				}
				
			}
		}
		for(int a:numbers)
			System.out.println("Arrays   :"+a);
	}

}
