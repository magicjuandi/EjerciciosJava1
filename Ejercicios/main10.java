import java.util.Scanner;

import com.Salario10.Salario;

public class main10 {
    public static void main(String[] args) {
        Salario salario = new Salario();
        Scanner lector = new Scanner(System.in);

        System.out.println("Digite su nombre");
        salario.asignarNombre(lector.next());

        System.out.println("Digite el numero de horas que trabajó");
        salario.asignarHoras(lector.nextInt());

        salario.caluclarValorHoras();

        System.out.println("Señor " + salario.nombre + " el numero de horas es " + salario.numeroHoras + " y su salario equivale a " + salario.salarioTotal());



    }
}
