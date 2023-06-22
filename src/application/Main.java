package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Condominium;
import services.ServiceFee;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Condominium cond = new Condominium("Cond of cond", 6, "Alex Green", 1827986, 2000.00);
		
		System.out.println("Condominium services: ");
		System.out.print("Is there any extra service (y/n)? ");
		char validated = sc.next().charAt(0);
		
		while (validated == 'y') {
			System.out.print("Service: ");
			sc.nextLine();
			String service = sc.nextLine();
			System.out.print("Service cost: ");
			double serviceCost = sc.nextDouble();
			System.out.print("Service date (dd/mm/yyyy) :");
			LocalDate date = LocalDate.parse(sc.next(), dtf);
			System.out.print("Type 'y' to continue or 'end' to exit: ");
			validated = sc.next().charAt(0);
			ServiceFee serviceFee = new ServiceFee(service, serviceCost, date);
			cond.addTaxes(serviceFee);
		}
		
		System.out.println();
		System.out.println(cond);
		
		sc.close();

	}

}
