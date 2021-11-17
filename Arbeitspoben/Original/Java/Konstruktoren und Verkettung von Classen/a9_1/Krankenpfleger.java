package a9_1;

public class Krankenpfleger extends Mitarbeiter {

	public String ansprache() {
		String s = (anrede == Anrede.FRAU) ? "Krankenpflegerin" : "Krankenpfleger";
		s += " " + nachname + " " + vorname;
		return s;

		// return "Krankenplfegerin" + vorname + nachname;
	}

	public String formloseAnsprache() {
		return "Sehr geehrte Damen und Herren";

	}

	public Krankenpfleger(String nachname, String vorname, Geschlecht geschlecht, Anrede anrede, int presonalnummer,
			int gehalt) {
		super(nachname, vorname, geschlecht, anrede, presonalnummer, gehalt);
		// TODO Auto-generated constructor stub
	}

	public Krankenpfleger(String nachname, String vorname, Geschlecht geschlecht, int presonalnummer, int gehalt) {
		super(nachname, vorname, geschlecht, presonalnummer, gehalt);
		// TODO Auto-generated constructor stub
	}

	public static void print(Krankenpfleger k) {

		Start9_1.p(k.ansprache());
		Start9_1.p("Gehalt " + k.gehalt + "€ ");
		Start9_1.p("PersoNR " + k.presonalnummer);
		Start9_1.p("");
	}
}
