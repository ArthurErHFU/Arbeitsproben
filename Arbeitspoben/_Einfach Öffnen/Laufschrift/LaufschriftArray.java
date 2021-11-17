import java.util.*;

public class LaufschriftArray{

	public static void main (String[] args) throws InterruptedException{

		int inputLenght;
		int speed = 1000;

		String input = "Was geht ab da draussen?";
		String inputRest;
		String inputRestRest;

		boolean dir = false ;

		System.out.println("Geben sie was an  *Laufrichtung* *Wartezeit*");

		System.out.println(args.length);

		switch(args.length){
			case 1:
			if (args [0].equals("Links")){
				dir = true;
			}
			else if (args [0].equals("Rechts")) {
				dir = false;
			}
			break;

			case 2:
			speed = Integer.parseInt(args [1]);
			break;
		}

		if (dir) {
			while (true) {

				inputRest = input.substring(0,1);
				inputRestRest = input.substring(1,inputLenght);

				input = inputRestRest + inputRest;
				System.out.print(input);
				System.out.print('\r');
				Thread.sleep(speed);
			}
		}
		else {
			while (true) {

				inputRest = input.substring(inputLenght-1);
				inputRestRest = input.substring(0,inputLenght-1);

				input = inputRest + inputRestRest;
				System.out.print(input);
				System.out.print('\r');
				Thread.sleep(speed);

			}
		}
	}
}
