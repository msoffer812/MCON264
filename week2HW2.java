package HW;
import java.util.*;
import java.io.*;

public class week2HW2 {
	//25 minutes
	public static void main(String[] args)
	{
		int i,a;
		String input, name, manufact;
		String message;
		Map<String, String> map = new TreeMap<>();
		String[][] shoes = new String[3][5];
		String[] shoe = new String[2];
		for(i=0; i<5; i++)
		{
			manufact = textEntry("Enter the manufacterer's name");
			for(a=0;a<2;a++)
			{
				message = "Enter shoe " + (a+1) + " from " + manufact + ":";
				input = textEntry(message);
				shoe[a] = input;
			}
			insertIntoMap(shoe, manufact, map);
		}
		for(Map.Entry<String, String> entry : map.entrySet())
		{
			System.out.println("Shoe name: " + entry.getKey() + " Manufacterer: " + entry.getValue());
		}
		System.exit(0);
	}
	public static String textEntry(String message)
	{
		String input;
		System.out.println(message);
		Scanner in = new Scanner(System.in);
		input = in.nextLine();
		return input;
	}
	public static void insertIntoMap(String[] names, String manufact, Map m)
	{
		int i;
		for(i=0;i<2;i++)
		{
			m.put(names[i], manufact);
		}
	}
}
