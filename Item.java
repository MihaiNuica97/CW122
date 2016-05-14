import java.util.*;

public class Item {
	protected String title;
	protected String description;
	protected String category;
	protected int vendorID;
	protected int itemID;
	
	protected Date startDate;
	protected Date enDate;
	
	protected int reservePrice;

	
	protected  Map<User, Integer> currentBids;


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public int getVendorID() {
		return vendorID;
	}


	public void setVendorID(int vendorID) {
		this.vendorID = vendorID;
	}


	public int getItemID() {
		return itemID;
	}


	public void setItemID(int itemID) {
		this.itemID = itemID;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public Date getEnDate() {
		return enDate;
	}


	public void setEnDate(Date enDate) {
		this.enDate = enDate;
	}


	public int getReservePrice() {
		return reservePrice;
	}


	public void setReservePrice(int reservePrice) {
		this.reservePrice = reservePrice;
	}


	public Map<User, Integer> getCurrentBids() {
		return currentBids;
	}


	public void setCurrentBids(Map<User, Integer> currentBids) {
		this.currentBids = currentBids;
	}

}
