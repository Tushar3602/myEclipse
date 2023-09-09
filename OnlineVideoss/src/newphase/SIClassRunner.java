package newphase;

import java.math.BigDecimal;

public class SIClassRunner {

	public static void main(String[] args) {
		
		SIClass calculator=new SIClass("4500.00","7.5");
		BigDecimal totalValue = calculator.calculatorTotalValue(5);
		System.out.println(totalValue);// TODO Auto-generated method stub

	}

}
