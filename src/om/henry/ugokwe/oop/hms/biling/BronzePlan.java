package om.henry.ugokwe.oop.hms.biling;

public class BronzePlan extends HealthInsurancePlan{
	@Override
	public double computeMonthlyPremium(double salary, int age, boolean smoking) {
		return 0.05 * salary + getOfferedBy().computeMonthlyPremium(this, age, smoking);
	}
}
