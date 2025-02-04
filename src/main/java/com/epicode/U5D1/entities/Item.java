package com.epicode.U5D1.entities;

import com.epicode.U5D1.Interface.ComponentiOrdine;
import lombok.Data;
import lombok.Getter;

@Getter
@Data
public abstract class Item implements ComponentiOrdine {
	protected String name;
	protected int calories;
	protected double price;

	public Item (String name,int calories, double price) {
		this.name = name;
		this.calories = calories;
		this.price = price;
	}

}
