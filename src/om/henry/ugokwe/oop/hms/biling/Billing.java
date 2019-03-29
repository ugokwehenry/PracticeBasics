package om.henry.ugokwe.oop.hms.biling;

public class Billing {
	public static double[] computePaymentAmount(Patient patient, double amount) {
        double[] payments = new double[2];
        
        HealthInsurancePlan patientInsurancePlan = patient.getInsurancePlan();
        if (patientInsurancePlan instanceof PlatinumPlan){
        	double insuredAmount = amount * 0.9;
        	double uninsuredAmount = ((amount - insuredAmount) - 50);
        	payments  = new double []{insuredAmount, uninsuredAmount};
        }else if(patientInsurancePlan instanceof GoldPlan){
        	double insuredAmount = amount * 0.8;
        	double uninsuredAmount = ((amount - insuredAmount) - 40);
        	payments  = new double []{insuredAmount, uninsuredAmount};
        }else if(patientInsurancePlan instanceof SilverPlan){
        	double insuredAmount = amount * 0.7;
        	double uninsuredAmount = ((amount - insuredAmount) - 30);
        	payments  = new double []{insuredAmount, uninsuredAmount};
        }else if(patientInsurancePlan instanceof BronzePlan){
        	double insuredAmount = amount * 0.6;
        	double uninsuredAmount = ((amount - insuredAmount) - 25);
        	payments  = new double []{insuredAmount, uninsuredAmount};
        }else{
        	double insuredAmount = amount;
        	double discount = ( insuredAmount - 20);
        	payments  = new double []{insuredAmount, discount};
        }
        // your logic        

        return payments;
    }
}
