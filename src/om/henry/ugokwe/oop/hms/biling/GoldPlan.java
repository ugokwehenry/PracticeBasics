package om.henry.ugokwe.oop.hms.biling;

public class GoldPlan extends HealthInsurancePlan {
	double coveragePercent = 0.9;

	@Override
	public double computeMonthlyPremium(double salary, int age, boolean smoking) {
		return 0.07 * salary + getOfferedBy().computeMonthlyPremium(this, age, smoking);
	}
}
