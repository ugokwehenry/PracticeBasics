package om.henry.ugokwe.oop.hms.biling;

import java.util.ArrayList;
import java.util.Arrays;

public class TestCoveragePlan {

	public static void main(String[] args) {
	/*	HealthInsurancePlan insurancePlan = new PlatinumPlan();
		Patient patient = new Patient();
		patient.setInsurancePlan(insurancePlan);
		
		double[] payments = Billing.computePaymentAmount(patient, 950.00);
		
		double comp = insurancePlan.computeMonthlyPremium(8000);
		*/
		User staff = new User();
		InsuranceBrand insuranceBrand = new BlueCrossBlueShield();
		HealthInsurancePlan insurancePlan = new PlatinumPlan(); 
		
		insurancePlan.setOfferedBy(insuranceBrand);
		staff.setInsurancePlan(insurancePlan);
		//insurancePlan.computeMonthlyPremium(8000, 55, true);
		System.out.println(insurancePlan.computeMonthlyPremium(8000, 5, false));
	}
	

}
