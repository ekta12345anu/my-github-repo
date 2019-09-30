package com.ekta.collections;

public class Laptop implements Comparable<Laptop> {

	private int price;
	private String brand;
	private int ram;
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public Laptop(int price, String brand, int ram) {
		this.price=price;
		this.brand=brand;
		this.ram=ram;
	}
	
	@Override
	public int compareTo(Laptop o) {
		if(o.getPrice()>this.getPrice()){
			return 12;
		}
			
		else if(o.getPrice()==this.getPrice()){
			if(o.getRam()>this.getRam()){
				return 100;
			}else if(o.getRam()==this.getRam()){
				return 0;
			}else{
				return -200;
			}
			
		}
			

		else
			return -90;
	}
	

}
