package model.exception;

/*
	Ela pode ser uma extensão da clase Exception ou RuntimeException
	Se for uma extensão de Exception o compilador obriga a tratar
	e por ser serializable necessita número de versão
	Se for uma extensão de RuntimeException o compilador não obriga nada.
*/

//public class DomainException extends Exception  {
public class DomainException extends RuntimeException  {
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}
	
	
	
	
	
	
}
