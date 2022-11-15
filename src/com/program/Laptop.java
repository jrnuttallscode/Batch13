// Create a class With name laptop and have 5 variable with name, ipaddress, color, screen_Size 
//and price and serialized and deserialize it.


package com.program;

import java.io.Serializable;

public class Laptop implements Serializable{
	
	private String name; 
	private double ipAddress;
	private String color;
	private double screen_Size; 
	private double price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(double ipAddress) {
		this.ipAddress = ipAddress;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getScreen_Size() {
		return screen_Size;
	}
	public void setScreen_Size(double screen_Size) {
		this.screen_Size = screen_Size;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [name=" + name + ", ipAddress=" + ipAddress + ", color=" + color + ", screen_Size=" + screen_Size
				+ ", price=" + price + ", getName()=" + getName() + ", getIpAddress()=" + getIpAddress()
				+ ", getColor()=" + getColor() + ", getScreen_Size()=" + getScreen_Size() + ", getPrice()=" + getPrice()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
