package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Condominium;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What's condominium name? ");
		String condominiumName = sc.nextLine();
		System.out.print("How many apartments does the " + condominiumName + " condominium have? ");
		int quantityApartments = sc.nextInt();
		System.out.print("Who's the apartment manager? ");
		String apartmentManager = sc.nextLine();
		System.out.print("What's the number of the convention");
		int convention = sc.nextInt();
		
		
		
		
		sc.close();

	}

}
