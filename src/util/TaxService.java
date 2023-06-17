package util;

import java.time.LocalDate;

public class TaxService {
	
	private String service;
	private Double serviceCost;
	private LocalDate date;
	
	public TaxService() {
	}

	public TaxService(String service, Double serviceCost, LocalDate date) {
		this.service = service;
		this.serviceCost = serviceCost;
		this.date = date;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public Double getServiceCost() {
		return serviceCost;
	}

	public void setServiceCost(Double serviceCost) {
		this.serviceCost = serviceCost;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
	public String toString() {
		return service
				+"\n"
				+ serviceCost
				+"\n"
				+ date
				+ "\n";
	}

}
