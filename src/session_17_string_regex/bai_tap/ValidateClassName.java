package session_17_string_regex.bai_tap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {
    private static final String CLASS_NAME_REGEX = "^[CAP]\\d{4,}[GHIKLM]$";

    public ValidateClassName() {

    }
    public boolean validate (String regex) {
        Pattern pattern = Pattern.compile(CLASS_NAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
       ValidateClassName validateClassName = new ValidateClassName();
        String str = "C0318G";
        String str2 = "P0323A";
        System.out.println(validateClassName.validate(str));
        System.out.println(validateClassName.validate(str2));
    }
}
