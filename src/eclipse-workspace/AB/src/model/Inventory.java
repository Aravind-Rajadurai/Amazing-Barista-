package model;

public class Inventory extends Item
{
	//This class defines the inventory of drinks available to users of the app for
	//purchase and use of said drinks
	public enum drinks 
	{
		WATER, LEMONADE, KOMBUCHA, LIMEADE, KOOLADE
	}
	
	//Standard drink inventory Array
	Item mapOfdrinkss[] = 
	{
			new Item("Water", "Drinking Water", 0),
			new Item("Lemonade", "Water with lemon juice and brown sugar", 1),
			new Item("Kombucha", "Probiotic drink from India, great for gut flora", 4),
			new Item("Limeade", "Water with lime juice and brown sugar", 1),
			new Item("Koolade", "Water stirred with Koolade drink mix", 1)
	};
	
	//Default Constructor not necessarily needed yet.
	
	public Item[] getDrinkOptions()
	{
		return mapOfdrinkss;
	}
}