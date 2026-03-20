package timemanagement;

public class Tracker {
		Subject[] subjects = new Subject[20];
		int count =0;
		void addSubject(String name, int goalHours) {
				if(count == subjects.length) {
					System.out.println("goal lists are full.");
					return;
				}
				for(int i = 0;i<count;i++) {
					if(subjects[i].subject.equalsIgnoreCase(name)) {
						System.out.println("This "+name + " is already present in you list");
						return;
					}
				}
				subjects[count] = new Subject(name, goalHours);
				count++;
				System.out.println("Subject added successfully!");
		}
		void logHours(String name, int hours) {
			for(int i = 0;i<count;i++) {
				if(subjects[i].subject.equalsIgnoreCase(name)) {
					
				}
			}
		}
}
