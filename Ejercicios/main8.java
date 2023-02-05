import com.Envio8.Envio;

public class main8 {
    public static void main(String args[]) {
        Envio ejeenvio = new Envio();

        ejeenvio.numeroGuia = 1234;
        ejeenvio.setFecha("4/2/2023");
        ejeenvio.setTipoEmbalaje("Box");
        ejeenvio.cedulaCliente = 123456;
        ejeenvio.setPeso(4);
        ejeenvio.setCiudadOrigen("Calarcá");
        ejeenvio.setCiudadDestino("Bogotá");
        ejeenvio.setCosto(23000);
        ejeenvio.setEstadoEnvio("Sent");

        System.out.println("The cost per kilo of your shipment is: " + ejeenvio.calcularCostoXKilo() + " since your package has a weight of: " + ejeenvio.getPeso() + "kg");

        System.out.println(ejeenvio.verificarEntrega());


    }
}
