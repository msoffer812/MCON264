package HW;

public class GenericArray <T> {
	private T[] array;
	private int length;
	
	@SuppressWarnings("unchecked")
	public GenericArray(int size)
	{
		array = (T[]) new Object[size];
		this.length = size;
	}
	//getter
	public T get(int index)
	{
		return array[index];
	}
	//setter
	public void set(int index, T value)
	{
		this.array[index] = value;
	}
	public int size()
	{
		return length;
	}
	
	public boolean isEmpty()
	{
		for(int i=0;i<array.length;i++)
		{
			if(array[i] != null)
			{
				return false;
			}
		}
		return true;
	}
}
