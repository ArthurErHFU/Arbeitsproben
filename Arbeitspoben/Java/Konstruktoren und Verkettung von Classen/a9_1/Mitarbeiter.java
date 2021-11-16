package a9_1;

public class Mitarbeiter extends Person {
	protected int presonalnummer = 0;
	protected int gehalt = 0;

	public Mitarbeiter(String nachname, String vorname, Geschlecht geschlecht, Anrede anrede, int presonalnummer,
			int gehalt) {
		super(nachname, vorname, geschlecht, anrede);
		this.presonalnummer = presonalnummer;
		this.gehalt = gehalt;
	}

	public Mitarbeiter(String nachname, String vorname, Geschlecht geschlecht, int presonalnummer,
			int gehalt) {
		super(nachname, vorname, geschlecht);
		this.presonalnummer = presonalnummer;
		this.gehalt = gehalt;
	}

}
