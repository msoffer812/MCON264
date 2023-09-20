package HW;
import java.util.*;
public class week2Code3 {
	public static void main(String[] args)
	{
		Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		IterableArray array = new IterableArray(nums);
		for(Integer n : array)
		{
			System.out.println(n);
		}
	}
}
