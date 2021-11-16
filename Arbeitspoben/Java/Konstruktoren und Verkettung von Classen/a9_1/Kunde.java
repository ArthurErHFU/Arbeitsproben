package a9_1;

public class Kunde extends Person {
	protected Arzt behandelnderArzt;

	public boolean arztRangHoeherAlsBei(Kunde k) {
		//Ohne Methode
//		if (behandelnderArzt.rang.ordinal() > k.behandelnderArzt.rang.ordinal()) {
//			return true;
//		}
//		return false;
		
		//Mit Methode
		return behandelnderArzt.rangHoherAls(k.behandelnderArzt);
	}

	public Kunde(String nachname, String vorname, Geschlecht geschlecht, Anrede anrede, Arzt behandelnderArzt) {
		super(nachname, vorname, geschlecht, anrede);
		this.behandelnderArzt = behandelnderArzt;
	}

	public Kunde(String nachname, String vorname, Geschlecht geschlecht, Arzt behandelnderArzt) {
		super(nachname, vorname, geschlecht);
		this.behandelnderArzt = behandelnderArzt;
	}

}
