package model;

public class Item 
{

	// name of item
	private String name;
	// item description
	private String description;
	// item price
	private float price;

	// Default Constructor without arguments
	// generation of sample item:
	public Item() 
	{
		name = "AbstractItem";
		description = "Example Item Generated";
		price = 0;
	}

	// Constructor with arguments
	public Item(String itemName, String itemDescription, float itemPrice) 
	{
		name = itemName;
		description = itemDescription;
		price = itemPrice;
	}

	public void setName(String nameToSet) 
	{
		name = nameToSet;
	}

	public String getName() 
	{
		return name;
	}

	public void setDescription(String descriptionToSet) 
	{
		description = descriptionToSet;
	}

	public String getDescription() 
	{
		return description;
	}

	public void setPrice(float priceToSet) 
	{
		price = priceToSet;
	}

	public float getPrice() 
	{
		return price;
	}
}