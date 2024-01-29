package services;

public interface OnlinePaymenteService {

	double paymentFee(double amount);
	double interest(double amount, int months);
	
}
