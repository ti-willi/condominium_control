package services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ServiceFee {

	private String service;
	private Double serviceCost;
	private LocalDate date;
	
	private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public ServiceFee() {
	}

	public ServiceFee(String service, Double serviceCost, LocalDate date) {
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
		StringBuilder sb = new StringBuilder();
		
		sb.append("Service: " + service);
		sb.append("\nService cost: " + String.format("%.2f", serviceCost));
		sb.append("\nService date: " + dtf.format(date) + "\n");
		
		return sb.toString();
	}
	
}
