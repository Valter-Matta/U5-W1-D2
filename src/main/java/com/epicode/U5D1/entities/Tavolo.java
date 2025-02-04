package com.epicode.U5D1.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data@AllArgsConstructor
public class Tavolo {

	private  int numeroTavolo;
	private statoTavolo stato;

	public enum statoTavolo{
		OCCUPATO, LIBERO
	}

}
