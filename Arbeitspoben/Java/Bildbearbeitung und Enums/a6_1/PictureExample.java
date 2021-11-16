package a6_1;

import static prog.Picture.*;

public class PictureExample {
	public static void main(String args[]) {
// Laden des Bildes in ein zweidimensionales Array
		int p[][] = loadResource("a6_1/MyPicture.jpg");
		int x = p.length;
		int y = p[0].length;
		
// Das Bild wird verändert
		// Ja ich verwände Methoden! Ist einfacher die Ordnung zu halten
//		Operations.someChange(p);
//		Operations.addRechteck(p, x, y);
//		Operations.spiegel(p, x, y);
//		Operations.kreisSchwarz(p, x, y);
//		Operations.kreisGedreht(p, x, y);
//		Operations.schiebung180p(p, x, y);
		Operations.scheerung45(p, x, y);
		

// Anzeigen des geänderten Bildes
		show(p);

	}
}