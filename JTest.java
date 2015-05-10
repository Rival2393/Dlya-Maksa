package Algorithms;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class JTest {
	
	Integer[] arr;
	Integer[] sorted;
	Integer[] result;
 	
	@Before
	public void setup()
	{		
		Random rnd = new Random();
		Integer[] temp = new Integer[1000];
		for(int i = 0; i<temp.length; i++)
		{
			temp[i] = Integer.valueOf(rnd.nextInt(20));
		}
		arr = temp;
		sorted = Sort.Bubble(arr);
	}
	
	//@Ignore
	@Test
	public void bubbleTest() {
		result = Sort.Bubble(arr);
		assertArrayEquals("Fail", result, sorted);		
	}
	
	//@Ignore
	@Test
	public void insertionTest()
	{
		result = Sort.Insertion(arr);		
		assertArrayEquals("Fail", result, sorted);
	}
		
	//@Ignore
	@Test
	public void selectionTest()
	{
		result = Sort.Selection(arr);		
		assertArrayEquals("Fail", result, sorted);
	}

}
