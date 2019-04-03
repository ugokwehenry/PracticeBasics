package om.henry.ugokwe.oop.hms.biling;

public class SilverPlan extends HealthInsurancePlan{
	double coveragePercent = 0.7;	
	@Override
	public double computeMonthlyPremium(double salary, int age, boolean smoking) {
		return 0.06 * salary + getOfferedBy().computeMonthlyPremium(this, age, smoking);
	}
}
