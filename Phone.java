package collections3;

public class Phone {
	private String brand;
	private int price;
	private String color;
	private float rating;
	private int editionYear;
	public Phone(String brand, int price, String color, float rating, int editionYear) {
		this.brand=brand;
		this.color=color;
		this.price=price;
		this.rating=rating;
		this.editionYear=editionYear;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating=rating;
	}
	public int getEditionYear() {
		return editionYear;
	}
	public void setEditionYear(int editionYear) {
		this.editionYear=editionYear;
	}
	public String toString() {
		return "Brand: "+brand+" Color: "+color+" Price: "+price+" Rating: "+rating+" Edition Year: "+editionYear;
	}

}
