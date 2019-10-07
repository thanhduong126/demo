package User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExceptionImpl implements ExceptionCustomer {
	public ExceptionImpl() {
	}
	String EMAIL_PATTERN = "^(.+)@(.+)$";
	String DATE_PATTERN = "^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$";
	String NUMBER_ID = "(^[0-9]*$)";

	@Override
	public boolean checkEmailException(String checkEmail) {
		Pattern pattern = Pattern. compile(EMAIL_PATTERN);
		Matcher matcher = pattern.matcher((CharSequence)checkEmail);
		return matcher.matches();
	}

	@Override
	public boolean checkDateException(String checkDate) throws Exception {
		Pattern pattern = Pattern.compile(DATE_PATTERN);
		Matcher matcher = pattern.matcher((CharSequence)checkDate);
		return matcher.matches();

	}

	@Override
	public boolean checkIdChungMinhException(String checkIdChungMinh) throws Exception{
		Pattern pattern = Pattern.compile(NUMBER_ID);
		Matcher matcher = pattern.matcher((CharSequence)checkIdChungMinh);
		return matcher.matches();
	}


}
