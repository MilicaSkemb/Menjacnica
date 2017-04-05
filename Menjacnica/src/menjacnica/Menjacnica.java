package menjacnica;

public class Menjacnica {
	private Valuta naziv;

	public Valuta getNaziv() {
		return naziv;
	}

	public void setNaziv(Valuta naziv) {
		this.naziv = naziv;
	}
	@Override
	public String toString() {
		return "Menjacnica " + naziv;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
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
		Menjacnica other = (Menjacnica) obj;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		return true;
	}
}
