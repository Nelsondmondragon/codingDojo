import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.logging.SimpleFormatter;

public class AlfredQuotes {

    public String basicGreeting() {
        // No necesitas codificar aquí, este es un método de ejemplo
        return "Hola, Encantado de verte.";
    }

    public String guestGreeting(String name) {
        // TU CÓDIGO AQUÍ
        return String.format("Hola, %s. Encantado de verte", name);
    }

    public String dateAnnouncement() {
        // TU CÓDIGO AQUÍ
        System.out.println(new Date());
        Format dateFormat = new SimpleDateFormat("EEEEE, d MMMMM yyyy HH:mm:ss Z", new Locale("es", "CO"));
        return "Actualmente es " + dateFormat.format(new Date());
    }

    public String respondBeforeAlexis(String conversation) {
        // TU CÓDIGO AQUÍ

        String conversacionlower = conversation.toLowerCase();
        if (conversacionlower.indexOf("alexis") >= 0) {
            return "De inmediato, señor. Ciertamente no es lo suficientemente sofisticada para eso";
        }

        if (conversacionlower.indexOf("alfred") >= 0) {
            return "A su servicio. Como desee, naturalmente";
        }

        return "Bien. Y con eso, me retiraré";
    }

    public String dayPeriod() {
        LocalDateTime date = LocalDateTime.now();
        int hour = date.getHour();
        if (hour > 0 && hour < 12) {
            return "mannana";
        }
        if (hour >= 12 && hour < 18) {
            return "tarde";
        }
        return "noche";
    }

    public String guestGreeting(String name, String dayPeriod) {
        if (dayPeriod == "mannana") {
            dayPeriod = "dia";
        }
        return String.format("Buen%ss %ss, %s. Encantado de verte", (dayPeriod == "mannana" ? "o" : "a"),
                dayPeriod, name);
    }

    public String speak(String conversacion) {
        conversacion = conversacion.toLowerCase();
        if (conversacion.indexOf("robot") >= 0) {
            return "NO ME GUSTA ESA PALABRA";
        }
        return "Me gusta escucharte";
    }

    // BONUS NINJA
    // Ver las especificaciones para sobrecargar el método guessGreeting
    // ="comment from-rainbow">// BONUS SENSEI
    // ¡Escribe tu propio método AlfredQuotes usando cualquiera de los métodos
    // String que has aprendido!
}
