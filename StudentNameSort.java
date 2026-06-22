package Student;

import java.util.Comparator;

public class StudentNameSort implements Comparator <Student> {

	@Override
	public int compare(Student a, Student b) {
		return a.getName().compareTo(b.getName());
	}
}