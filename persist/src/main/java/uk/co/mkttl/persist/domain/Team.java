package uk.co.mkttl.persist.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

//import javax.persistence.CascadeType;

@Entity
public class Team extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1126387927731521421L;

	@Column(name = "Name", unique = true, nullable = false)	
	private String 			_name;
	
	@Column(name = "Captain")		
	private String 			_captain;
	
	@Column(name = "RegisterDate")	
	private Date 			_registerDate;
	
	@Column(name = "Active")	
	private boolean 		_active;
	
	@OneToOne(mappedBy = "team")
	@JoinColumn(name = "id")
	private Address 		_address;
	
	@OneToMany(mappedBy = "team", cascade = CascadeType.ALL)	
	private List<Player>	_players;

	public String getName() {
		return _name;
	}
	public void setName(String name) {
		_name = name;
	}

	public String getCaptain() {
		return _captain;
	}
	public void setCaptain(String captain) {
		_captain = captain;
	}


	public Date getRegisterDate() {
		return _registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		_registerDate = registerDate;
	}

	public boolean isActive() {
		return _active;
	}
	public void setActive(boolean active) {
		_active = active;
	}

	public Address getAddress() {
		return _address;
	}
	public void setAddress(Address address) {
		_address = address;
	}
	
	public List<Player> getPlayers() {
		return _players;
	}
	public void setPlayers(List<Player> players) {
		_players = players;
	}
}
