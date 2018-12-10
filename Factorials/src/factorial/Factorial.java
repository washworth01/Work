package factorial;

public class Factorial 
{
	public static void main(String[] args)
	{
		System.out.print(factorial(121));
	}
	
	public static String factorial(int number)
	{
		int factorial = number;
		
		for (int i = 1; i < number; i++)
		{
			factorial = factorial / i;
			
			if(factorial == 1)
			{
				return ("!" + i);
			}
			else if(factorial )
			return "NONE";
		}
	}
}
