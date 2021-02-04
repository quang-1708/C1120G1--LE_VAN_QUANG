package session_17_string_regex.bai_tap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassPhone {
    private static final String PHONE_NUMBER_REGEX = "^[(]\\d{2,}[)]-[(]0\\d{9,}[)]$";

    public ValidateClassPhone() {
    }
    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(PHONE_NUMBER_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        ValidateClassPhone validateClassPhone = new ValidateClassPhone();
        String str = "(84)-(0978489648)";
        System.out.println(validateClassPhone.validate(str));
    }
}
