package Algorithms;

public class Sort 
{	
	public static <T extends Comparable<T>> T[] Bubble(T[] arr)
	{
		for(int i=0; i<arr.length-1; i++)
			for(int j=0; j<arr.length-i-1; j++)
			{
				if(arr[j].compareTo(arr[j+1]) > 0)
				{
					T temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}		
		return arr;		
	}
	
	public static <T extends Comparable<T>> T[] Insertion(T[] arr)
	{
		for(int i = 1; i<arr.length; i++)
		{
			T value = arr[i];
			int j = i-1;
			for(; j>=0 && (arr[j].compareTo(value) > 0); j--)
			{					
				arr[j+1] = arr[j];
			}
			arr[j+1] = value;
		}			
		return arr;
	}
	
	public static <T extends Comparable<T>> T[] Selection(T[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			int index = i;
			for(int j = i+1; j < arr.length; j++)			
				if(arr[i].compareTo(arr[j]) > 0) index = j;
			
			T temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}
}
