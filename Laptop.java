package collections3;

public class Laptop {
	private String brand;
	private int price;
	private String color;
	private int ram;
	private String os;
	private Integer model;
	public Integer getModel() {
		return model;
	}
	public void setModel(Integer model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public Laptop(String brand, int price, String color, int ram, String os, Integer model) {
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.ram = ram;
		this.os = os;
		this.model = model;
	}
	public String toString() {
		return "Brand=" + brand + ", Price=" + price + ", Color=" + color + ", RAM=" + ram + ", OS=" + os;
	}
	

}
