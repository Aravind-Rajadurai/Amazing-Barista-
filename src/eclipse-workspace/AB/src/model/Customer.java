package model;

public class Customer extends ModelUser
{
	private Order currentOrder[];
	
	//Default constructor for customer
	//Creates a guest customer
	public Customer()
	{
		super("Guest Customer", "Password", 0);
	
	}
	//Constructor with arguments
	public Customer(String customerName, String customerPass, int customerType)
	{
		super(customerName, customerPass, customerType);
	}
	//Boolean method to check if customer is a guest user
	public boolean isGuest()
	{
		if(getType() == '0')
			return true;
		else
			return false;
	}
	//Boolean method to check if customer is a Member
	public boolean isMember()
	{
		if(getType() == '1')
			return true;
		else
			return false;
	}
	//Boolean method to check if customer is an employee
	public boolean isEmployee()
	{
		if(getType() == '2')
			return true;
		else
			return false;
	}
}