import java.util.Scanner;

import com.ParOImpar13.ParoImpar;

public class main13 {
    public static void main(String[] args) {
        ParoImpar parOInpar = new ParoImpar();
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese un numero para saber si es par o inpar ");
        parOInpar.asignarNumero(lector.nextInt());

        System.out.println(parOInpar.calculo());
    }
}
