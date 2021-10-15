import java.util.Scanner;

 /**
 * Title: Blumenladen - Rechner
 * Description: Dieses Programm soll einem Kunden eines Blumenladens die Möglichkeit geben, die verschiedenen möglichen Kombinationen eines Einkaufs preislich zu kalkulieren.
 *
 * @author Maximilian Elfrath; Ravinder Singh; Caren Adongo; Benito Ernst;
 * @version 2021-10-01
 */

public class Blumenladen {
    /**
     * Main-Methode; Wird bei Ausführung des Programms ausgeführt.
     * 
     * @param args Kommandozeilenparameter
     */
    public static void main(String[] args) {

        // Deklaration und Initialisierung von Konstanten
        final int preisRose = 249;     // 2,49€
        final int preisTulpe = 166;    // 1,66€
        final int preisNelke = 99;     // 0,99€
        final char wertumrechner = 100;
        final char euroSymbol = '€';

        // Deklaration und Initialisierung von Variablen
        int anzahlRosen = 0;
        int anzahlTulpen = 0;
        int anzahlNelken = 0;
        
        // Keine Beschreibung an dieser Stelle notwendig
        Scanner tastatur;
        tastatur = new Scanner(System.in);
        tastatur.useDelimiter(System.lineSeparator());

        // Ausgabe eines Wilkommenstexts im Terminal
        System.out.println("Willkommen in unserem Blumenladen :)");

        // Ausgabe der Eingabeaufforderung zur Eingabe der Anzahl der Rosen im Terminal
        System.out.println("Anzahl der Rosen: ");
        // Eine Eingabe vom Typ 'int' wird auf der Konsole erwartet
        // Danach wird der Wert der Variable 'anzahlRosen' zugewiesen
        anzahlRosen = tastatur.nextInt();

        // Ausgabe der Eingabeaufforderung zur Eingabe der Anzahl der Tulpen im Terminal
        System.out.println("Anzahl der Tulpen: ");
        // Eine Eingabe vom Typ 'int' wird auf der Konsole erwartet
        // Danach wird der Wert der Variable 'anzahlTulpen' zugewiesen
        anzahlTulpen = tastatur.nextInt();

        // Ausgabe der Eingabeaufforderung zur Eingabe der Anzahl der Nelken im Terminal
        System.out.println("Anzahl der Nelken: ");
        // Eine Eingabe vom Typ 'int' wird auf der Konsole erwartet
        // Danach wird der Wert der Variable 'anzahlTulpen' zugewiesen
        anzahlNelken = tastatur.nextInt();

        // Kalkulation des Gesamtpreises der einzelnen Blumensorten in Cent
        int cRose = preisRose * anzahlRosen;
        int cTulpe = preisTulpe * anzahlTulpen;
        int cNelke = preisNelke * anzahlNelken;

        // Gesamtpreis wird in eine Dezimazahl mit zwei Kommastellen umgewandelt
        int eRose = cRose / wertumrechner;
        int eTulpe = cTulpe / wertumrechner;
        int eNelke = cNelke / wertumrechner;
        int gesamtpreis = (cRose + cTulpe + cNelke) / wertumrechner;

        // Ausgabe der Preisaufstellung der einzelnen Blumensorten und der Gesamtkosten im Terminal
        System.out.println("Anzahl Rosen: " + anzahlRosen + " für " + eRose + euroSymbol);
        System.out.println("Anzahl Tulpen: " + anzahlTulpen + " für " + eTulpe + euroSymbol);
        System.out.println("Anzahl Nelken: " + anzahlNelken + " für " + eNelke + euroSymbol);
        System.out.println("Gesamtpreis: " + gesamtpreis + "€");
    }
}
