package com.three;

import java.util.Map;

public class Mobile 
{
private int id;
private String brand;
private Map<String,String> costcolor;
private Amazone amazone;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public Map<String, String> getCostcolor() {
	return costcolor;
}
public void setCostcolor(Map<String, String> costcolor) {
	this.costcolor = costcolor;
	
}
public Amazone getAmazone() {
	return amazone;
}
public void setAmazone(Amazone amazone) {
	this.amazone = amazone;
}

}
