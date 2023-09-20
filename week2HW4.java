package HW;
import java.util.*;

public class week2HW4 {
	public static void main(String[] args)
	{
		Integer[] nums = {2, 8, 3, 4, 5, 65, 7, 8, 3, 10};
		IterableArray array = new IterableArray(nums);
		
		Iterator<Integer> looper = array.iterator();
		while(looper.hasNext())
		{
			int i = looper.next();
			System.out.println(i);
		}
		System.exit(0);
	}
}
