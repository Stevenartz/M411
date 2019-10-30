package com.comparable;

import java.time.LocalDate;

public class Buch implements Comparable {

	private String titel, autor;
	private int anzSeiten;
	private LocalDate erscheinungsjahr;
	
	public Buch() {
		
	}
	
	public Buch(String titel, String autor, int anzSeiten, LocalDate erscheinungsjahr) {
		this.titel = titel;
		this.autor = autor;
		this.anzSeiten = anzSeiten;
		this.erscheinungsjahr = erscheinungsjahr;
	}


	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnzSeiten() {
		return anzSeiten;
	}

	public void setAnzSeiten(int anzSeiten) {
		this.anzSeiten = anzSeiten;
	}

	public LocalDate getErscheinungsjahr() {
		return erscheinungsjahr;
	}

	public void setErscheinungsjahr(LocalDate erscheinungsjahr) {
		this.erscheinungsjahr = erscheinungsjahr;
	}

	@Override
	public int compareTo(Object o) {
		Buch buch = (Buch) o;
		int comparedVal = getAutor().compareTo(buch.getAutor());
		if (comparedVal == 0) {
			comparedVal = getErscheinungsjahr().compareTo(buch.getErscheinungsjahr());
		}
		return comparedVal;
	}

	@Override
	public String toString() {
		return "Buch [titel=" + titel + ", autor=" + autor + ", anzSeiten=" + anzSeiten + ", erscheinungsjahr="
				+ erscheinungsjahr + "]";
	}
	
	
}
