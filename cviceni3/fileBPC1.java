package Predmety;

public class BPC1 implements Predmety{
	int bodyZapocet = 0;
	int bodyZkouska = 0;
	
	public boolean setBodyZapocet(int ziskaneBody) {
		if (ziskaneBody <= 20) {
			this.bodyZapocet = ziskaneBody;
			return true;
		}
		else {
			System.out.println("Zadali jste prilis velke cislo");
			return false;
		}
	}
	
	public boolean setBodyZkouska(int ziskaneBody) {
		if (ziskaneBody <= 80) {
			this.bodyZkouska = ziskaneBody;
			return true;
		}
		else {
			System.out.println("Zadali jste prilis velke cislo");
			return false;
		}
	}
	
	@Override
	public String nazevPredmetu() {
		System.out.println("BPC1");
		return null;
	}

	@Override
	public int bodyPredmetu() {
		return bodyZapocet + bodyZkouska;
	}

	@Override
	public boolean udeleniZapoctu() {
		if (bodyZapocet >= minPocetBoduKzapoctu) {
			System.out.println("Zapocet z predmetu BPC1 udelen");
			return true;
		}
		else {
			System.out.println("Zapocet z predmetu BPC1 NEudelen");
			return false;
		}
	}

}
