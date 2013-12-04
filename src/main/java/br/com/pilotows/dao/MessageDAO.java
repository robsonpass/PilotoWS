/**
 *MessageDAO
 *
 *@author particular
 *@date 29/10/2013
 *@version 1.0
 */
package br.com.pilotows.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pilotows.exception.ApplicationException;
import br.com.pilotows.model.Message;



/**
 * @author particular
 *
 */
@Service
public class MessageDAO implements BaseDAO<Message>{
	
		
	private SessionFactory sessionFactory;
	
	public MessageDAO(){
		
	}
	
	@Autowired
	public MessageDAO(SessionFactory sf){
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
	public List<Message> list() throws ApplicationException {
		System.out.println("Inside list");
		List<Message> msg = new ArrayList<Message>();
		try{
			msg = getSessionFactory().openSession().createCriteria(Message.class).list();			
		}catch(Exception e){
			throw new ApplicationException(this.getClass(), e);
		}
		return (List<Message>)msg;
	}

	@Override
	public List<Message> listByExample(Object model)
			throws ApplicationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Message search(Serializable id) throws ApplicationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean include(Message model) throws ApplicationException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean alter(Message model) throws ApplicationException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Message model) throws ApplicationException {
		// TODO Auto-generated method stub
		return false;
	}
	
	

	

}
