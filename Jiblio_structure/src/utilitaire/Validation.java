package utilitaire;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    public boolean isValidTitle(String titre) {
        String regex = "^[A-Za-z]\\w{1,29}$";
        Pattern p = Pattern.compile(regex);
        if (titre == null) {
            return false;
        }
        Matcher m = p.matcher(titre);
        return m.matches();
    }
    //    public boolean isValidISBN(int isbn) {
//        String regex = "^[A-Za-z]\\w{5,29}$";
//        Pattern p = Pattern.compile(regex);
//        if (isbn == null) {
//            return false;
//        }
//        Matcher m = p.matcher(isbn);
//        return m.matches();
//    }
    public boolean isValidName(String name) {
        String regex = "^[A-Za-z]\\w{1,29}$";
        Pattern p = Pattern.compile(regex);
        if (name == null) {
            return false;
        }
        Matcher m = p.matcher(name);
        return m.matches();
    }
}
