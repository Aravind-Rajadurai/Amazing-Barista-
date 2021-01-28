package model;

public class Transaction 
{
	private int paymentType;
	private float transactionAmountRecieved;
	private float transactionAmountNeeded;
	private float transactionAmountRemaining;
	private boolean transactionRefunded; // Is set false by default
	private boolean transactionRecieved; // Is set false by default
	
	//Default Constructor
	public void Transaction()
	{
		paymentType = 0;
		transactionAmountRecieved = 0;
		transactionAmountNeeded = 0;
		transactionAmountRemaining = 0;
	}
	
	//Constructor with Arguments
	public void Transaction(int transactionPaymentType,float transactionTotal,float transactionPaymentTotal)
	{
		paymentType = transactionPaymentType;
		transactionAmountNeeded = transactionTotal;
		transactionAmountRecieved = transactionPaymentTotal;
		transactionAmountRemaining = transactionTotal - transactionPaymentTotal;
	}
	//Accessor method for getting the transaction payment Type
	public int getTransactionPaymentType()
	{
		return paymentType;
	}
	//Mutator method for setting a User Name
	public void setTransactionPaymentType(int paymentTypeToSet)
	{
		paymentType = paymentTypeToSet;
	}
	//Accessor method for getting the transaction amount recieved
	public float getTransactionAmountRecieved()
	{
		return transactionAmountRecieved;
	}
	//Mutator method for setting the transaction amount recieved
	public void setTransactionAmountRecieved(float transactionAmountRecievedToSet)
	{
		transactionAmountRecieved = transactionAmountRecievedToSet;
	}
	//Accessor method for getting the transaction amount still needed
	public float getTransactionAmountNeeded()
	{
		return transactionAmountNeeded;
	}
	//Mutator method for setting the transaction amount still needed
	public void setTransactionAmountNeeded(float transactionAmountNeededToSet)
	{
		transactionAmountNeeded = transactionAmountNeededToSet;
	}
	//Accessor method for getting the remaining transaction amount
	public float getTransactionAmountRemaining()
	{
		return transactionAmountRemaining;
	}
	//Mutator method for setting the remaining transaction amount
	public void setTransactionAmountRemaining(float transactionAmountRemainingToSet)
	{
		transactionAmountRemaining = transactionAmountRemainingToSet;
	}
	
	public boolean paymentReceived()
	{
		transactionRecieved = true;
		return transactionRecieved;
	}
	
	void refund()
	{
		isRefunded();
		
	}
	
	boolean isRefunded()
	{
		transactionRefunded = true;
		return transactionRefunded;
	}
}
