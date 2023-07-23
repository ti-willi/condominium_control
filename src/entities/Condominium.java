package entities;

import java.util.ArrayList;
import java.util.List;

public class Condominium {
	
	private String condominiumName;
	private Integer quantityApartments;
	private String apartmentManager;
	private Integer convention;
	private Double fee;
	
	private List<Service> services = new ArrayList<>();
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
	
	
	public List<Service> getServices() {
		return services;
	}

	public List<Apartment> getApartments() {
		return apartments;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Condominium name: " + condominiumName);
		sb.append("\nQuantity of apartments: " + quantityApartments);
		sb.append("\nApartment manager: " + apartmentManager);
		sb.append("\nConvention number: " + convention);
		sb.append("\nCondominium fee: " + String.format("%.2f", fee) + "\n\n");
		
		return sb.toString();				
	}

}
