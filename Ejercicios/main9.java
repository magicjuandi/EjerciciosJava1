import com.Reclamo9.Reclamo;

public class main9 {
    public static void main(String[] args) {
        Reclamo ejereclamo = new Reclamo();

        ejereclamo.numeroReclamo = 12344;
        ejereclamo.setNombrePersona("Eliptik");
        ejereclamo.setAsunto("shipping delay");
        ejereclamo.descripcionReclamos = "It was sent 7 days ago and it has not arrived";
        ejereclamo.setEstadoReclamo("in review");

        System.out.println(ejereclamo.validarEstadoReclamo());
        System.out.println(ejereclamo.mensajeRecepcionReclamo());

    }
}
