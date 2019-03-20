
public class MoneyTransferService {
	CurrencyConverter cc = new CurrencyConverter();
	  double computeTransferAmount(int countryIndex, double amount) {
		  double transferAmount = cc.computeTransferAmount(countryIndex, amount);
          return transferAmount;
      }
	  
	  double computeTransferFee(int countryIndex, double amount){
		  double amountToTransfer = computeTransferAmount(countryIndex, amount);
		  double transferFee = amountToTransfer * 0.02;
		  return transferFee;
	  }
		public static void main(String[] args) {
			
			  MoneyTransferService transferService = new MoneyTransferService();



	          double transferAmount = transferService.computeTransferAmount(0, 1000);

	          double transferFee = transferService.computeTransferFee(0, 1000);



	          System.out.println("Transfer Amount: " + transferAmount);

	          System.out.println("Transfer Fee: " + transferFee);
		}
}
