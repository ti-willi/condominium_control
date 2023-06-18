package entities;

import java.util.ArrayList;
import java.util.List;

import util.TaxService;

public class Condominium {
	
	private String condominiumName;
	private Integer quantityApartments;
	private String apartmentManager;
	private Integer convention;
	private Double fee;
	
	private List<TaxService> taxesService = new ArrayList<>();
	private List<Apartment> apartments = new ArrayList<>();
	
	public Condominium() {
	}

	public Condominium(String condominiumName, Integer quantityApartments, String apartmentManager, Integer convention, Double fee) {
		this.condominiumName = condominiumName;
		this.quantityApartments = quantityApartments;
		this.apartmentManager = apartmentManager;
		this.convention = convention;
		this.fee = fee;
	}
	
	

	public String getCondominiumName() {
		return condominiumName;
	}

	public void setCondominiumName(String condominiumName) {
		this.condominiumName = condominiumName;
	}

	public Integer getQuantityApartments() {
		return quantityApartments;
	}

	public void setQuantityApartments(Integer quantityApartments) {
		this.quantityApartments = quantityApartments;
	}

	public String getApartmentManager() {
		return apartmentManager;
	}

	public void setApartmentManager(String apartmentManager) {
		this.apartmentManager = apartmentManager;
	}

	public Integer getConvention() {
		return convention;
	}

	public void setConvention(Integer convention) {
		this.convention = convention;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}
	
	public void addTaxes(TaxService taxes) {
		taxesService.add(taxes);
	}
	
	public void removeTaxes(TaxService taxes) {
		taxesService.remove(taxes);
	}
	
	public void addApartments(Apartment apartment) {
		apartments.add(apartment);
	}
	
	public void removeApartments(Apartment apartment) {
		apartments.remove(apartment);
	}
	
	public void addApartmentData() {		
		Owner o1 = new Owner("Alex Green");
		Owner o2 = new Owner("Bob Brown");
		Owner o3 = new Owner("Maria Green");
		Owner o4 = new Owner("Anna White");
		
		apartments.add(new Apartment(101, 69.90, 2, 1, o1)); 
		apartments.add(new Apartment(102, 63.49, 1, 1, o2)) ;
		apartments.add(new Apartment(201, 69.90, 2, 1, o3));
		apartments.add(new Apartment(202, 63.49, 1, 1, o2));
		apartments.add(new Apartment(301, 62.44, 2, 1, o4)); 
		apartments.add(new Apartment(302, 63.08, 1, 1, o4));
		
		for (Apartment ap : apartments) {
			System.out.println(ap);
			System.out.println();
		}
	}
	
	public void taxList() {
		for (TaxService ts : taxesService) {
			System.out.println(ts);
		}
	}
	
	public double condominiumTax() {
		return fee /= quantityApartments;
	}
	
	public double totalTaxesService() {
		double sum = 0;
		
		for (TaxService ts : taxesService) {
			sum += ts.getServiceCost();
		}
		return sum;
	}
	
	public double taxesServicePerApartment() {
		return totalTaxesService() / quantityApartments;
	}
	
	public double condominiumTaxPerApartment() {
		return condominiumTax() + taxesServicePerApartment();
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Condominium name: ");
		sb.append(condominiumName);
		sb.append("\nQuantity of apartments: ");
		sb.append(quantityApartments);
		sb.append("\nApartment manager: ");
		sb.append(apartmentManager);
		sb.append("\nConvention number: ");
		sb.append(convention);
		sb.append("\nCondominium fee: ");
		sb.append(fee);
		sb.append("\n\nApartment data: ");
		
		
		
		return sb.toString();				
	}
	
	

}
