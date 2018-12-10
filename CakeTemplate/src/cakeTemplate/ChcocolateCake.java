package cakeTemplate;

public class ChcocolateCake extends CakeTemplate
{

	@Override
	public void selectCake()
	{
		System.out.println("Selected Chocolate Cake");
	}

	@Override
	public void selectIngredients() 
	{
		System.out.println("Acquiring: Butter, Eggs, Sugar, Flour, Cocoa solids, Baking Power.");
	}

	@Override
	public int numberOfLayers() 
	{
		return 3;
	}

}
