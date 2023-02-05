import java.util.Scanner;

import com.Operador22.Operador;

public class main22 {
    public static void main(String[] args) {
        Operador ejercicio22 = new Operador();
        Scanner lector = new Scanner(System.in);

        System.out.println("Escriba su operador");
        ejercicio22.setOperador(lector.next());

        System.out.println("Escriba los minutos totales consumidos");
        ejercicio22.setMinutosConsumidos(lector.nextInt());

        ejercicio22.operadorPrecios();

        System.out.println("El precio de su plan es de:" + ejercicio22.precioTotal());
    }
}
