package com.epicode.U5D1.Runner;

import com.epicode.U5D1.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.List;

@Service
public class OrdineRunner implements CommandLineRunner {
	@Autowired
	@Qualifier ("pizza_margherita")
	Pizza pizzaMargheritaBean;
	@Autowired
	@Qualifier ("hawaiian_pizza")
	Pizza pizzaHawaiianBean;

	@Override
	public void run (String... args) throws Exception {

		Tavolo tavolo = new Tavolo();
		Drink drink = new Drink("Water", 0, 1.29);

		Ordine ordine1 = new Ordine(tavolo, List.of(pizzaHawaiianBean, pizzaMargheritaBean, drink), 2, 3, LocalTime.now(), Ordine.StatoOrdine.IN_CORSO);
		ordine1.calcolaCostoTotale();
		ordine1.stampaOrdine();
	}
}
