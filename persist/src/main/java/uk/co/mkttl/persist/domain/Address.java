package uk.co.mkttl.persist.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {

	@Column(name="Number")
	private String _number;
	
	@Column(name="Street")		
	private String _street;
	
	@Column(name="City")
	private String _city;
	
	@Column(name="Postcode")
	private String _postcode;
	
	@Id
	@OneToOne
	private Team _team;
	
	public String getNumber() {
		return _number;
	}
	public void setNumber(String number) {
		_number = number;
	}

	public String getStreet() {
		return _street;
	}
	public void setStreet(String street) {
		_street = street;
	}

	public String getCity() {
		return _city;
	}
	public void setCity(String city) {
		_city = city;
	}
	
	public String getPostcode() {
		return _postcode;
	}
	public void setPostcode(String postcode) {
		_postcode = postcode;
	}
	
	public Team getTeam() {
		return _team;
	}
	public void setTeam(Team team) {
		_team = team;
	}
	
}
