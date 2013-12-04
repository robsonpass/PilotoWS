/**
 *BaseDAO
 *
 *@author particular
 *@date 29/10/2013
 *@version 1.0
 */
package br.com.pilotows.dao;

import java.io.Serializable;
import java.util.List;

import br.com.pilotows.exception.ApplicationException;


/**
 * @author particular
 *
 */
public interface BaseDAO<MODEL> {
	
	public List<MODEL> list() throws ApplicationException;
	public List<MODEL> listByExample(Object model) throws ApplicationException;
	public MODEL search(Serializable id) throws ApplicationException;

	public boolean include(MODEL model) throws ApplicationException;
	public boolean alter(MODEL model) throws ApplicationException;
	public boolean remove(MODEL model) throws ApplicationException;

}
