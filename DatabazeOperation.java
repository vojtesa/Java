package cviceni_2;

import java.util.Scanner;

public class DatabaseOperation {

	public static void main(String[] args) {
			System.out.println("Zacatek programu");
			Scanner sc = new Scanner(System.in);
			/*Integer test = sc.nextInt();
			System.out.println("Test je:" + test);*/
			Databaze[] databazeArray = new Databaze[3];
			for(int i = 0; i < 3; i++) {
				
				System.out.println("Zadejte jmeno: ");
				String name = sc.next();
				System.out.println("Zadejte rok: ");
				Integer year = sc.nextInt();
				databazeArray[i] = new Databaze(name, year);
				//System.out.println(databazeArray[i].getName());
				//System.out.println(databazeArray[i].getYear());
				//System.out.println(databazeArray[i].getWorkingHours());
			}
			System.out.println("Zadej novou max vyssi uvazku");
			Double maxWorkingHours = sc.nextDouble();
			Databaze.setMaxWorkingHours(maxWorkingHours);
			
			while(true) {
				System.out.print("Zadejte index osoby: ");
				
				Integer index = sc.nextInt();
				if (index > (databazeArray.length - 1)) {
					System.out.println("Prilis velky index");
					continue;
				}
				System.out.print("\n");
				System.out.println(databazeArray[index].getName());
				System.out.println(databazeArray[index].getYear());
				System.out.print("Zadejte novou vysi uvazku: ");
				
				Double novyUvazek = sc.nextDouble();
				boolean success = databazeArray[index].checkAndSetWorkingHours(novyUvazek);
				if(success) {
					System.out.println(databazeArray[index].getName());
					System.out.println(databazeArray[index].getYear());
					System.out.println(databazeArray[index].getWorkingHours());
				}
				else {
					System.out.println("Nenastavil se uvazek");
				}
			}
			
	}

}
