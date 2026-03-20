package timemanagement;

public class Result {
		String checkResult(Student s) {
			if(s.marks>=35) {
				return "Pass";
			}else {
				return "Fail";
			}
		}
}
