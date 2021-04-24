package openAndClosePrinciple;
import openAndClosePrinciple.surveyor.Surveyor;

public class ClaimApprovalManager {
	
	public void processClaim (Surveyor surveyor) {
		if(surveyor.isValidClaim()) {
			System.out.println("-----------------");
			System.out.println("ClaimApprovalManager: Valid claim.");
			System.out.println("Currently processing claim for approval....");
		}
		
	}
	
}
