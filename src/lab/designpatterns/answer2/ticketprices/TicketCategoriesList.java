package lab.designpatterns.answer2.ticketprices;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TicketCategoriesList {
	
	private HashMap<String, TicketPrice> categories;

	public TicketCategoriesList() {
		categories = new HashMap<>();
		categories.put("Child", new ChildTicketPrice());
		categories.put("Adult", new AdultTicketPrice());
		categories.put("Senior", new SeniorTicketPrice());
	}
	
	public void addCategory(String newCategory, float price) {
		if (categories.containsKey(newCategory)) 
			throw new IllegalArgumentException("Indicate a unique title for the new category.");
		categories.put(newCategory, new CustomTicketPrice());
		categories.get(newCategory).setTicketPrice(price);
	}
	
	public void removeCategory(String category) {
		if (!categories.containsKey(category)) 
			throw new IllegalArgumentException("Indicate an existing category.");
		categories.remove(category);
	}
	
	public TicketPrice getCategory(String category) {
		if (!categories.containsKey(category)) 
			throw new IllegalArgumentException("Indicate an existing category.");
		return categories.get(category);
	}
	
	public void setPriceOfCategory(String category, float price) {
		if (!categories.containsKey(category))
			throw new IllegalArgumentException("Indicate an existing category.");
		categories.get(category).setTicketPrice(price);
	}
	
	public int getSize() {
		return categories.size();
	}
	
	public List<String> getCategoryTitles() {
		return new ArrayList<>(categories.keySet());
	}
	
	public List<TicketPrice> getTicketPrices() {
		return new ArrayList<>(categories.values());
	}
}
