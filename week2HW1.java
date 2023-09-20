package HW;
import java.util.*;
public class week2HW1 {
	public static void main(String[] args)
	{
		ArrayList<Integer> badArray = new ArrayList<Integer>();
		int i, input;
		for(i=0; i<10; i++)
		{
			input=inputNums("Enter a number - make sure to have a few repeating from before!");
			badArray.add(input);
		}
		//first unsorted
		System.out.println("Here is the bad array:");
		System.out.println(badArray.toString());
		//then pass into module that sorts
		duplicatesRemover(badArray);
		//then print
		System.out.println("Now it's fixed!");
		System.out.println(badArray.toString());
		System.exit(0);
	}
	public static int inputNums(String message)
	{
		int input;
		System.out.println(message);
		Scanner in = new Scanner(System.in);
		input = in.nextInt();
		return input;
	}
	//method that removes the duplicates
	public static void duplicatesRemover(List l)
	{
		HashSet<Integer> goodNums = new HashSet<Integer>(l);
		l.clear();
		
		for(Integer e : goodNums)
		{
			l.add(e);
		}
		
	}
}
