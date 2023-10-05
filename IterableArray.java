package HW;
import java.util.*;

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
		Integer[] insideList;
		
		//constructor
		private HappyIterator(Integer[] a)
		{
			this.insideList = a;
		}
		
		//private method to get last index that contains elements in array
		private int end(Integer[] insideList)
		{
			for(int i=insideList.length-1;i>=0;i--)
			{
				if(insideList[i] == null)
				{
					if(i != 0)
					{
						if(insideList[i-1] != null)
						{
							return i-1;
						}
					}
					else
					{
						return -1;
					}
				}
			}
			return insideList.length-1;
		}
		@Override
		public boolean hasNext()
		{
			if(index <= end(insideList))
			{
				return true;
			}
			return false;
		}
		
		@Override
		public Integer next()
		{
			Integer element = insideList[index];
			index++;
			return element;
		}
	}
}
