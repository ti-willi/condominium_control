package entities;

import java.util.ArrayList;
import java.util.List;

import services.ServiceFee;

public class Condominium {
	
	private String condominiumName;
	private Integer quantityApartments;
	private String apartmentManager;
	private Integer convention;
	private Double fee;
	
	private List<ServiceFee> services = new ArrayList<>();
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
	
	public void addTaxes(ServiceFee taxes) {
		services.add(taxes);
	}
	
	public void removeTaxes(ServiceFee taxes) {
		services.remove(taxes);
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
		
		calcCondominiumFee();
		calcServiceFee();
		calcCondominiumFeeAndServiceFee();
	}
	
	public double totalSquareMeters() {
		double sum = 0;
		for (Apartment ap : apartments) {
			sum += ap.getSquareMeters();
		}
		return sum;
	}
	
	public double condominiumFeePerSquareMeters() {
		return fee / totalSquareMeters();
	}
	
	public double totalServiceFee() {
		double sum = 0;
		
		for (ServiceFee sf : services) {
			sum += sf.getServiceCost();
		}
		return sum;
	}
	
	public double ServiceFeePerSquareMeters() {
		return totalServiceFee() / totalSquareMeters();
	}
	
	public void calcCondominiumFee() {
		for (Apartment ap : apartments) {
			ap.condominiumFee(this);
		}
	}
	
	public void calcServiceFee() {
		for (Apartment ap : apartments) {
			ap.apartmentServiceFee(this);
		}
	}
	
	public void calcCondominiumFeeAndServiceFee() {
		for (Apartment ap : apartments) {
			ap.totalCondominiumFeeAndServiceFee(this);
		}
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Condominium name: " + condominiumName);
		sb.append("\nQuantity of apartments: " + quantityApartments);
		sb.append("\nApartment manager: " + apartmentManager);
		sb.append("\nConvention number: " + convention);
		sb.append("\nCondominium fee: " + String.format("%.2f", fee) + "\n\n");
		addApartmentData();
		
		if (services.size() > 0) {
			sb.append("Services fee:\n\n");
			for (ServiceFee sf : services) {
				sb.append(sf + "\n");
			}
			sb.append("Total service fee: " + String.format("%.2f", totalServiceFee()) + "\n\n");
		}
		
		for (Apartment ap : apartments) {
			sb.append(ap + "\n\n");
		}
		
		return sb.toString();				
	}

}
