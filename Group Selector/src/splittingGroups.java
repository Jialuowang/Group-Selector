
public class splittingGroups 
	{
		// take the arraylist that jeffery gives to me going to call it "demoArray"
		public static int numberOfPeople = demoArray.size();
		public static int sizeOfGroup = (groupSelector.numberOfGroups) / (numberOfPeople);
		
		mixesUpArray();
		organizesArray();
		
		
	}
}


private static void mixesUpArray()
	{
		// this world work so that it would look at the arrayList and take the second highest student and switch it with the lowest student
		// then it would take the fourth highest and switch him with the second lowest student.
				
		int lastPerson = numberOfPeople - 1; // this gets the index of the last person in the array
				
		for(int i = 0; i < ((numberOfPeople - 1) / 2) ; i++)
			{	
				if(i % 2 == 0)
					{
						String temp = demoArray.get(i);        //wrong becasue demo array isnt real
						demoArray.get(i) = demoArray.get(lastPerson);
						demoArray.get(lastPerson) = temp;
							
						lastPerson++;
					}
			}
	}

private static void organizesArray()
	{
		for(int i = 0 ; i < groupSelector.numberOfGroups ; i++)
			{
				int groupTracker = numberOfPeople;
				for(int j = 0 ; j < sizeOfGroup ; j++)
					{
						
					}
			}
	}


