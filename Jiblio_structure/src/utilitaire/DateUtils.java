package utilitaire;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateUtils {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static LocalDate stringToDate(String dateString) {
        try {
            return LocalDate.parse(dateString, FORMATTER);
        } catch (DateTimeParseException e) {
            System.out.println("la date est invalide!");
            return null;
        }
    }

    public static boolean isValidDate(String dateString) {
        try {
            LocalDate.parse(dateString, FORMATTER);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}
