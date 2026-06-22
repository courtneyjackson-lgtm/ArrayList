package Student;

import java.util.ArrayList;


public class Main {

	public static void SelectSort(ArrayList <Student> Students) {
		int j = Students.size();
		
		for (int i = 0; i < j - 1; i++) { 
			int min_index = i;
		
		for (int k = i + 1; k < j; k++) {
			if (Students.get(k).rollno < Students.get(min_index).rollno) { 
				min_index = k;
			}
		}
		if (min_index != i ) {
			Student temp = Students.get(i);
			Students.set(i, Students.get(min_index));
			Students.set(min_index, temp);
		}
	}
}
	
	public static void main(String[] args) {
		ArrayList <Student> Students = new ArrayList<>();
		Students.add(new Student(55, "Cathy", "777 Oak Dr"));
		Students.add(new Student(15, "Carl", "183 Fiber St"));
		Students.add(new Student(40, "Dave", "829 Cedar St"));
		Students.add(new Student(25, "Bobby", "397 Pine Dr"));
		Students.add(new Student(10, "Courtney", "431 Fire Dr"));
		Students.add(new Student(35, "Mia", "587 Line Ave"));
		Students.add(new Student(30, "Raven", "209 Jackson Ave"));
		Students.add(new Student(45, "Michael", "873 South Ave"));
		Students.add(new Student(50, "Whitney", "554 North Dr"));
		Students.add(new Student(20, "Kevin", "124 Wood St"));
		
		SelectSort(Students);
		System.out.println("Sorted Names: ");
		for (Student st : Students) {
			System.out.println(st);
		}
	}
}





