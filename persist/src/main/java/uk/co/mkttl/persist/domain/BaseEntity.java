package uk.co.mkttl.persist.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@MappedSuperclass
@EntityListeners(value={BaseEntity.class})
public abstract class BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5139796065030510040L;

	@Basic
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CreatedDate", updatable = false)	
	private Date _createdDate = new Date();	
	
	@Version
	@Basic
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LastUpdatedDate")
	private Date _lastUpdateDate;// = new Date();
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")	
	private int _id;
	
	public int getId() {
		return _id;
	}
	public void setId(int id) {
		_id = id;
	}

	public Date getLastUpdateDate() {
		return _lastUpdateDate;
	}
	public void setLastUpdateDate(Date lastUpdateDate) {
		_lastUpdateDate = lastUpdateDate;
	}

	public Date getCreatedDate() {
		return _createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;
	}

}
