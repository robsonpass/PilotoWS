/**
 *PersonDAO
 *
 *@author particular
 *@date 29/10/2013
 *@version 1.0
 */
package br.com.pilotows.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pilotows.exception.ApplicationException;
import br.com.pilotows.model.Person;

/**
 * @author particular
 *
 */
@Service
public class PersonDAO implements BaseDAO<Person>{
	
	
	private SessionFactory sessionFactory;

	@Autowired
	public PersonDAO(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	/**
	 * @return the sessionFactory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * @param sessionFactory the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<Person> list() throws ApplicationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> listByExample(Object model) throws ApplicationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person search(Serializable id) throws ApplicationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean include(Person model) throws ApplicationException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean alter(Person model) throws ApplicationException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Person model) throws ApplicationException {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	

}
