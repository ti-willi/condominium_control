package entities;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Apartment {
	
	private Integer number;
	private Double squareMeters;
	private Integer badrooms;
	private Integer bathrooms;
	private Double condominiumFee;
	private Double serviceFee;
	private Double amount;

	
	private Owner owner;
	
	private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
	
	public Apartment() {
	}

	public Apartment(Integer number, Double squareMeters, Integer badrooms, Integer bathrooms, Double condominiumFee, Double serviceFee, Double amount, Owner owner) {
		this.number = number;
		this.squareMeters = squareMeters;
		this.badrooms = badrooms;
		this.bathrooms = bathrooms;
		this.condominiumFee = condominiumFee;
		this.serviceFee = serviceFee;
		this.amount = amount;
		this.owner = owner;
	}

	public Apartment(Integer number, Double squareMeters, Integer badrooms, Integer bathrooms, Owner owner) {
		this.number = number;
		this.squareMeters = squareMeters;
		this.badrooms = badrooms;
		this.bathrooms = bathrooms;
		this.owner = owner;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Double getSquareMeters() {
		return squareMeters;
	}

	public void setSquareMeters(Double squareMeters) {
		this.squareMeters = squareMeters;
	}

	public Integer getBadrooms() {
		return badrooms;
	}

	public void setBadrooms(Integer rooms) {
		this.badrooms = rooms;
	}

	public Integer getBathrooms() {
		return bathrooms;
	}

	public void setBathrooms(Integer bathrooms) {
		this.bathrooms = bathrooms;
	}

	public Double getCondominiumFee() {
		return condominiumFee;
	}

	public void setCondominiumFee(Double condominiumFee) {
		this.condominiumFee = condominiumFee;
	}
	
	public Double getServiceFee() {
		return serviceFee;
	}

	public void Double(Double serviceFee) {
		this.serviceFee = serviceFee;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}
		
	public void condominiumFee(Condominium cond) {
		condominiumFee = squareMeters * cond.condominiumFeePerSquareMeters();
	}
	
	public void apartmentServiceFee(Condominium cond) {
		serviceFee = cond.ServiceFeePerSquareMeters() * squareMeters;
	}

	public void totalCondominiumFeeAndServiceFee(Condominium cond) {
		amount = squareMeters * cond.condominiumFeePerSquareMeters() + serviceFee;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Number: " + number);
		sb.append("\nOwner: " + owner);
		sb.append("\nSquare meters: " + String.format("%.2f", squareMeters));
		sb.append("\nBadrooms: " + badrooms);
		sb.append("\nBathrooms: " + bathrooms);
		sb.append("\nCondominium fee: " + String.format("%.2f", condominiumFee));
		sb.append("\nService fee: " + String.format("%.2f", serviceFee));
		sb.append("\nAmount: " + String.format("%.2f", amount));
		sb.append("\nDate: " + dtf.format(Instant.now()));
		
		return sb.toString();	
	}

}
