package com.bigshi.mkyong.spring.common.customannotation;

public class Customer {
	private Person person;
	private int type;
	private String action;
	public Person getPerson() {
		return person;
	}
	
	//set new annotation.
	@Mandatory
	public void setPerson(Person person) {
		this.person = person;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	
	
	
}
