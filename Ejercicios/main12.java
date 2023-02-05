import java.util.Scanner;

import com.Lavadora12.Lavadora;

public class main12 {
    public static void main(String[] args) {
        Lavadora lavadoras = new Lavadora();
        Scanner lector = new Scanner(System.in);

        System.out.println("Digite 1 para lavadora grande / digite 2 para lavadora pequeña");
        lavadoras.asignarTipo(lector.nextInt());
        System.out.println("¿Cuantas lavadoras desea alquilar?");
        lavadoras.asignarCantidad(lector.nextInt());
        System.out.println("¿Por cuanto tiempo desea alquilarlas?");
        lavadoras.asignarHoras(lector.nextInt());

        lavadoras.valor();

        System.out.println("el valor total es de: " + lavadoras.valorTotal());
    }
}
