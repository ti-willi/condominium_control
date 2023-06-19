package entities;

public class Apartment {
	
	private Integer number;
	private Double squareMeters;
	private Integer badrooms;
	private Integer bathrooms;
	private Double condominiumFee;
	
	private Owner owner;
	
	public Apartment() {
	}

	public Apartment(Integer number, Double squareMeters, Integer badrooms, Integer bathrooms, Double condominiumFee, Owner owner) {
		this.number = number;
		this.squareMeters = squareMeters;
		this.badrooms = badrooms;
		this.bathrooms = bathrooms;
		this.condominiumFee = condominiumFee;
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

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	
	public double apartmentTax(Condominium condominium) {
		return condominium.taxesServicePerSquareMeters() * squareMeters;
	}

	public void condominiumFee(Condominium condominium) {
		condominiumFee = squareMeters * condominium.condominiumFeePerSquareMeters() + apartmentTax(condominium);
	}
	
	public String toString() {
		return "Number: "
				+ number
				+ "\nOwner: "
				+ owner
				+ "\nSquare meters: "
				+ squareMeters
				+ "\nBadrooms: "
				+ badrooms
				+ "\nBathrooms: "
				+ bathrooms
				+ "\nCondominium fee: "
				+ condominiumFee;
	}

}
