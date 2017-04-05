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
		if(naziv == null || naziv == ""){
			throw new RuntimeException("Nije unet konkretan naziv.");
		}
		this.naziv = naziv;
	}
	public String getSkraceniNazivValute() {
		return skraceniNazivValute;
	}
	public void setSkraceniNazivValute(String skraceniNazivValute) {
		if(skraceniNazivValute == null || skraceniNazivValute == ""){
			throw new RuntimeException("Nije unet konkretan naziv.");
		}
		if(skraceniNazivValute.length() != 3){
			throw new RuntimeException("Nije unet skracen naziv.");
		}
		this.skraceniNazivValute = skraceniNazivValute;
	}
	public LinkedList<Kursevi> getKurseviValute() {
		return kurseviValute;
	}
	public void setKurseviValute(LinkedList<Kursevi> kurseviValute) {
		if(kurseviValute == null){
			throw new RuntimeException("Prosledjena je prazna lista.");
		}
		this.kurseviValute = kurseviValute;
	}
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
