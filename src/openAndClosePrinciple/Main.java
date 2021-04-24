package openAndClosePrinciple;

import openAndClosePrinciple.surveyor.HealthInsuranceSurveyor;
import openAndClosePrinciple.surveyor.VehicleInsuranceSurveyor;

public class Main {

	public static void main(String[] args) {
		System.out.println("SOLID :open and close principle");
		
		HealthInsuranceSurveyor healthSurveyor = new HealthInsuranceSurveyor();
		VehicleInsuranceSurveyor vehicleSurveyor = new VehicleInsuranceSurveyor();
		ClaimApprovalManager claimManager = new ClaimApprovalManager();
		
		System.out.println("************  Health  *************");
		claimManager.processClaim(healthSurveyor);
		System.out.println("************  Vehicle *************");
		claimManager.processClaim(vehicleSurveyor);

	}

}
