package entities;

import java.util.ArrayList;
import java.util.List;

public class Owner {
	
	private String name;
	
	private List<Apartment> apartments = new ArrayList<>();
	
	public Owner() {
	}

	public Owner(String name, List<Apartment> apartments) {
		this.name = name;
		this.apartments = apartments;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Apartment> getApartments() {
		return apartments;
	}
	
	public void addApartments(Apartment apartment) {
		apartments.add(apartment);
	}
	
	public void removeApartments(Apartment apartment) {
		apartments.remove(apartment);
	}
	

}
