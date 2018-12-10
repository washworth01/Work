package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Calculator 
{
	public static void main(String[] args)
	{	
		Scanner s = new Scanner(System.in);
		List<Integer> arrayOfNumbers = new ArrayList<Integer>();
		arrayOfNumbers.add(s.nextInt());
		arrayOfNumbers.add(s.nextInt());
		arrayOfNumbers.add(s.nextInt());
		
		List<Integer> orderedArray = arrayOfNumbers.stream()
				.sorted()
				.collect(Collectors.toList());
	}
	
	public static List<String> collateResults(List<Integer> listName)
	{
		
	}
	
	public static List<String> man (List<Integer> listName)
	{
		
	}
	
	public static boolean isMultiplyRelative(List<Integer> listName)
	{
		if(listName.get(0) * listName.get(1) == listName.get(2))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
