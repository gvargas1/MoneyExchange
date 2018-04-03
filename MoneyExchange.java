import java.lang.Math;

public class MoneyExchange {

	//
	public int dollarIntoPennies(int money) {
		return money * 100;
	}
	
	//
	public int dollarIntoPennies(double money) {
		return ((int)Math.floor(money) * 100) + (int)(money - (int)(money));
	}
}