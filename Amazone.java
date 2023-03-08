package com.three;

import java.util.List;

public class Amazone
{
private int orderid;
private int quantity;
private double cost;
private List<String> item;
public int getOrderid() {
	return orderid;
}
public void setOrderid(int orderid) {
	this.orderid = orderid;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}
public List<String> getItem() {
	return item;
}
public void setItem(List<String> item) {
	this.item = item;
}


}
