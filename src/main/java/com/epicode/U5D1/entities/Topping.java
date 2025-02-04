package com.epicode.U5D1.entities;

import com.epicode.U5D1.Interface.ComponentiOrdine;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Topping extends Item  {


	public Topping(String name, int calories, double price) {
		super(name,calories, price);

	}

	@Override
	public String toString() {
		return "Topping{" +
				"name='" + name + '\'' +
				", calories=" + calories +
				", price=" + price +
				'}';
	}

	@Override
	public void stampaOrdine () {
		System.out.println(this.name);
	}
}
