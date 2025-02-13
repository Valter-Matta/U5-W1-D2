package com.epicode.U5D1.entities;

import com.epicode.U5D1.Interface.ComponentiOrdine;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@NoArgsConstructor
@Data
@Component
public class Ordine implements ComponentiOrdine {

	private Tavolo tavolo;
	private List<Item> componentiOrdine;
	private int numeroOrdine;
	private int numeroDiCoperti;
	private LocalTime oraOrdinazione;
	private StatoOrdine statoOrdine;

	@Value ("${costo.coperto}")
	private double costoCoperto;

	private double costoTotale;

	public Ordine(Tavolo tavolo, List<Item> componentiOrdine, int numeroOrdine, int numeroDiCoperti, LocalTime oraOrdinazione, StatoOrdine statoOrdine) {
		this.tavolo = tavolo;
		this.componentiOrdine = componentiOrdine;
		this.numeroOrdine = numeroOrdine;
		this.numeroDiCoperti = numeroDiCoperti;
		this.oraOrdinazione = oraOrdinazione;
		this.statoOrdine = statoOrdine;
	}

	public void calcolaCostoTotale () {

		costoTotale = 0.0;
		for (Item componentiOrdine : componentiOrdine) {
			costoTotale += componentiOrdine.getPrice();
		}
		this.costoTotale = costoTotale + costoCoperto;
	}

	public enum StatoOrdine {
		IN_CORSO,
		SERVITO, PRONTO
	}

	@Override
	public void stampaOrdine () {
		System.out.println("-----------------"+costoCoperto);
		DateTimeFormatter formattata = DateTimeFormatter.ofPattern("HH:mm:ss");
		System.out.println("Tavolo: "+ tavolo.getNumeroTavolo()+" Numero Ordine: "+ numeroOrdine+" Ora Ordinazione: "+ oraOrdinazione.format(formattata)+  " Totale: "+ costoTotale);
		System.out.println("Consumazioni:");
		for( Item componentiOrdine:componentiOrdine){
				System.out.println(componentiOrdine.getName());
		};
	}

}
