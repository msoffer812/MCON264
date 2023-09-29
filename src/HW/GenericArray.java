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
	//copy constructor
	public GenericArray(GenericArray<T> g)
	{
		for(int i=0;i<g.size();i++)
		{
			array[i] = g.get(i);
		}
		length = g.size();
	}
	//getter
	public T get(int index)
	{
		return array[index];
	}
	private T[] getArray()
	{
		return this.array;
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
	//checks if the array is empty
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
	//Resizes the array by creating a new array, transferring the elements, and then reassigning the new array to this object. Useful for the "add()" method, 
	//this implements the logic that resizes the array so new elements can fit no matter what. It's private because there's really no use for it outside of adding elements - 
	//if someone were to want to resize to a smaller array, that would be complicated and might need to delete elements. 
	private void resize(int newSize)
	{
		GenericArray newG = new GenericArray(newSize);
		int i;
		
			for(i=0;i<length; i++)
			{
				newG.set(i, array[i]);
			}
		//Assigning fields to fields
		this.array = (T[]) newG.getArray(); 
		this.length = newSize;
	}
	//This is how you can add elements to the end. It also automatically resizes by calling resize();
	public void add(T element)
	{
		//first checking to see if any null values at the end, so we wouldn't need to resize
		if(array[length-1] == null)
		{
			int i = length-1;
			int index=(length-1);
			boolean cont = true;
			if(this.isEmpty())//The loop below will not work if all the way to the beginning the values are null. Then we need to specify that index = 0
			{
				index = 0;
			} else
			{
				while(cont)
				{
					if(array[i] != null)//basically, it works backwards down the array. Once it finds a not-null value, it will break the loop and the index will be set as the one before it. 
					{
						index = i+1;
						cont = false;
					}
					i--;
				}	
			}
			array[index] = element;
		}else
		{
			this.resize(length + 1);
			array[length-1] = element;
		}
		
	}
}
