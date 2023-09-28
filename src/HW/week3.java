package HW;

public class week3 {
	public static void main(String args[])
	{
		//initializing the array
		GenericArray intArray = new GenericArray(10);
		//populating the array
		int i;
		for(i=0; i<intArray.size();i++)
		{
			intArray.set(i, 5*i);
		}
		//retrieving and printing the values of the array
		displayArray(intArray, "ints");
		//Modify the array
		for(i=0; i<intArray.size();i++)
		{
			intArray.set(i, 2*i);
		}
		//Check the size
		System.out.println("The size of the array is " + intArray.size());
		//Check if the array is empty
		checkIfEmpty(intArray);
		
		//Now doing the same with a string array
		//initializing the array
				GenericArray stringArray = new GenericArray(4);
				//populating the array
				String[] s = {"how", "now", "brown", "cow"};
				String[] s2 = {"a", "b", "c", "d"};
				for(i=0; i<stringArray.size();i++)
				{
					stringArray.set(i, s[i]);
				}
				//retrieving and printing the values of the array
				displayArray(stringArray, "strings");
				//Modify the array
				for(i=0; i<stringArray.size();i++)
				{
					stringArray.set(i, s2[i]);
				}
				//Check the size
				System.out.println("The size of the array is " + stringArray.size());
				//Check if the array is empty
				checkIfEmpty(stringArray);
	}
	//print array
	public static void displayArray(GenericArray g, String dataType)
	{
		System.out.println("This is a GenericArray of " + dataType);
		int i;
		for(i=0;i<g.size();i++)
		{
			System.out.println(g.get(i));
		}
	}
	//tells the world if the array is empty
	public static void checkIfEmpty(GenericArray g)
	{
		String filling;
		if(g.isEmpty())
		{
			filling = "is";
		}else
		{
			filling = "isn't";
		}
		System.out.println("The array " + filling + " empty");
	}
}
