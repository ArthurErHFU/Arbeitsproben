package a9_1;

public class PrivatVersicherter extends Kunde {

	protected String iban = "";
	protected String bic = "";

	public PrivatVersicherter(String nachname, String vorname, Geschlecht geschlecht, Anrede anrede,
			Arzt behandelnderArzt, String iban, String bic) {
		super(nachname, vorname, geschlecht, anrede, behandelnderArzt);
		this.iban = iban;
		this.bic = bic;
	}

	public PrivatVersicherter(String nachname, String vorname, Geschlecht geschlecht, Arzt behandelnderArzt,
			String iban, String bic) {
		super(nachname, vorname, geschlecht, behandelnderArzt);
		this.iban = iban;
		this.bic = bic;
	}

	public static void print(PrivatVersicherter p) {

		Start9_1.p(p.ansprache());
		Start9_1.p("Arzt " + p.behandelnderArzt.ansprache());
		Start9_1.p("IBAN " + p.iban);
		Start9_1.p("BIC " + p.bic);
		Start9_1.p("");
	}
}