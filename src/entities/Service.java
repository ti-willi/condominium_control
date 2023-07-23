package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Service {
	
	private String service;
	private Double serviceFee;
	private LocalDate date;
	
	private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Service() {
	}

	public Service(String service, Double serviceFee, LocalDate date) {
		this.service = service;
		this.serviceFee = serviceFee;
		this.date = date;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public Double getserviceFee() {
		return serviceFee;
	}

	public void setserviceFee(Double serviceFee) {
		this.serviceFee = serviceFee;
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
		sb.append("\nService cost: " + String.format("%.2f", serviceFee));
		sb.append("\nService date: " + dtf.format(date) + "\n");
		
		return sb.toString();
	}

}
