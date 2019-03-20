import java.time.LocalDate;


	public class CarPriceCalculator {
		public double accidentDeduction(boolean hasAccidentHistory, double price){
			double calculatedDeduction = 0;
			if(hasAccidentHistory){
				calculatedDeduction = (price - 3000);
			}else{
				calculatedDeduction = price;
			}
			return calculatedDeduction;
		}
		public double yearlyDepreciation(int ageOfCar, double price){
			double claculatedPrice;
			int carFirstYear = 1;
			double firstYearDeduction = price * 0.20;
			double otherYearsDeduction = (price * (0.15 * (ageOfCar - carFirstYear)));
			if(ageOfCar <= 10){
				claculatedPrice = price - (firstYearDeduction + otherYearsDeduction);
			}else {
				claculatedPrice = (price * 0.1);
			}
			return claculatedPrice;
		}
		public double claculateSecurityFeatures(int airBagsCount,boolean hasAbs, boolean hasEbd, double price ){
		double calculatedPrice ;
			if(airBagsCount >= 2 && (hasAbs && hasEbd)){
				calculatedPrice = ((airBagsCount * 500) + price);
			}else{
				calculatedPrice = price - 3000;
			}
			return calculatedPrice;
		}
		
		
		public double claulateMileOverDriven(double mile, double price){
			double computeMileOverDriven;
			if((mile > 10000) && (mile <= 10000)){
				computeMileOverDriven = (price - 500);
			}else if((mile > 10000) && (mile <= 30000)){
				computeMileOverDriven = (price - 2000);
			}else if(mile > 30000){
				computeMileOverDriven = (price - 3000);
			}else{
				computeMileOverDriven = price;
			}
			return computeMileOverDriven;
		}
		// 3. Comfort Features
		// if car has rear-view camera AND either sunroof OR auto AC then
		//    increment price by $500
		
		public double getComfortFeatures(boolean hasRearViewCamera, boolean hasSunRoof, boolean hasAutoAC, double price){
			double computeComfortFeatures = 0;
			if(hasRearViewCamera && (hasSunRoof || hasAutoAC)){
				price +=500;
				computeComfortFeatures = price;
			}
			return computeComfortFeatures;
		}
		public double getSalePrice(String makeAndModel, int yearManufactured, double milesDriven, 
				int airBagsCount, boolean hasAbs, boolean hasEbd,
				boolean hasRearViewCamera, boolean hasSunRoof, boolean hasAutoAC,
				boolean hasAccidentHistory) {
			
			double salePrice = getCurrentPrice(makeAndModel);
			int currentYear = LocalDate.now().getYear();		
			int ageOfCar = currentYear - yearManufactured + 1;
			System.out.println("ageOfCar: " +  ageOfCar);
			
				
			// 1. Compute based on yearly depreciation value:
			//       if age of car is less than or equal to 10 then
			//               price depreciates by 20% in 1st year and there after depreciates by 15% each following year
			//       else 
			//               price would be 10% of the current price, i.e., salePrice * 0.1
			// Note: Use compound arithmetic assignment operators
				
			double depreciation = yearlyDepreciation(ageOfCar, salePrice);
			salePrice = depreciation;
			
			System.out.println("salePrice after depreciation: " + salePrice);
			
			
			// 2. Security Features
			//      if car has atleast two airbags AND abs AND ebd
			//               then increment price by $500 times the number of air bags
			//      else 
			//               reduce price by $3000
			double securityFeatures = claculateSecurityFeatures(airBagsCount, hasAbs, hasEbd, salePrice);
			salePrice = securityFeatures;
			
			System.out.println("salePrice after accounting for security features: " + salePrice);
			
			// 3. Comfort Features
			// if car has rear-view camera AND either sunroof OR auto AC then
			//    increment price by $500
			double calculateComfortFeatures = getComfortFeatures(hasRearViewCamera, hasSunRoof, hasAutoAC, salePrice);
			salePrice = calculateComfortFeatures;
			
			System.out.println("salePrice after accounting for comfort features: " + salePrice);
			
			// 4. Past accidents
			// if car was involved in a car accident then
			//     reduce the price by $3000
			
			
			double accidentAmountDedeuction = accidentDeduction(hasAccidentHistory, salePrice);
			salePrice = accidentAmountDedeuction;
			
			System.out.println("salePrice after accounting for past accidents: " + salePrice);
			
			// 5. Based additional miles driven
			double expectedMilesDriven = ageOfCar * 10000.0;
			double additionalMiles = milesDriven - expectedMilesDriven;
			
			// a) if # miles overdriven by car is greater than 1000 AND less than or equal to 10000 then
			//        reduce sale price by 500
			
					
			// b) if # miles overdriven by car is greater than 10000 AND less than or equal to 30000 then
			//        reduce sale price by 2000
			
					
			// c) if # miles overdriven by car is greater than 30000 then
			//        reduce sale price by 3000
					
			double getMileOverDriven = claulateMileOverDriven(additionalMiles, salePrice);
			salePrice = getMileOverDriven;
			System.out.println("salePrice after accounting for miles driven: " + salePrice);
			
			return salePrice;
		}
		
		private double getCurrentPrice(String makeAndModel) {
			if (makeAndModel.equalsIgnoreCase("ford ecosport")) {
				return 20000.0;
			} else if (makeAndModel.equalsIgnoreCase("honda city")) {
				return 25000.0;
			} else if (makeAndModel.equalsIgnoreCase("toyota camry hybrid")) {
				return 30000.0;
			}
			return 20000.0;
		}

		public static void main(String[] args) {
			CarPriceCalculator carPriceCalculator = new CarPriceCalculator();
			double salesPrice = carPriceCalculator.getSalePrice("ford ecosport", 2018, 15000.0, 2, true, true, true, false, true, false);
		}
}
