package day3;


public class PasswordInvalidException extends RuntimeException{
	private static final long serialVersionUID=1L;
	public PasswordInvalidException(){
		System.out.println("Incorrect Password");
	}

}
