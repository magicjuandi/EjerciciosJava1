import java.util.Scanner;

import com.PosNeg11.PosNeg;

public class main11 {
    public static void main(String[] args) {
        PosNeg positivoONegativo = new PosNeg();
        Scanner lector = new Scanner(System.in);

        System.out.println("Digite un numero para saber si es positivo o negativo ");
        positivoONegativo.asignarNumero(lector.nextByte());

        System.out.println(positivoONegativo.resultado());
    }
}
