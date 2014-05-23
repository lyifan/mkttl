package uk.co.mkttl.persist.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Name implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -5044781424605906574L;
	
	@Column(name="FirstName")
	public String firstName;
	
	@Column(name="LastName")
	public String lastName;

	public Name() {
	}
}