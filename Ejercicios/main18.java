import java.util.Scanner;

import com.Triangulo.Triangulo;

public class main18 {
    public static void main(String[] args) {
        Triangulo Ejercicio18 = new Triangulo();

        Scanner X = new Scanner(System.in);
        System.out.println("Escribe tres números");
        Ejercicio18.num1 = X.nextInt();
        Ejercicio18.num2 = X.nextInt();
        Ejercicio18.num3 = X.nextInt();

        Ejercicio18.SUMA = Ejercicio18.num1 + Ejercicio18.num2 + Ejercicio18.num3;

        System.out.println("Es un triángulo??? " + Ejercicio18.VERIFICACIÓN());}
    }

