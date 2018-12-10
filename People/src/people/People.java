package people;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class People 
{	
	private int personAge;
	private String personFullName;
	private String personOccupation;
	public static List<People> person = new ArrayList<People>();
	
	public People(String fullName, String occupation, int age)
	{
		personFullName = fullName;
		personOccupation = occupation;
		personAge = age;
	}
	
	public String getName()
	{
		return personFullName;
	}
	
	public String getOccupation()
	{
		return personOccupation;
	}
	
	public void setAge(int age)
	{
		personAge = age;
	}
	
	public int getAge()
	{
		return personAge;
	}
	
	public String toString()
	{
		return ("Name : " + personFullName + 
				'\n' + "Job Title : " + personOccupation + 
				'\n' + "Age : " + personAge);
	}
	
	public static boolean checkName(String name1, String name2)
	{
		if (name1.equals(name2))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}

