package lab.designpatterns.answer2.taxrates;

import java.math.BigDecimal;

public abstract class TaxRate {
	private BigDecimal taxRate;

	public TaxRate() {
		
	}
	
	public TaxRate(BigDecimal taxRate) {
		this.taxRate = taxRate;
	}
	
	public TaxRate(int taxRate) {
		this.taxRate = new BigDecimal(taxRate);
	}
	
	public TaxRate(float taxRate) {
		this.taxRate = new BigDecimal(taxRate);
	}
	
	public BigDecimal getTaxRate() {
		return taxRate;
	}
	
	public void setTaxRate(BigDecimal taxRate) {
		this.taxRate = taxRate;
	}
	
	public void setTaxRate(int taxRate) {
		this.taxRate = new BigDecimal(taxRate);
	}
	
	public void setTaxRate(float taxRate) {
		this.taxRate = new BigDecimal(taxRate);
	}
	
	public BigDecimal applyTaxRate(BigDecimal sale) {
		return taxRate.multiply(sale);
	}
	
	@Override
	public String toString() {
		return String.format("%.02f", taxRate.floatValue());
	}
}
