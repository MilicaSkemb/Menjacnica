package specifikacija;

import menjacnica.Kursevi;
import java.util.GregorianCalendar;

public interface Specifikacija {
	public void dodavanjeKursa(GregorianCalendar datumKursa, double prodajniKurs, double srednjiKurs, double kupovniKurs);
	public void obrisiKurs(GregorianCalendar datumKursa);
	public Kursevi nadjiKursZaOdredjeniDatum(GregorianCalendar datumKursa);
}
