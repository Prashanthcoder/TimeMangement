package timemanagement;
import java.util.*;
public class Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the student name: ");
			String name = sc.nextLine();
			System.out.println("Enter your marks");
			int marks = sc.nextInt();
			Student s = new Student(name, marks);
			Result res = new Result();
			String result = res.checkResult(s);
			Main m = new Main();
			if(result.equalsIgnoreCase("fail")) {
				System.out.println("Oh! its okay study better use our app to track progress for free!");
				
				m.runTracker();
			}else {
				System.out.println("Great job! You want to be more better use our progress tracker");
				m.runTracker();
			}
			System.out.println(s.std_name+ "  secured : "+s.marks);
	}

}
