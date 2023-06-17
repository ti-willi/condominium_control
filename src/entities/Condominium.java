package entities;

import java.util.ArrayList;
import java.util.List;

import util.TaxService;

public class Condominium {
	
	private String condominiumName;
	private Integer quantityApartments;
	private String apartmentManager;
	private Integer convention;
	private Double tax;
	
	private List<TaxService> taxesService = new ArrayList<>();
	private List<Apartment> apartments = new ArrayList<>();
	
	public Condominium() {
	}

	public Condominium(String condominiumName, Integer quantityApartments, String apartmentManager, Integer convention, Double tax) {
		this.condominiumName = condominiumName;
		this.quantityApartments = quantityApartments;
		this.apartmentManager = apartmentManager;
		this.convention = convention;
		this.tax = tax;
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

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
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
	}
	
	public void taxList() {
		for (TaxService ts : taxesService) {
			System.out.println(ts);
		}
	}
	
	public double condominiumTax() {
		return tax /= quantityApartments;
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
		return condominiumName
				+ "\n"
				+ quantityApartments
				+ "\n"
				+ apartmentManager
				+ "\n"
				+ convention
				+ "\n"
				+ tax;				
	}
	
	

}
