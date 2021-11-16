import java.util.*;

public class Laufschrift {

	public static Scanner convert (){
			Scanner textinput = new Scanner(System.in);
			return textinput;
	}

	public static void main (String[] args) throws InterruptedException{

		int ind = 0;

		Scanner textinput = new Scanner(System.in);

		System.out.println("Geben sie was an ");

		String input = textinput.nextLine();

		char [] inputArray = input.toCharArray();

		//System.out.print(inputArray);


		while(true) {

			Thread.sleep(100);

			for(int l = 0 ; l < input.length(); l++)
			{
				System.out.print(inputArray[ind]);

				if(ind >= input.length() - 1)
				{
					ind = 0;
				}

				else
				{
					++ind;
				}
			}
			System.out.print('\r');

			if(ind >= input.length() - 1)
			{
				ind = 0;
			}
			else
			{
				++ind;
				System.out.print("%");
			}
		}
	}


}
