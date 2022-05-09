package util;

public class CurrencyConverter {
	

 	
//public static double bought(double dollar, double quantity) {
//	return dollar * quantity;
//}
	
public static double converter(double dollar, double quantity) {
	double iof = 0.06 * dollar * quantity;
	
	return dollar * quantity + iof;
}
}
