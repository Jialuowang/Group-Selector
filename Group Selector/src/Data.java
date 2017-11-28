public class Data
{
	int currentGrade;
	String lastName;
	String firstName;

	public Data(int c, String l, String f)
	{
		currentGrade = c;
		lastName = l;
		firstName = f;
	}

	public int getCurrentGrade()
	{
		return currentGrade;
	}

	public void setCurrentGrade(int currentGrade)
	{
		this.currentGrade = currentGrade;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
}