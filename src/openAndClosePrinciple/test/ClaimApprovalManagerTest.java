package openAndClosePrinciple.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import openAndClosePrinciple.ClaimApprovalManager;
import openAndClosePrinciple.surveyor.HealthInsuranceSurveyor;
import openAndClosePrinciple.surveyor.VehicleInsuranceSurveyor;

class ClaimApprovalManagerTest {
	HealthInsuranceSurveyor healthSurveyor = new HealthInsuranceSurveyor();
	VehicleInsuranceSurveyor vehicleSurveyor = new VehicleInsuranceSurveyor();
	ClaimApprovalManager claimManager = new ClaimApprovalManager();
	

	@BeforeEach
	void setUp() throws Exception {
		
	}

	
	@Test
	void test() {
		assertTrue(true, "c'est bon !!!");
	}
	@Test
    public void testProcessClaim() throws Exception {
		
		System.out.println("*********** Health **************");
		claimManager.processClaim(healthSurveyor);
		
		System.out.println("*********** Vehicle **************");
		claimManager.processClaim(vehicleSurveyor);
	}

}
