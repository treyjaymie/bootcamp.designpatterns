package lab.designpatterns.answer2.taxrates;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TaxCategoriesList {

	private HashMap<String, TaxRate> categories;
	
	public TaxCategoriesList() {
		categories = new HashMap<>();
		categories.put("Standard", new StandardTaxRate());
	}
	
	public void addCategory(String newCategory, float taxRate) {
		if (categories.containsKey(newCategory)) 
			throw new IllegalArgumentException("Indicate a unique title for the new category.");
		categories.put(newCategory, new CustomTaxRate());
		categories.get(newCategory).setTaxRate(taxRate);
	}
	
	public void removeCategory(String category) {
		if (!categories.containsKey(category)) 
			throw new IllegalArgumentException("Indicate an existing category.");
		categories.remove(category);
	}
	
	public TaxRate getCategory(String category) {
		if (!categories.containsKey(category)) 
			throw new IllegalArgumentException("Indicate an existing category.");
		return categories.get(category);
	}
	
	public void setPriceOfCategory(String category, float taxRate) {
		if (!categories.containsKey(category))
			throw new IllegalArgumentException("Indicate an existing category.");
		categories.get(category).setTaxRate(taxRate);
	}
	
	public int getSize() {
		return categories.size();
	}
	
	public List<String> getCategoryTitles() {
		return new ArrayList<>(categories.keySet());
	}
	
	public List<TaxRate> getTaxRates() {
		return new ArrayList<>(categories.values());
	}
}
