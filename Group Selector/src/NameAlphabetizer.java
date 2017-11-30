import java.util.Comparator;
public class NameAlphabetizer implements Comparator<Student>
{
	public int compare(Student s1, Student s2)
	//will need exact name of variable used for student 
	if(s1.getScore()<s2.getScore())
		return 1;
}
