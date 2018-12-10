package people;

import people.People;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
				
		//{new People("William Ashworth","Student"),new People("Richard Nixon", "POTUS"), new People("Harold Godwinson", "King")};
		People.person.add(new People("William Ashworth", "Student", 21));
		People.person.add(new People("Richard Nixon", "POTUS", 81));
		People.person.add(new People("Harold Godwinson", "King", 44));
		
		People.person.stream().
		forEach(System.out::println);
		
		System.out.println(People.person.get(0).getName());
		
		String searchName = sc.next();
		sc.close();
		
		List<People> filtered = People.person.stream().
			filter(name -> People.checkName(searchName, People.person.get(0).getName())).
			collect(Collectors.toList());
		
		filtered.stream().forEach(System.out::println);
	}
}
