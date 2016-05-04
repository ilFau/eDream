package eDreamPack;

import java.util.*;

public abstract class Place {

	public String Nome;
	public List<Hotel> listaDiHotel;

	public void setNome(String nome) {
		this.Nome = nome;
	}

	public String getNome() {
		return this.Nome;
	}
	
}