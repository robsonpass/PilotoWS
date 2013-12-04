package br.com.pilotows.exception;


public class ApplicationException extends Exception{
	
	private static final long serialVersionUID = 1L;
	public String message;
	public final static String MARKER = "ERROR: ";
	
	
	/**
	 * Responsible for
	 *
	 *@author particular
	 *@date 28/10/2013
	 *@param errorClass
	 *@param exception
	 */
	public ApplicationException(Class errorClass, Throwable exception){
		//Erro xxx na classe xxx ao executar o m�todo xxx
		message = "Error: "+exception.getMessage()+" during executing class "+errorClass.getName()+" inside the method - ";
		for(int i=0; i< exception.getStackTrace().length; i++){
			if(exception.getStackTrace()[i].getClassName().equals(errorClass.getName())){
				message += exception.getStackTrace()[i].getMethodName();
				message += "();";
				break;
			}
		}
	}
	
	/**
	 * 
	 * @param exception
	 */
	public ApplicationException(Throwable exception){
		message = exception.getMessage();
	}
	
	
	/**
	 * Used just for possibles not treated exceptions
	 * @param exception
	 */
	public ApplicationException(String exception){
		message = exception;
	}
	
	
	
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Responsible for save Name
	 *
	 *@author particular
	 *@date 28/10/2013
	 *@param st1
	 *@param in1
	 *@return void
	 */
	public void saveName(String st1, Integer in1){
		
	}
	

}
