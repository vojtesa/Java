package Predmety;

public class BPC2 implements Predmety{
	int bodyProjekt = 0;
	int bodyZapocet = 0;
	int bodyZkouska = 0;
	
	public boolean setBodyProjekt(int ziskaneBody) {
		if (ziskaneBody <= 30) {
			this.bodyProjekt = ziskaneBody;
			return true;
		}
		else {
			System.out.println("Zadali jste prilis velke cislo u projektu");
			return false;
		}
	}
	public boolean setBodyZapocet(int ziskaneBody) {
		if (ziskaneBody <= 20) {
			this.bodyZapocet = ziskaneBody;
			return true;
		}
		else {
			System.out.println("Zadali jste prilis velke cislo u zapoctu");
			return false;
		}
	}
	
	public boolean setBodyZkouska(int ziskaneBody) {
		if (ziskaneBody <= 50) {
			this.bodyZkouska = ziskaneBody;
			return true;
		}
		else {
			System.out.println("Zadali jste prilis velke cislo zkousky");
			return false;
		}
	}
	
	@Override
	public String nazevPredmetu() {
		System.out.println("BPC2");
		return null;
	}

	@Override
	public int bodyPredmetu() {
		return bodyZapocet + bodyZkouska + bodyProjekt;
	}

	@Override
	public boolean udeleniZapoctu() {
		if (bodyZapocet + bodyProjekt >= minPocetBoduKzapoctu) {
			System.out.println("Zapocet z predmetu BPC2 udelen");
			return true;
		}
		else {
			System.out.println("Zapocet z predmetu BPC2 NEudelen");
			return false;
		}
	}

}
