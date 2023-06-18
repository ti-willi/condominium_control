package entities;

public class Apartment {
	
	private Integer number;
	private Double squareMeters;
	private Integer badrooms;
	private Integer bathrooms;
	
	private Owner owner;
	
	public Apartment() {
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

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
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
				+ bathrooms;
	}
	
	
	

}
