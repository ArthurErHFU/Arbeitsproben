import java.util.*;
import java.util.Scanner;

public class Taschenrechner3

{

  public static void main(String[] args){

	  float antwortmul;
	  float antworthalb;
	  float antwortsub;
	  float antwortad;
	  float antwortpro;

    System.out.println ("Geben sie Zahl A ein: ");

	  Scanner Input1 = new Scanner(System.in);

    System.out.println ("Geben sie Zahl B ein: ");

	  Scanner Input2 = new Scanner(System.in);

    float number1 = Input1.nextFloat();
	  float number2 = Input2.nextFloat();



    System.out.println ("Sie haben die Auswahl von:");
    System.out.println ("Multiplizieren");
    System.out.println ("Dividieren");
    System.out.println ("Addieren");
    System.out.println ("Restoperation");

    Scanner Input3 = new Scanner(System.in);
    String mode = Input3.nextLine();

    switch (mode) {
      case "Multiplizieren":
        antwortmul = number1 * number2;
        System.out.println(number1+ "mal " +number2 + " ist "+ antwortmul );
        break;

      case "Dividieren":
        antworthalb = number1 / number2;
        System.out.println(number1+ "geteilt druch " +number2 + " ist "+ antworthalb );
        break;

      case "Subtrahieren":
        antwortsub = number1 - number2;
        System.out.println(number1+ "minus " +number2 + " ist "+ antwortsub );
        break;

      case "Addieren":
        antwortad = number1 + number2;
        System.out.println(number1+ "plus " +number2 + " ist "+ antwortad );
        break;

      case "Restoperation":
        antwortpro = number1 % number2;
        System.out.println(number1+ "% " +number2 + " ist "+ antwortpro );
        break;
    default:
      System.out.println("Falsche eingabe");
      break;


    }
  }
}
//Aufgabe:
//Zwei Zahlen eingeben und addieren, subtrahieren,
//dievidieren , multiplizieren, Restoperation mit %
//ergebnisse hintereinender ausgeben
