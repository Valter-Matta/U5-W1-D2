package com.epicode.U5D1.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Drink extends Item {


	public Drink(String name, int calories, double price) {
		super(name,calories, price);
	}

	@Override
	public String toString() {
		return "Drink{" +
				"name='" + name + '\'' +
				", calories=" + calories +
				", price=" + price +
				'}';
	}

	@Override
	public void stampaOrdine () {

	}
}
