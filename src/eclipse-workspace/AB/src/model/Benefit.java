package model;

public class Benefit
{
	private int benefitType;
	private double benefitPercentage;
	
	//default constructor
	public Benefit()
	{
		benefitType = 0;
		benefitPercentage = .05;
	}
	//Constructor with arguments
	public Benefit(int typeOfBenefit,double percentageOfBenefit)
	{
		benefitType = typeOfBenefit;
		benefitPercentage = percentageOfBenefit;
	}
	
	public int getBenefitType()
	{
		return benefitType;
	}
	
	public double getBenefitPercentage()
	{
		return benefitPercentage;
	}
}