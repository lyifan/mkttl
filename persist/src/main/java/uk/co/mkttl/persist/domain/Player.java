package uk.co.mkttl.persist.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Player extends BaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2436147077510084301L;

	@Embedded
	@Column(name="Name", nullable = false)
	private Name 	_name;
	
	@Column(name="Age", nullable = false)	
	private int 	_age;
	
	@Column(name="RegisterDate", nullable = false)	
	private Date	_registerDate = new Date();
	
	@ManyToOne
	@JoinColumn(name="TeamID", nullable=true)	
	private Team 	_team;
		
	public Name getName() {
		return _name;
	}
	public void setName(Name name) {
		_name = name;
	}
	
	public int getAge() {
		return _age;
	}
	public void setAge(int age) {
		_age = age;
	}
	
	public Date getRegisterDate() {
		return _registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		_registerDate = registerDate;
	}

	public Team getTeam() {
		return _team;
	}
	public void setTeam(Team team) {
		_team = team;
	}
}
