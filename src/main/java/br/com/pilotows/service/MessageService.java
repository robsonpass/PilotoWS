package br.com.pilotows.service;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.pilotows.exception.ApplicationException;
import br.com.pilotows.model.Message;

@WebService
public interface MessageService{
	
	@WebResult(name="message")
	List<Message> listMessages(@WebParam(name = "idPerson") Integer idPerson) throws ApplicationException;

}
