import java.util.*;

public class Demo {

public static void main(String[] args) throws InterruptedException
	{


		System.out.println("Geben sie was an ");

		Scanner input = new Scanner(System.in);

		String laufInput = input.nextLine();

		int arrayi = laufInput.length();

		System.out.println("Anzahl der Buchstaben " + arrayi);

		while(true){
			Thread.sleep(500);
			for(int array = 0 ; array < laufInput.length(); array++)
			{
				String restInput = laufInput.substring(arrayi);
				String lostInput = laufInput.substring(0, arrayi);
				System.out.print(restInput+lostInput);

				if(arrayi >= laufInput.length()-1)
				{
					arrayi = 0;
				}
				else
				{
					arrayi++;
				}
				System.out.print('\r');

			}
			if(arrayi >= laufInput.length()-1)
			{
				arrayi = 0;
			}
			else
			{
				arrayi++;
			}

		}

	}
}
