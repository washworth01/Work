package factorials;

public class Factorials {

	public static void main(String[] args) 
	{
		
		//System.out.print(returnFactorial(2));
		
	}
	
	
	public static String returnFactorial(int number)
	{
		int factorial = 1;
		
		if(number>0) {
		for(int i = 1; i <= number; i++)
		{
			
			factorial = factorial * i;
			
			if(factorial > number)
			{
				return "NONE";
			}
			else if(factorial == number)
			{
				return ("!" + i);
			}
		}
		return null;
		}
		else {
			return "NONE";
		}
	}
}

