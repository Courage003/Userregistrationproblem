
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

    public static void main(String[] args){
        UserRegistration userRegistration = new UserRegistration();
        System.out.println(userRegistration.validateFirstName("Dhruv"));
        System.out.println(userRegistration.validateFirstName("dh"));

        System.out.println(userRegistration.validateLastName("Rohatgi"));
        System.out.println(userRegistration.validateLastName("ro"));

    }
}
