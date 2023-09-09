package newphase;

import java.math.BigDecimal;

public class SIClass {
	
	BigDecimal principal;
	BigDecimal intrest;

	public SIClass(String principal, String intrest) {
		// TODO Auto-generated constructor stub
		this.principal=new BigDecimal(principal);
		this.intrest=new BigDecimal(intrest).divide(new BigDecimal(100));

	}

	public BigDecimal calculatorTotalValue(int noOfYears) {
		BigDecimal totalValue = principal.add(principal.multiply(intrest.multiply(new BigDecimal(noOfYears))));
		return totalValue;
		// TODO Auto-generated method stub
	
	}

}
