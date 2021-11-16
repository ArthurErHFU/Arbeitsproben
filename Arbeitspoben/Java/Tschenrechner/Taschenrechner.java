import java.util.*;
import java.util.Scanner;

public class Taschenrechner

{

  public static void main(String[] args){

   System.out.println ("Geben sie eine Zahl ein: ");

   Scanner Input = new Scanner(System.in);
   float number = Input.nextFloat();

   float antwort;
   antwort = number * 2;

   System.out.println("Das doppelte vom "+number + " ist " + antwort);

  }
}
//Aufgabe:
//Zwei Zahlen eingeben und addieren, subtrahieren,
//dievidieren , multiplizieren, Restoperation mit %
