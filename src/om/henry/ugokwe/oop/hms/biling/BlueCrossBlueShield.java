package om.henry.ugokwe.oop.hms.biling;

public class BlueCrossBlueShield implements InsuranceBrand {
	private long id;
	private String name;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public double computeMonthlyPremium(HealthInsurancePlan insurancePlan,
			int age, boolean smoking) {
		double charges = 0;
		if (((insurancePlan instanceof PlatinumPlan) && age > 55)
				&& smoking == true) {
			charges = (100 + 200);
		} else if ((insurancePlan instanceof PlatinumPlan) && smoking == true) {
			charges = 100;
		} else if ((insurancePlan instanceof PlatinumPlan) && age > 55) {
			charges = 200;
		} 
		
		if (((insurancePlan instanceof GoldPlan) && age > 55)
				&& smoking == true) {
			charges = (150 + 90);
		} else if ((insurancePlan instanceof GoldPlan) && smoking == true) {
			charges = 90;
		} else if ((insurancePlan instanceof GoldPlan) && age > 55) {
			charges = 150;
		}

		if (((insurancePlan instanceof SilverPlan) && age > 55)
				&& smoking == true) {
			charges = (100 + 80);
		} else if ((insurancePlan instanceof SilverPlan) && smoking == true) {
			charges = 80;
		} else if ((insurancePlan instanceof SilverPlan) && age > 55) {
			charges = 100;
		}

		if ((insurancePlan instanceof BronzePlan) && age > 55) {
			charges = 50;
		} else if ((insurancePlan instanceof BronzePlan) && smoking == true) {
			charges = 70;
		} else if (((insurancePlan instanceof BronzePlan) && age > 55)
				&& smoking == true) {
			charges = (50 + 70);
		}
		return charges;
	}
}
