public class RoboResume {

	private NameAndEmail nameNEmail;
	private Education edu;
	private Work work;
	private Skills skills;
	
	public RoboResume(){
		this.nameNEmail = new NameAndEmail();
		this.edu = new Education();
		this.work = new Work();
		this.skills = new Skills();
	}

	// Name And Email Methods
	public String getRoboResumeNameNEmail() {
		nameNEmail.getNameAndEmail();
		return "";
	}

	public String setRoboResumeNameNEmail() {
		nameNEmail.setNameAndEmail();
		return "";
	}

	// Education Methods
	public String getRoboResumeEducation() {
		edu.getEducation();
		return "";
	}

	public String setRoboResumeEducation() {
		edu.setEducation();
		return "";
	}

	// Work Methods

	public String getRoboResumeWork() {
		work.getWork();
		return "";
	}

	public String setRoboResumeWork() {
		work.setWork();
		return "";
	}

	// Skills Methods

	public String getRoboResumeSkills() {
		skills.getSkills();
		return " ";
	}

	public String setRoboResumeSkills() {
		skills.setSkills();
		return "";
	}

	// To String
	
	public String toString(){
		System.out.println("========================================");
		nameNEmail.getNameAndEmail();
		System.out.println(" ");
		System.out.println("EDUCATION");
		edu.getEducation();
		System.out.println(" ");
		System.out.println("WORK");
		work.getWork();
		System.out.println(" ");
		System.out.println("SKILLS");
		skills.getSkills();
		
		return "";
	}
}
