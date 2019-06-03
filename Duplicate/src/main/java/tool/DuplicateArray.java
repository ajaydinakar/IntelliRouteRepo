package tool;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.fail;

import java.util.HashSet;
import java.util.Set; 
import org.junit.Test;


public class DuplicateArray {
	private Integer[] removeDuplicates(Integer[] input) 
	{ if (input == null || input.length <= 0)
	{ return input; }
Set<Integer> aSet = new HashSet<Integer>(input.length); 
for (int i :input)
{
	aSet.add(i);
	}
return aSet.toArray((new Integer[aSet.size()]));
}

	@Test
	public void testArrayWithDuplicates() {
		Integer[] given =new Integer[] {1,2,3,3};
		Integer[] actual =removeDuplicates(given);
		Integer[] expected =new Integer[] {1,2,3};
		assertArrayEquals(expected,actual);
	}
	@Test
	public void testArrayWithOutDuplicates() {
		Integer[] given =new Integer[] {1,2,3};
		Integer[] actual =removeDuplicates(given);
		Integer[] expected =new Integer[] {1,2,3};
		assertArrayEquals(expected,actual);
	}
	@Test
	public void testArrayNull() {
		Integer[] given =null;
		Integer[] actual =removeDuplicates(given);
		Integer[] expected =null;
		assertArrayEquals(expected,actual);
	}
	@Test
	public void testwithAllDuplicates() {
		Integer[] given =new Integer[] {3,3,3,3};
		Integer[] actual =removeDuplicates(given);
		Integer[] expected =new Integer[] {3};
		assertArrayEquals(expected,actual);
	}
	@Test
	public void testwithMultipleDuplicates() {
		Integer[] given =new Integer[] {1,1,1,2,2,2,3,3,3,3};
		Integer[] actual =removeDuplicates(given);
		Integer[] expected =new Integer[] {1,2,3};
		assertArrayEquals(expected,actual);
	}
}

