package a9_1;

public class Person {
	protected String nachname = "";
	protected String vorname = "";

	protected Geschlecht geschlecht;
	protected Anrede anrede;

	// Methods
	public String ansprache() {
		String s = (anrede == Anrede.FRAU) ? "Frau" : "Herr";
		s += " " + einfacheAnsprache();
		return s;
	}

	public String einfacheAnsprache() {
		return nachname + " " + vorname;
	}

	public Person(String nachname, String vorname, Geschlecht geschlecht, Anrede anrede) {
		super();
		this.nachname = nachname;
		this.vorname = vorname;
		this.geschlecht = geschlecht;
		this.anrede = anrede;
	}

	public Person(String nachname, String vorname, Geschlecht geschlecht) {
		super();
		this.nachname = nachname;
		this.vorname = vorname;
		this.geschlecht = geschlecht;
		if (geschlecht == geschlecht.WEIBLICH) {
			this.anrede = Anrede.FRAU;
		} else {
			this.anrede = Anrede.HERR;
		}

	}

}
