import java.util.*;
import java.util.Scanner;

public class Taschenrechner2

{

  public static void main(String[] args){

	  float antwortmul;
	  float antworthalb;
	  float antwortsub;
	  float antwortad;
	  float antwortpro;

    System.out.println ("Geben sie eine Zahl ein: ");

	  Scanner Input1 = new Scanner(System.in);
	  Scanner Input2 = new Scanner(System.in);

	  float number1 = Input1.nextFloat();
	  float number2 = Input2.nextFloat();

	  antwortmul = number1 * number2;
	  antworthalb = number1 / number2;
	  antwortsub = number1 - number2;
	  antwortad = number1 + number2;
	  antwortpro = number1 % number2;

	  System.out.println(number1+ "mal " +number2 + " ist "+ antwortmul );
	  System.out.println(number1+ "geteilt druch " +number2 + " ist "+ antworthalb );
	  System.out.println(number1+ "minus " +number2 + " ist "+ antwortsub );
	  System.out.println(number1+ "plus " +number2 + " ist "+ antwortad );
    System.out.println(number1+ "% " +number2 + " ist "+ antwortpro );




  }
}
//Aufgabe:
//Zwei Zahlen eingeben und addieren, subtrahieren,
//dievidieren , multiplizieren, Restoperation mit %
//ergebnisse hintereinender ausgeben
