package model;

public class PaymentMethod 
{
	private int paymentMethodType;
	private String paymentMethodName;
	private double paymentMethodAmount;
	
	//default constructor
	public PaymentMethod()
	{
		paymentMethodType = 0;
		paymentMethodName = "No payment method used";
		paymentMethodAmount = 0.0;
	}
	//Constructor with arguments
	public PaymentMethod(int typeOfPaymentMethod, String nameOfPaymentMethod, double amountByPaymentMethod)
	{
		paymentMethodType = typeOfPaymentMethod;
		paymentMethodName = nameOfPaymentMethod;
		paymentMethodAmount = amountByPaymentMethod;
	}
	
	public int getPaymentMethodType()
	{
		return paymentMethodType;
	}
	
	public String getPaymentMethodName()
	{
		return paymentMethodName;
	}
	
	public double getPaymentMethodAmount()
	{
		return paymentMethodAmount;
	}
}
