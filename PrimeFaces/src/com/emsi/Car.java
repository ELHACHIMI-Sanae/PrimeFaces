package com.emsi;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Car {
	
	private String type;
	private String marque;
	

	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getMarque() {
		return marque;
	}


	public void setMarque(String marque) {
		this.marque = marque;
	}


	public Car(String type, String marque) {
		super();
		this.type = type;
		this.marque = marque;
	}




}
