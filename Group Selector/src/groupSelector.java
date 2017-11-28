import java.util.*;

public class groupSelector
	{
	public static int numberOfGroups = 0;
	
	public static void main(String[] args) 
		{
		askUserHowManyGroups();
		}

	private static void askUserHowManyGroups() 
		{
		Scanner numOfGroups = new Scanner(System.in);
		System.out.println("How many groups do you want?");
		numberOfGroups = numOfGroups.nextInt();
		System.out.println("Awesome");
		}
	}
