package HW;
import java.util.*;
import java.lang.Iterable;

public class IterableArray implements Iterable<Integer>
{
	private Integer[] array;
	
	public IterableArray(Integer[] a)
	{
		this.array = a;
	}
	@Override
	public Iterator<Integer> iterator()
	{
		return new HappyIterator(array);
	}
	//class in a class! For iterating!!
	public class HappyIterator implements Iterator<Integer>
	{
		private int index = 0;
		List<Integer> insideList;
		
		//constructor
		private HappyIterator(Integer[] a)
		{
			this.insideList = Arrays.asList(a);
		}
		
		@Override
		public boolean hasNext()
		{
			if(insideList.size() <= index)
			{
				return false;
			}
			return true;
		}
		
		@Override
		public Integer next()
		{
			Integer element = insideList.get(index);
			index++;
			return element;
		}
	}
}
