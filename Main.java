package Student;

import java.util.ArrayList; 

import java.util.Random; 

 

public class Main { 

 

	public static void sort(ArrayList <Student> Students) { 

		RollNoSort rollnosort = new RollNoSort(); 

		int j = Students.size(); 

		 

		for (int i = 0; i < j - 1; i++) 

		{ int min_index = i; 

		 

		for (int k = i + 1; k < j; k++) 

			if (rollnosort.compare(Students.get(k), Students.get(min_index)) < 0) 

				min_index = k; 

		Student temp = Students.get(min_index); 

		Students.set(min_index, Students.get(i)); 

		Students.set(i,temp); 

		} 

	} 

 

	public static void main(String[] args) { 

		Random random = new Random(); 

		ArrayList <Student> Students = new ArrayList<>(); 

		for (int i = 0; i < 10; i++) { 

			int rollno = random.nextInt(50); 

			String name = "Name" + i; 

			String address = "Address" + i; 

			Students.add(new Student(rollno, name, address)); 

		} 

		sort(Students); 

	 

		System.out.println("Student that are sorted: "); 

		for (Student s : Students) { 

			System.out.println(s); 

		} 

	} 

 

} 





