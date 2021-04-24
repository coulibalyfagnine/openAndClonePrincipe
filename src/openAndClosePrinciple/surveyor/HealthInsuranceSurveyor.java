package openAndClosePrinciple.surveyor;

public class HealthInsuranceSurveyor implements Surveyor{
	
	public boolean isValidClaim() {
		System.out.println("HealthInsuranceSurveyor: Validating health insurance claim...");
        /*Logic to validate health insurance claims*/
        return true;
	}

}
