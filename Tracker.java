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
					if(hours<0) {
						System.out.println("Invalid hours");
						return;
					}
					
					subjects[i].totalHours += hours;
					System.out.println("Updated the hours!");
					return;
				}
			}
			System.out.println("Subject Not found");
		}
		
		void viewprogress() {
			if(count ==0) {
				System.out.println("No subject added");
				return;
			}
			for(int i =0;i<count;i++) {
				Subject s = subjects[i];
				double percent = (s.totalHours*100)/s.goalHours;
				System.out.println(s.subject+" -> " + s.totalHours+"/"+s.goalHours+" hours ("+percent+"%");
			}
		}


void findTopSubject() {
	if(count ==0) {
		System.out.println("There is no subject found");
		return;
	}
	Subject top = subjects[0];
	for(int i = 1;i<count;i++) {
		if(subjects[i].totalHours> top.totalHours) {
			top = subjects[i];
		}
		
	}
	System.out.println("Top subject : "+top.subject);


}
void checkGoals() {
	boolean found = false;
	for(int i =0;i<count;i++) {
		if(subjects[i].totalHours>=subjects[i].goalHours) {
			System.out.println("Goal completed! "+subjects[i].subject);
			found = true;
		}
	}
	if(!found) {
		System.out.println("No goals Completed yet!");
	}
}
}