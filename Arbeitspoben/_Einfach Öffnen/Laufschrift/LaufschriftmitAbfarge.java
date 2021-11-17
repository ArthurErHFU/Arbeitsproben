import java.util.*;

public class LaufschriftmitAbfarge{

	public static void main (String[] args) throws InterruptedException{

		int inputLenght;
		int speed = 0;

		String input;
		String inputRest;
		String inputRestRest;
		String richtung;
		String r = "Rechts";
		String l = "Links";

		Scanner textinput;

		textinput = new Scanner(System.in);
		System.out.println("Geben sie was an ");

		input = textinput.nextLine();
		inputLenght = input.length();
		System.out.println("Deine Eingabe ist "+ input +" und sie ist "+inputLenght + " Zeilen lang");

		System.out.println("Gebe sie die richtung an (Links,Rechts)");
		//richtungScann = new Scanner(System.in);
		richtung = textinput.next();

		System.out.println("Und geben sie die Wartezeit in Sekunden an");
		//speedScann = new Scanner(System.in);
		speed = textinput.nextInt();
		speed = speed * 1000;

		System.out.println();

		if (l.equals(richtung)) {
			while (true) {

				inputRest = input.substring(0,1);
				inputRestRest = input.substring(1,inputLenght);

				input = inputRestRest + inputRest;
				System.out.print(input);
				System.out.print('\r');
				Thread.sleep(speed);
			}
		}
		else if (r.equals(richtung)) {
			while (true) {

				inputRest = input.substring(inputLenght-1);
				inputRestRest = input.substring(0,inputLenght-1);

				input = inputRest + inputRestRest;
				System.out.print(input);
				System.out.print('\r');
				Thread.sleep(speed);
				}
			}
			else {
				System.out.println("Leider hast du was falsches angegeben");
		}
	}
}
