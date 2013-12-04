/**
 *Message
 *
 *@author particular
 *@date 29/10/2013
 *@version 1.0
 */
package br.com.pilotows.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * @author particular
 *
 */
@Entity
@Table(name="message", uniqueConstraints= {@UniqueConstraint(columnNames="id")})
public class Message implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private Integer id;
	private Person personTo;
	private Person personFrom;
	private String content;
	
	
	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id", unique=true, nullable=false)
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the personTo	@Column(name="id_person_to")
	 */
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_person_to", columnDefinition="id")
	public Person getPersonTo() {
		return personTo;
	}
	/**
	 * @param personTo the personTo to set
	 */
	public void setPersonTo(Person personTo) {
		this.personTo = personTo;
	}
	/**
	 * @return the personFrom @Column(name="id_person_from")
	 */
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_person_from", columnDefinition="id")
	public Person getPersonFrom() {
		return personFrom;
	}
	/**
	 * @param personFrom the personFrom to set
	 */
	public void setPersonFrom(Person personFrom) {
		this.personFrom = personFrom;
	}
	/**
	 * @return the content
	 */
	@Column(name="content")
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((personFrom == null) ? 0 : personFrom.hashCode());
		result = prime * result
				+ ((personTo == null) ? 0 : personTo.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Message other = (Message) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (personFrom == null) {
			if (other.personFrom != null)
				return false;
		} else if (!personFrom.equals(other.personFrom))
			return false;
		if (personTo == null) {
			if (other.personTo != null)
				return false;
		} else if (!personTo.equals(other.personTo))
			return false;
		return true;
	}
	
	

}
