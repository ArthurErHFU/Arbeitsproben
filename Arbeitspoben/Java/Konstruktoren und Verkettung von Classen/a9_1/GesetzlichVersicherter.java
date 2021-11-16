package a9_1;

public class GesetzlichVersicherter extends Kunde {

	protected String krankenkasse = "";
	
	public static void print(GesetzlichVersicherter k) {

		Start9_1.p(k.ansprache());
		Start9_1.p("Arzt " + k.behandelnderArzt.ansprache());
		Start9_1.p("Krankenkasse " + k.krankenkasse);
		Start9_1.p("");
	}

	public GesetzlichVersicherter(String nachname, String vorname, Geschlecht geschlecht, Anrede anrede,
			Arzt behandelnderArzt, String krankenkasse) {
		super(nachname, vorname, geschlecht, anrede, behandelnderArzt);
		this.krankenkasse = krankenkasse;
	}

	public GesetzlichVersicherter(String nachname, String vorname, Geschlecht geschlecht, Arzt behandelnderArzt,
			String krankenkasse) {
		super(nachname, vorname, geschlecht, behandelnderArzt);
		this.krankenkasse = krankenkasse;
	}
}