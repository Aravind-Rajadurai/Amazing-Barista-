package model;

public class BenefitsMap
{
	//Standard Benefits Array
	Benefit mapOfBenefits[] = 
	{
			new Benefit(0,.05),
			new Benefit(1,.10),
			new Benefit(2,.15)
	};
	
	//Default Constructor not necessarily needed yet.
	
	public Benefit[] getBenefitsMap()
	{
		return mapOfBenefits;
	}
	public double getBenefit(int userBenefitType)
	{
		for(int i = 0; i < mapOfBenefits.length; i++)
		{
			if(userBenefitType == mapOfBenefits[i].getBenefitType())
				return mapOfBenefits[i].getBenefitPercentage();
		}
		System.out.println("Benefits not found for user type!");
		return 0;
	}
	
}