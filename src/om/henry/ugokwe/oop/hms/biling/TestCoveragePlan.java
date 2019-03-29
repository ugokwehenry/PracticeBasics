package om.henry.ugokwe.oop.hms.biling;

import java.util.Arrays;

public class TestCoveragePlan {

	public static void main(String[] args) {
		HealthInsurancePlan insurancePlan = new PlatinumPlan();
		Patient patient = new Patient();
		//patient.setInsurancePlan(insurancePlan);
		
		double[] payments = Billing.computePaymentAmount(patient, 950.00);
		
		
		
		System.out.println(Arrays.toString(payments));
	}

}
