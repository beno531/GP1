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

        // Deklaration der Konstante mit dem primitiven Fließkommaliteral Double & Initialisierung mit den Preisen der jeweiligen Blumensorte
        final double preisRose = 2.49;
        final double preisTulpe = 1.66;
        final double preisNelke = 0.99;

        // Deklaration der Konstante mit dem primitiven Datentyp Char & Initialisierung mit der Unicodezeichenkette zur Darstellung des Euro Zeichens
        final char euroSymbol = '\u20AC';

        // Deklaration der Variable mit dem primitiven Ganzahlendatentyp Int & Initialisierung mit dem Wert 0
        int anzahlRosen = 0;
        int anzahlTulpen = 0;
        int anzahlNelken = 0;
        
        /* 
        Die Eingabe der Anzahl der verschiedenen Blumensorten soll vom Nutzenden* selbst erfolgen
        Dazu wird die Eingabe über eine Tastatur benötigt
        Keine weitere Beschreibung an dieser Stelle erfordert
        */ 
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

        // Kalkulation des Gesamtpreises der einzelnen Blumensorten
        double cRose = preisRose * anzahlRosen;
        double cTulpe = preisTulpe * anzahlTulpen;
        double cNelke = preisNelke * anzahlNelken;

        // Kalkulation des Gesampreises
        double gesamtpreis = cRose + cTulpe + cNelke;

        /* 
        Ausgabe der Preisaufstellung der einzelnen Blumensorten und der Gesamtkosten im Terminal
        Die Ergebnisse werden durch eine Formatierung auf zwei Nachkommastellen gerundet. Das Prozentzeichen gilt als 
        Alias, dieser wird mit einem '.' von der Präzision (in diesem Fall 2) getrennt. Das 'f' gibt an, das es sich bei
        dem Wert um einen Float handelt. In unserem Fall wird aus dem Double ein Float konvertiert.
        */
        System.out.println("Anzahl Rosen: " + anzahlRosen + " für " + String.format("%.2f", cRose) + euroSymbol);
        System.out.println("Anzahl Tulpen: " + anzahlTulpen + " für " + String.format("%.2f", cTulpe) + euroSymbol);
        System.out.println("Anzahl Nelken: " + anzahlNelken + " für " + String.format("%.2f", cNelke) + euroSymbol);
        System.out.println("Gesamtpreis: " + String.format("%.2f", gesamtpreis) + euroSymbol);
    }
}
