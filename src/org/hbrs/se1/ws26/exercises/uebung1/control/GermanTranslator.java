package org.hbrs.se1.ws26.exercises.uebung1.control;

public class GermanTranslator implements Translator {

	public String date = null;

	/**
	 * Methode zur Übersetzung einer Zahl in eine String-Repraesentation
	 */
	 public String translateNumber(int number) {
		 String result = "";
		 if (number > 0 && number < 13) {
			 return numberHelper(number);
		 } else if (number == 16) {
			 result = "sechzehn";
		 } else if (number == 17) {
			 result = "siebzehn";
		 } else if (number >= 13 && number < 20) {
			result = numberHelper(number % 10) + "zehn";
		 } else if (number >= 20 && number < 30) {
			 if (number == 20) {
				 result = "zwanzig";
			 } else {
				 result = numberHelper(number % 10) + "undzwanzig";
			 }
		 } else if (number >= 30 && number < 40) {
			 if (number == 30) {
				 result = "dreißg";
			 }  else {
				 result = numberHelper(number % 10) + "unddreißg";
			 }
		 } else if (number >= 40 && number < 50) {
			 if (number == 40) {
				 result = "vierzig";
			 } else {
				 result = numberHelper(number % 10) + "undvierzig";
			 }
		 } else if (number >= 50 && number < 60) {
			 if (number == 50) {
				 result = "fünfzig";
			 } else {
				 result = numberHelper(number % 10) + "undfünfzig";
			 }
		 } else if (number >= 60 && number < 70) {
			 if (number == 60) {
				 result = "sechzig";
			 } else {
				 result = numberHelper(number % 10) + "undsechzig";
			 }
		 } else if (number >= 70 && number < 80) {
			 if (number == 70) {
				 result = "siebzig";
			 } else  {
				 result = numberHelper(number % 10) + "undsiebzig";
			 }
		 } else if (number >= 80 && number < 90) {
			 if (number == 80) {
				 result = "achtzig";
			 } else {
				 result = numberHelper(number % 10) + "undachtzig";
			 }
		 } else if (number >= 90 && number < 100) {
			 if (number == 90) {
				 result = "neunzig";
			 } else {
				 result = numberHelper(number % 10) + "undneunzig";
			 }
		 } else if (number == 100){
			 result = "hundert";
		 } else {
			 result = "Ungültige Zahl!";
		 }

		return result;
	}

	private String numberHelper(int number) {
		switch(number) {
			case 0:
				return "null";
			case 1:
				return "eins";
			case 2:
				return "zwei";
			case 3:
				return "drei";
			case 4:
				return "vier";
			case 5:
				return "fünf";
			case 6:
				return "sechs";
			case 7:
				return "sieben";
			case 8:
				return "acht";
			case 9:
				return "neun";
			case 10:
				return "zehn";
			case 11:
				return "elf";
			case 12:
				return "zwölf";
			default:
				return "Diese Zahl ist zu groß!";
		}
	}

	/**
	 * Objektmethode der Klasse GermanTranslator zur Ausgabe einer Info.
	 */
	void printInfo(){
		System.out.println( "GermanTranslator v1.9, erzeugt am " + this.date );
	}

	/**
	 * Setzen des Datums, wann der Uebersetzer erzeugt wurde (Format: dd.MM.yyyy (Beispiel: "20.08.2026"))
	 * Das Datum sollte system-intern durch eine Factory-Klasse gesetzt werden und nicht von externen View-Klassen
	 * Technisch sollte einfach das "heutige" Datum gesetzt werden.
	 */
	public void setDate( String date ) {
		this.date = date;
	}

	/**
	 * Auslesen des gesetzten Datums
	 * @return
	 */
	public String getDate() {
		return date;
	}
}
