package cakeTemplate;

public class Main {

	public static void main(String[] args) 
	{
		CakeTemplate cake = new ChcocolateCake();
		cake.makeCake();
		
		System.out.println();
		
		cake = new LayerCake();
		cake.makeCake();
		
		System.out.println();
	}

}
