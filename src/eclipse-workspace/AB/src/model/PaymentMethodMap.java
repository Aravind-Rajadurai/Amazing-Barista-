package model;

public class PaymentMethodMap
{
	//Standard Benefits Array
	PaymentMethod mapOfPaymentMethods[] = 
	{
			new PaymentMethod(0,"No payment method used", 0),
			new PaymentMethod(1,"Cash payment method used", 0),
			new PaymentMethod(2,"Paper Check payment method used", 0),
			new PaymentMethod(3,"Visa payment method used", 0),
			new PaymentMethod(4,"MasterCard payment method used", 0),
			new PaymentMethod(5,"Discovery payment method used", 0),
			new PaymentMethod(6,"AMEX payment method used", 0),
	};
	
	//Default Constructor not necessarily needed yet.
	
	public PaymentMethod[] getPaymentMethodMap()
	{
		return mapOfPaymentMethods;
	}
	
	public String getPaymentMethod(int userPaymentMethodType)
	{
		for(int i = 0; i < mapOfPaymentMethods.length; i++)
		{
			if(userPaymentMethodType == mapOfPaymentMethods[i].getPaymentMethodType())
				return mapOfPaymentMethods[i].getPaymentMethodName();
		}
		System.out.println("Benefits not found for user type!");
		return mapOfPaymentMethods[0].getPaymentMethodName();
	}
	
}