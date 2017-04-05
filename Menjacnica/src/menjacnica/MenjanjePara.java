package menjacnica;

import java.util.GregorianCalendar;

import specifikacija.Specifikacija;

public class MenjanjePara implements Specifikacija {
	private Valuta v = new Valuta();
	@Override
	public void dodavanjeKursa(GregorianCalendar datumKursa, double prodajniKurs, double srednjiKurs,
			double kupovniKurs) {
		Kursevi k = new Kursevi();
		k.setProdajniKurs(prodajniKurs);
		k.setSrednjiKurs(srednjiKurs);
		k.setDatumKursa(datumKursa);
		k.setKupovniKurs(kupovniKurs);
		v.getKurseviValute().add(k);
	}
	@Override
	public void obrisiKurs(GregorianCalendar datumKursa) {
		

	}

	@Override
	public Kursevi nadjiKursZaOdredjeniDatum(GregorianCalendar datumKursa) {
		
		return null;
	}

}
