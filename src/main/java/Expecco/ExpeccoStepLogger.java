package Expecco;

// Einfache Utility-Klasse für Expecco-Schritt-Logging
public class ExpeccoStepLogger {

    private static String sanitize(String text) {
        if (text == null) return "";
        // Ersetze jeden ':' innerhalb des Schrittnamens, damit Expecco nicht am zweiten ':' abschneidet
        return text.replace(':', '—');
    }

    public static void logStep(String step) {
        String fullMessage = "[EXPECCO] Step - " + sanitize(step);
        System.err.println(fullMessage);
    }
     
}
