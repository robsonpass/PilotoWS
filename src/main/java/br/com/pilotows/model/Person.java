/**
 *Person
 *
 *@author particular
 *@date 29/10/2013
 *@version 1.0
 */
package br.com.pilotows.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;



/**
 * 
 * @author particular
 *
 */
@Entity
@Table(name="person", uniqueConstraints= {@UniqueConstraint(columnNames="id")})
public class Person implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private Integer id;
	
	
	private String nameFirst;
	
	
	private String nameLast;
	
	
	private String nameMidle;
	
	
	private String rg;
	
//	private Collection<Message> messages;
	
	
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
	 * @return the nameFirst
	 */
	@Column(name="name_first")
	public String getNameFirst() {
		return nameFirst;
	}
	/**
	 * @param nameFirst the nameFirst to set
	 */
	public void setNameFirst(String nameFirst) {
		this.nameFirst = nameFirst;
	}
	/**
	 * @return the nameLast
	 */
	@Column(name="name_last")
	public String getNameLast() {
		return nameLast;
	}
	/**
	 * @param nameLast the nameLast to set
	 */
	public void setNameLast(String nameLast) {
		this.nameLast = nameLast;
	}
	/**
	 * @return the nameMidle
	 */
	@Column(name="name_midle")
	public String getNameMidle() {
		return nameMidle;
	}
	/**
	 * @param nameMidle the nameMidle to set
	 */
	public void setNameMidle(String nameMidle) {
		this.nameMidle = nameMidle;
	}
	/**
	 * @return the rg
	 */
	@Column(name="rg")
	public String getRg() {
		return rg;
	}
	/**
	 * @param rg the rg to set
	 */
	public void setRg(String rg) {
		this.rg = rg;
	}
	
		
//	/**
//	 * @return the messages
//	 */
//	@OneToMany(fetch=FetchType.LAZY,mappedBy="person")
//	public Collection<Message> getMessages() {
//		return messages;
//	}
//	/**
//	 * @param messages the messages to set
//	 */
//	public void setMessages(Collection<Message> messages) {
//		this.messages = messages;
//	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((nameFirst == null) ? 0 : nameFirst.hashCode());
		result = prime * result
				+ ((nameLast == null) ? 0 : nameLast.hashCode());
		result = prime * result
				+ ((nameMidle == null) ? 0 : nameMidle.hashCode());
		result = prime * result + ((rg == null) ? 0 : rg.hashCode());
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
		Person other = (Person) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nameFirst == null) {
			if (other.nameFirst != null)
				return false;
		} else if (!nameFirst.equals(other.nameFirst))
			return false;
		if (nameLast == null) {
			if (other.nameLast != null)
				return false;
		} else if (!nameLast.equals(other.nameLast))
			return false;
		if (nameMidle == null) {
			if (other.nameMidle != null)
				return false;
		} else if (!nameMidle.equals(other.nameMidle))
			return false;
		if (rg == null) {
			if (other.rg != null)
				return false;
		} else if (!rg.equals(other.rg))
			return false;
		return true;
	}	

	
	
}
