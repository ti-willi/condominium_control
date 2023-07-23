package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Apartment;
import entities.Condominium;
import entities.Service;
import services.CondominiumService;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		Condominium cond = new Condominium("Eagle of the galaxies", 6, "Alex Green", 1827986, 2000.00);
		
		System.out.print("Is there any extra service (y/n)? ");
		char validated = sc.next().charAt(0);
		System.out.println();
		
		while (validated == 'y') {
			try {
				System.out.print("Service: ");
				sc.nextLine();
				String serviceName = sc.nextLine();
				System.out.print("Service cost: ");
				double serviceCost = sc.nextDouble();
				System.out.print("Service date (dd/mm/yyyy): ");
				LocalDate date = LocalDate.parse(sc.next(), dtf);
				System.out.println();
				System.out.print("Type 'y' to add some more or 'n' to exit: ");
				validated = sc.next().charAt(0);
				System.out.println();
				Service service = new Service(serviceName, serviceCost, date);
				cond.getServices().add(service);
			}
			catch (RuntimeException e) {
				System.out.println();
				System.out.println("Invalid data, try again!");
				System.out.println();
			}
		}
		
		System.out.println();
		System.out.println(cond);
		
		CondominiumService condService = new CondominiumService(cond);
		condService.processCondominiumService();
		
		if (cond.getServices().size() > 0) {
			System.out.println("Services fee:\n");
			for (Service service : cond.getServices()) {
				System.out.println(service);
			}
			System.out.println("Total service fee: " + String.format("%.2f", condService.totalServiceFee()) + "\n");
		}
		
		for (Apartment ap : cond.getApartments()) {
			System.out.println(ap + "\n");
		}
		
		sc.close();

	}

}
