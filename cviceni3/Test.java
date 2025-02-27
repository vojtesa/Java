package Predmety;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BPC1 predmet1 = new BPC1();
		BPC2 predmet2 = new BPC2();
		BPIS predmet3 = new BPIS();
		
		System.out.print("Zadejte body pro predmet BPC1 Zapocet (max 20): ");
		predmet1.setBodyZapocet(sc.nextInt());
		System.out.print("Zadejte body pro predmet BPC1 Zkouska (max 80): ");
		predmet1.setBodyZkouska(sc.nextInt());
		
		System.out.print("Zadejte body pro predmet BPC2 Projekt (max 30): ");
		predmet2.setBodyProjekt(sc.nextInt());
		System.out.print("Zadejte body pro predmet BPC2 Zapocet (max 20): ");
		predmet2.setBodyZapocet(sc.nextInt());
		System.out.print("Zadejte body pro predmet BPC1 Zkouska (max 50): ");
		predmet2.setBodyZkouska(sc.nextInt());
		
		System.out.print("BPC1: Zapocet: "+ predmet1.bodyZapocet + 
				" bodu, Zkouska: " + predmet1.bodyZkouska + " bodu\nBPC1 celkem bodu: " +
				predmet1.bodyPredmetu());
		
		System.out.print("\nBPC2: Projekt: " + predmet2.bodyProjekt + " bodu, Zkouska: " 
				+ predmet2.bodyZapocet + " bodu, Zkouska: " + predmet2.bodyZkouska + 
				" bodu\nBPC2 celkem bodu: " +
				predmet2.bodyPredmetu());
		
		System.out.print("\n\n");
		predmet1.udeleniZapoctu();
		predmet2.udeleniZapoctu();
		
		
	}

}

