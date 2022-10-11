package core.validators;

public class Validator {
    public static boolean isUnique(String value1, String value2) {
        if(value1.toLowerCase() == value2.toLowerCase()) {
            return true;
        }
        return false;
    }
}
