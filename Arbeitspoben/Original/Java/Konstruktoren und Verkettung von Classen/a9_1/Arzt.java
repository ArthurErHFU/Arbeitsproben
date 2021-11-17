package a9_1;

public class Arzt extends Mitarbeiter {
	protected int buerozimmernummer = 0;
	protected Rang rang;

	// @Override
	public String ansprache() {
		String s = (anrede == Anrede.FRAU) ? rang.w : rang.m;
		s += " " + einfacheAnsprache();
		return s;
	}

	public boolean rangHoherAls(Arzt arzt) {

		if (rang.ordinal() > arzt.rang.ordinal()) {
			return true;
		}
		return false;

		// .ordinal() <-- ranghöhe ist sortiert :D
	}

	public Arzt(String nachname, String vorname, Geschlecht geschlecht, Anrede anrede, int presonalnummer, int gehalt,
			int buerozimmernummer, Rang rang) {
		super(nachname, vorname, geschlecht, anrede, presonalnummer, gehalt);
		this.buerozimmernummer = buerozimmernummer;
		this.rang = rang;
	}

	public Arzt(String nachname, String vorname, Geschlecht geschlecht, int presonalnummer, int gehalt,
			int buerozimmernummer, Rang rang) {
		super(nachname, vorname, geschlecht, presonalnummer, gehalt);
		this.buerozimmernummer = buerozimmernummer;
		this.rang = rang;
	}

	// Ausgabe
	public static void print(Arzt a) {

		Start9_1.p(a.ansprache());
		Start9_1.p("Gehalt " + a.gehalt + "€ ");
		Start9_1.p("ZimmerNR " + a.buerozimmernummer);
		Start9_1.p("PersoNR " + a.presonalnummer);
		Start9_1.p("");
	}

}
