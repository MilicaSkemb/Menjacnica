package menjacnica;

import java.util.LinkedList;

public class Valuta {
	private String naziv;
	private String skraceniNazivValute;
	private LinkedList<Kursevi> kurseviValute = new LinkedList<Kursevi>();
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getSkraceniNazivValute() {
		return skraceniNazivValute;
	}
	public void setSkraceniNazivValute(String skraceniNazivValute) {
		this.skraceniNazivValute = skraceniNazivValute;
	}
	public LinkedList<Kursevi> getKurseviValute() {
		return kurseviValute;
	}
	public void setKurseviValute(LinkedList<Kursevi> kurseviValute) {
		this.kurseviValute = kurseviValute;
	}
}
