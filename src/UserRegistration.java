
import java.util.regex.Pattern;

public class UserRegistration
{
    public boolean validateFirstName(String firstName){
        String regex= "^[A-Z][a-zA-Z]{2,}$";
        return Pattern.matches(regex, firstName);
    }

    public boolean validateLastName(String lastName){
        String regex= "^[A-Z][a-zA-Z]{2,}$";
        return Pattern.matches(regex, lastName);
    }
    public boolean validateEmail(String email) {
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        return Pattern.matches(regex, email);
    }public boolean validateMobileNumber(String mobileNumber) {
    String regex = "^[0-9]{2} [0-9]{10}$";
    return Pattern.matches(regex, mobileNumber);
}

    public static void main(String[] args){
        UserRegistration userRegistration = new UserRegistration();
        System.out.println(userRegistration.validateFirstName("Dhruv"));
        System.out.println(userRegistration.validateFirstName("dh"));

        System.out.println(userRegistration.validateLastName("Rohatgi"));
        System.out.println(userRegistration.validateLastName("ro"));

    }
}
