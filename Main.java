package timemanagement;
import java.util.Scanner;


public class Main {
		void runTracker() {
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Tracker track = new Tracker();
		while(true) {
		System.out.println("Choose your option: ");
		System.out.println("1. Add subject and Goal Hours ");
		System.out.println("2. Log Hours worked");
		System.out.println("3. view progress");
		System.out.println("4. Find top subject");
		System.out.println("5. Check Goals");
		System.out.println("6. Exit");
		System.out.println("Enter your option: ");
		int choice = sc.nextInt();
		sc.nextLine();
		switch(choice) {
		case 1: System.out.println("Enter you subject name: ");
		String name = sc.nextLine();
		System.out.println("Enter your goalhours");
		int hours = sc.nextInt();
		track.addSubject(name, hours);
		break;
		case 2:System.out.println("enter the subject you worked for");
		String sub = sc.nextLine();
			System.out.println("Enter no. of hours worked");
			int w_hours = sc.nextInt();sc.nextLine();
		track.logHours(sub, w_hours);
		break;
		case 3: track.viewprogress();
		break;
		case 4: track.findTopSubject();
		break;
		case 5: track.checkGoals();
		break;
		case 6: System.out.println("Exiting...");
		break;
		default: System.out.println("Invalid choice choose in between 1-6");
		break;
		}
			
	}

}
}

