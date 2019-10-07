package User;

public interface ExceptionCustomer {
	boolean checkEmailException(String checkEmail);
	boolean checkDateException(String checkDate) throws Exception;
	boolean checkIdChungMinhException(String checkIdChungMinh) throws Exception;
}
