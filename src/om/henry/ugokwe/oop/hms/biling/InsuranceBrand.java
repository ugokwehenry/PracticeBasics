package om.henry.ugokwe.oop.hms.biling;

public interface InsuranceBrand {
	public abstract double computeMonthlyPremium(HealthInsurancePlan insurancePlan,
			int age, boolean smoking);
}
