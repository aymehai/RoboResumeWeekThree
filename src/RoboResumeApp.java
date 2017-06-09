import java.util.Scanner;

public class RoboResumeApp {

	public static void main(String[] args) {
		
		
		RoboResume newUser = new RoboResume();
		
		newUser.setRoboResumeNameNEmail();
		newUser.setRoboResumeEducation();
		newUser.setRoboResumeWork();
		newUser.setRoboResumeSkills();
		
		newUser.toString();
		
	}

}
