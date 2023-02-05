import java.util.Scanner;

import com.Auto21.Auto;

public class main21 {
    public static void main(String[] args) {
        Auto ejercicio21 = new Auto();
        Scanner lector = new Scanner(System.in);

        System.out.println("Digite el número de modelo del automovil");
        ejercicio21.setModelo(lector.nextInt());

        System.out.println(ejercicio21.avisoUsuario());
    }
}
