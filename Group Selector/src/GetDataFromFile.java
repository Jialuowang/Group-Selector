import java.util.*;
import java.io.*;
public class GetDataFromFile
	{
		Scanner file = new Scanner( new File("roster.txt"));
		
		ArrayList <Data> studentList = new ArrayList <Data> ( );
		
		while(file.hasNext())
			{
				String[] person = (file.nextLine()).split(" ");
				int gPA = Integer.parseInt(person[2]);
				studentList.add(new Data(gPA , person[1] , person[0]));
			}
		// test change
		//test
	}