import java.util.Scanner;

import com.Max15.Max;

public class main15 {
    public static void main(String[] args) {
        Max max = new Max();
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese el numero 1");
        max.setNumber1(reader.nextInt());
        System.out.println("Ingrese el numero 2");
        max.setNumber2(reader.nextInt());
        System.out.println("Ingrese el numero 3");
        max.setNumber3(reader.nextInt());
        System.out.println("Calculando el mayor");
        System.out.println(max.max());

        
    }
}
