package model;

public abstract class ModelUser
{
	private String name;
	private String password;
	private int userType;
	
	private boolean loginRunning;  //is set as false by default
	
	//Default constructor without arguments
	//Guest account
	public ModelUser()
	{
		name = "Guest";
		password = "password";
		userType = 0;
	}
	//Constructor with arguments
	public ModelUser(String userName, String userPass, int userId)
	{
		name = userName;
		password = userPass;
		userType = userId;
	}
	//Accessor method for getting the User Name
	public String getName()
	{
		return name;
	}
	//Mutator method for setting a User Name
	public void setName(String nameToSet)
	{
		name = nameToSet;
	}
	//Accessor method for getting the User Pass
	public String getPass()
	{
		return password;
	}
	//Mutator method for setting a User Pass
	public void setPass(String passToSet)
	{
		password = passToSet;
	}
	//Accessor method for getting the User Id
	public int getType()
	{
		return userType;
	}
	//Mutator method for setting a User Id
	public void setType(int typeToSet)
	{
		userType = typeToSet;
	}
	public void login()
	{
		loginRunning = true; //base case
	}
	
	void logout()
	{
		loginRunning = false;
	}
}