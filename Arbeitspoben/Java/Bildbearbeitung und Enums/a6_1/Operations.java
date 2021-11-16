package a6_1;

import static prog.Picture.loadResource;
import static prog.Picture.show;

import java.util.concurrent.TimeUnit;

public class Operations {
	public static int[][] someChange(int p[][]) {
		for (int i = 0; i < 100; i++)
			p[i][i] = 0;

		return p;
	}

	public static int[][] addRechteck(int p[][], int x, int y) {

		for (int xStart = 30; xStart < 250; xStart++) {
			for (int yStart = 70; yStart < 160; yStart++) {
				p[xStart][yStart] = 0;
			}
		}
		return p;
	}

//	Spiegelt nur zur hälfte?
	public static int[][] spiegel(int pa[][], int x, int y) {

		int[][] pb = pa;

		// Habe die hälfte zu viel gedreht xD
		for (int xStart = 0; xStart < x / 2; xStart++) {

			for (int yStart = 0; yStart < y; yStart++) {

				// Rette die Pixel!!
				// Den Tausch noch mal nachscheuen, wie der geht?
				// a1 b2 a und b tauschen a = c a = b c = a
				int pc = pa[xStart][yStart];

				pa[xStart][yStart] = pb[x - xStart - 1][yStart];

				pa[x - xStart - 1][yStart] = pc;

			}

		}
		return pa;
	}

	public static int[][] kreisSchwarz(int p[][], int width, int hight) {
		int midX = 150;
		int midY = 150;
		int rad = 100;

		for (int x = 0; x < width; x++) {
			// x max vom mittelpunkt 100

			for (int y = 0; y < hight; y++) {
				int xO = x - midX;
				int yO = y - midY;

				double vecL = Math.sqrt((xO * xO) + (yO * yO));
				// y max vom mittelpiunkt 100
				if (vecL <= rad) {
					p[x][y] = 0;
				}

			}

		}
		return p;
	}

	public static int[][] kreisGedreht(int p[][], int width, int hight) {

		// Verschiebung des Ortsvektors!
		int midX = 150;
		int midY = 150;
		int rad = 100;
		int[][] pb = p;

		for (int x = 0; x < width; x++) {
			// x max vom mittelpunkt 100

			for (int y = 0; y < hight / 2; y++) {
				int xO = x - midX;
				int yO = y - midY;

				double vecL = Math.sqrt((xO * xO) + (yO * yO));
				// y max vom mittelpiunkt 100
				if (vecL <= rad) {
					// vom drehen geklaut!
					int pc = p[x][y];
					p[x][y] = pb[x][hight - y - 1];
					p[x][hight - y - 1] = pc;
				}

			}

		}
		return p;
	}

	public static int[][] schiebung180p(int p[][], int width, int hight) {
		int schiebX = 180;
		int[][] pb = p;

		// Habe die hälfte zu viel gedreht xD
		for (int x = 0; x < schiebX; x++) {

			for (int y = 0; y < hight; y++) {

				// Rette die Pixel!!

				if (x < width - schiebX) {
					int pc = p[x][y];
					p[x][y] = pb[x + schiebX][y];
					p[x + schiebX][y] = pc;
				} else {
					// ist jettz über dem Bildrand (300px) muss wieder von anfang anfangen

					p[x][y] = pb[schiebX][y];
					// Fake :D!
				}

			}

		}
		return p;
	}

	public static int[][] scheerung45(int p[][], int width, int hight) {

		int[][] pb = loadResource("a6_1/MyPicture.jpg");
		int[][] out = p;

		for (int x = 0; x < width; x++) {

			for (int y = 0; y < hight; y++) {
				// Rotate 45? HOW THE FUCK??? Warum MATHE!!
				// AHHH STEIGUNG is 1 <--. Also f(x) = x+y, :D

				// damit das nicht aus dem Array springen kann
				if (width > x + y) {
					int pc = pb[x + y][y];
					out[x][y] = pc;

				} else {
					// damit das nicht aus dem Array springt :D
					int pc = pb[x + y - width][y];
					out[x][y] = pc;
				}

			}
			
	
		}
		return out;
	}
}
