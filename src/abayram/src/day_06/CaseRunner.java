package day_06;

public class CaseRunner {

	public static void main(String[] args) {
		/*
	     * Create CaseRunner class
	     * actualCase=Covid 19
	     * isTested=true
	     * conclusion=Tested Negative
	     * 
	     * if conclusion contains "negative" print "You can go to work"
	     * otherwise print "15 days quarantine"
		*/
		
		//I must use setter method to assign values
		
		Case caseObject = new Case();
		caseObject.setActualCase("Covid 19");
		caseObject.setTested(true);
		caseObject.setConclusion("Tested Negative");
		
		
		if (caseObject.getConclusion().toLowerCase().contains("negative")) {
			System.out.println("You can go work");
		} else System.out.println("15 days quarantine");
		
		// create patient object or use Patient class
		Patient patient = new Patient();
		
		patient.setFirstName("John");
		patient.setLastName("Cash");
		System.out.println("First name : " + patient.getFirstName());
		System.out.println("Last name : " +patient.getLastName());
		
		
		//setCaseOptions accepts case object
		patient.setCaseOptions(caseObject);
	
		
		//Step : used class object and getter to print the values
		System.out.println(patient.getCaseOptions().getActualCase());
		System.out.println(patient.getCaseOptions().getConclusion());
		System.out.println(patient.getCaseOptions().isTested());

		
		
	}

}
