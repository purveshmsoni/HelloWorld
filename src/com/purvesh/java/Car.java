package com.purvesh.java;

import java.util.*;

public class Car extends Vehicle {
    private int wheels;

    private List <String> parts;
    
    private HashMap <String, String> types;
    
    
	public HashMap<String, String> getTypes() {
		return types;
	}

	public void setTypes(HashMap<String, String> types) {
		this.types = types;
	}


	public List getParts() {
		return parts;
	}

	public void setParts(List parts) {
		this.parts = parts;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
    
}
