package model;

public class Order extends AbstractModel
{
	private float subtotal;
	private int arraySize;
	private int orderSize;
	private Item[] order;
	
	//Default Constructor without arguments
	//Empty array of 5 elements
	public Order()
	{
		subtotal = 0;
		arraySize = 5;
		orderSize = 0;
		order = new Item[arraySize];
	}
	
	//Constructor with arguments
	public Order(float OrderSTotal, int orderArraySize, int orderOSize, Item[] orderArray)
	{
		subtotal = OrderSTotal;
		arraySize = orderArraySize;
		orderSize = orderOSize;
		orderArray = new Item[arraySize];
	}
	public void addToOrder(Item orderItem)
	{
		order[orderSize] = orderItem;
		subtotal += orderItem.getPrice();
		orderSize++;
		ModelEvent me = new ModelEvent(orderItem,0,"order item added",0);
		notifyChanged(me);
	}
	public void removeFromOrder(int removeIndex)
	{
		//remove the Item price from the subtotal
		subtotal -= order[removeIndex].getPrice();
		//filled in the gap in the array from the removal
		for(int i = removeIndex; i < orderSize; i++)
		{
			order[i] = order[i+1];
		}
		order[orderSize] = null;
		orderSize--;
		ModelEvent me = new ModelEvent(this,0,"order removed",0);
		notifyChanged(me);
	}
	
	public void clearOrder()
	{
		subtotal = 0;
		orderSize = 0;
		ModelEvent me = new ModelEvent(this,0,"New Order",0);
		notifyChanged(me);
	}
	
	public float getOrderTotal()
	{
		return subtotal;
	}
	
	public int getOrderSize()
	{
		return orderSize;
	}
	
	public Item getOrderItem(int orderItemIndex)
	{
		return order[orderItemIndex];
	}
}
