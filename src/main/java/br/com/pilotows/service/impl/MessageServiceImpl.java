package br.com.pilotows.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pilotows.dao.MessageDAO;
import br.com.pilotows.exception.ApplicationException;
import br.com.pilotows.model.Message;
import br.com.pilotows.service.MessageService;

@WebService(endpointInterface="br.com.pilotows.service.MessageService")
@Service
public class MessageServiceImpl implements MessageService{

	
	
	
	private MessageDAO messagedao;
	
	public MessageServiceImpl(){
		
	}
	
	@Autowired
	public MessageServiceImpl(MessageDAO msg){
		this.messagedao = msg;
	}
	
	@Override
	public List<Message> listMessages(Integer idPerson) throws ApplicationException {
		List<Message> msg = new ArrayList<Message>(); 
		try{
			System.out.println("ID: "+idPerson);
			msg = messagedao.list();
			
		}catch(ApplicationException e){
			throw e;			
		}
		
		return msg;
	}

	
	/**
	 * @return the messagedao
	 */
	public MessageDAO getMessagedao() {
		return messagedao;
	}

	/**
	 * @param messagedao the messagedao to set
	 */
	public void setMessagedao(MessageDAO messagedao) {
		this.messagedao = messagedao;
	}
	
	

}
