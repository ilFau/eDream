package testEDream;

import java.util.*;
import eDreamPack.*;

public class Test {

	public static void main(String[] args) {

		// creo la mia agenzia
		MyAgency miaAgenzia = new MyAgency("nomeAgenzia");

		// faccio dei clienti che andrò ad aggiungere alla miaAgenzia

		miaAgenzia.addCustomers(creaCliente("clienteNome1", "clienteCognome1", "clienteCodFisc1"));
		miaAgenzia.addCustomers(creaCliente("clienteNome2", "clienteCognome2", "clienteCodFisc2"));

		// provo a stampare i clienti

		stampaClienti(miaAgenzia);

		// creo alcuni dipendenti

		miaAgenzia.addEmployees(creaDipendenteHostess("hostessNome1", "hostessCognome1", "hostessCodFisc1", "faCose1"));
		miaAgenzia.addEmployees(creaDipendenteHostess("hostessNome2", "hostessCognome2", "hostessCodFisc2", "faCose2"));
		miaAgenzia.addEmployees(creaDipendenteDriver("driverNome1","driverCognome1","driverCodFisc1","patente1"));
		miaAgenzia.addEmployees(creaDipendenteDriver("driverNome2","driverCognome2","driverCodFisc2","patente2"));
		
		// provo a stampare i dipendenti creati
		
		stampaDipendenti(miaAgenzia);
		
		// creo un parco automezzi
		
		miaAgenzia.addVeicles(creaAutobus("autobus1",1));
		miaAgenzia.addVeicles(creaAutobus("autobus2",2));
		miaAgenzia.addVeicles(creaAutobus("autobus3",3));
		
		// provo a stampare il parco automezzi
		
		stampaAutomezzi(miaAgenzia);
		
	}

	private static Employees creaDipendenteDriver(String string, String string2, String string3, String string4) {
		return new Driver(string,string2,string3,string4);
	}

	private static Customer creaCliente(String nome, String cognome, String codFiscale) {
		return new Customer(nome, cognome, codFiscale);
	}
	
	private static Employees creaDipendenteHostess(String string, String string2, String string3, String string4) {
		return new Hostess(string, string2, string3, string4);
	}

	private static Autobus creaAutobus(String string, int i) {
		return new MyAutobus(string,i);
	}

	private static void stampaClienti(MyAgency miaAgenzia) {
		Iterator<Customer> tmpClienti = miaAgenzia.allCustomers().iterator();
		Customer tmpCustom;
		while (tmpClienti.hasNext()) {
			tmpCustom = tmpClienti.next();
			System.out.println(tmpCustom.toString());
		}
	}
	
	private static void stampaDipendenti(MyAgency miaAgenzia) {
		Iterator<Employees> tmpDipendenti = miaAgenzia.allEmployees().iterator();
		Employees tmpEmployees;
		while (tmpDipendenti.hasNext()) {
			tmpEmployees = tmpDipendenti.next();
			System.out.println(tmpEmployees.toString());
		}
	}
	
	private static void stampaAutomezzi(MyAgency miaAgenzia) {
		Iterator<Autobus> tmpAutomezzo = miaAgenzia.veiclesPark().iterator();
		Autobus tmpAutobus;
		while (tmpAutomezzo.hasNext()) {
			tmpAutobus = tmpAutomezzo.next();
			System.out.println(tmpAutobus.toString());
		}
	}

}
