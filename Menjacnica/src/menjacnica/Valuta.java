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
	@Override
	public String toString() {
		return "Valuta Naziv = " + naziv + ", Skraceni naziv valute = " + skraceniNazivValute + ", Kursevi valute ="
				+ kurseviValute;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kurseviValute == null) ? 0 : kurseviValute.hashCode());
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((skraceniNazivValute == null) ? 0 : skraceniNazivValute.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (kurseviValute == null) {
			if (other.kurseviValute != null)
				return false;
		} else if (!kurseviValute.equals(other.kurseviValute))
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (skraceniNazivValute == null) {
			if (other.skraceniNazivValute != null)
				return false;
		} else if (!skraceniNazivValute.equals(other.skraceniNazivValute))
			return false;
		return true;
	}
}
