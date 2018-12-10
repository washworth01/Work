package cakeTemplate;

public class LayerCake extends CakeTemplate
{

	@Override
	public void selectCake()
	{
		System.out.println("Selected Layer Cake");
	}

	@Override
	public void selectIngredients() 
	{
		System.out.println("Acquiring: Butter, Eggs, Sugar, Vanilla extract, Flour, Cocoa solids, Baking Power, Milk.");
	}

	@Override
	public int numberOfLayers() 
	{
		return 6;
	}
	
	@Override
	public boolean isGanache()
	{
		return false;
	}
}
