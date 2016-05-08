package testEDream;

import java.util.*;
import eDreamPack.*;

public class Test {

	public static void main(String[] args) {
		
		// creo la mia agenzia
		MyAgency miaAgenzia = new MyAgency("nomeAgenzia");
		
		// faccio dei clienti che andrò ad aggiungere alla miaAgenzia
		
		miaAgenzia.addCustomers(creaCliente ("clienteNome1","clienteCognome1","clienteCodFisc1"));
		miaAgenzia.addCustomers(creaCliente ("clienteNome2","clienteCognome2","clienteCodFisc2"));
		
		// provo a stampare i clienti
		
		stampaClienti(miaAgenzia);
		
	}
	
	private static void stampaClienti(MyAgency miaAgenzia) {
		Iterator<Customer> tmpClienti = miaAgenzia.allCustomers().iterator();
		Customer tmpCustom;
		while (tmpClienti.hasNext()) {
			tmpCustom = tmpClienti.next();
			System.out.println(tmpCustom.toString());
		}
		
	}

	private static Customer creaCliente (String nome, String cognome, String codFiscale) {
		return new Customer (nome, cognome, codFiscale);
	}

}
