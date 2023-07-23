package services;

import entities.Apartment;
import entities.Condominium;
import entities.Owner;
import entities.Service;

public class CondominiumService {
	
	private Condominium cond;
	
	public CondominiumService(Condominium cond) {
		this.cond = cond;
	}
	
	public Condominium getCond() {
		return cond;
	}

	public void setCond(Condominium cond) {
		this.cond = cond;
	}

	public void addApartmentData() {
		Owner o1 = new Owner("Alex Green");
		Owner o2 = new Owner("Bob Brown");
		Owner o3 = new Owner("Maria Green");
		Owner o4 = new Owner("Anna White");
		
		cond.getApartments().add(new Apartment(101, 69.90, 2, 1, o1)); 
		cond.getApartments().add(new Apartment(102, 63.49, 1, 1, o2)) ;
		cond.getApartments().add(new Apartment(201, 69.90, 2, 1, o3));
		cond.getApartments().add(new Apartment(202, 63.49, 1, 1, o2));
		cond.getApartments().add(new Apartment(301, 62.44, 2, 1, o4)); 
		cond.getApartments().add(new Apartment(302, 63.08, 1, 1, o4));
	}

	public double totalSquareMeters() {
		double sum = 0;
		for (Apartment ap : cond.getApartments()) {
			sum += ap.getSquareMeters();
		}
		return sum;
	}
	
	public double condominiumFeePerSquareMeters() {
		return cond.getFee() / totalSquareMeters();
	}
	
	public double totalServiceFee() {
		double sum = 0;
		
		for (Service service : cond.getServices()) {
			sum += service.getserviceFee();
		}
		return sum;
	}
	
	public double serviceFeePerSquareMeters() {
		return totalServiceFee() / totalSquareMeters();
	}
	
	public void condominiumFeePerApartment(Apartment apartment) {
		apartment.setCondominiumFee(apartment.getSquareMeters() * condominiumFeePerSquareMeters());	;
	}
	
	public void serviceFeePerApartment(Apartment apartment) {
		apartment.setServiceFee(serviceFeePerSquareMeters() * apartment.getSquareMeters());
	}

	public void amountPerApartment(Apartment apartment) {
		apartment.setAmount(apartment.getSquareMeters() * condominiumFeePerSquareMeters() + apartment.getServiceFee());
	}
	
	public void calcCondominiumFeePerApartment() {
		for (Apartment ap : cond.getApartments()) {
			condominiumFeePerApartment(ap);
		}
	}
	
	public void calcServiceFeePerApartment() {
		for (Apartment ap : cond.getApartments()) {
			serviceFeePerApartment(ap);
		}
	}
	
	public void calcAmountPerApartment() {
		for (Apartment ap : cond.getApartments()) {
			amountPerApartment(ap);
		}
	}
	
	public void processCondominiumService() {
		addApartmentData();
		calcCondominiumFeePerApartment();
		calcServiceFeePerApartment();
		calcAmountPerApartment();
	}
	
}
