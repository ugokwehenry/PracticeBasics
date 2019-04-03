package om.henry.ugokwe.oop.hms.biling;

public class PlatinumPlan extends HealthInsurancePlan{
	double coveragePercent = 0.9;	
	public PlatinumPlan(){
		super.setCoverage(coveragePercent);
	}
	@Override
	public double computeMonthlyPremium(double salary, int age, boolean smoking) {
		return 0.08 * salary + getOfferedBy().computeMonthlyPremium(this, age, smoking);
	}
}
