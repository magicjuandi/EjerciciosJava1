import java.util.Scanner;

import com.Gym17.Gym;

public class main17 {
    public static void main(String[] args) {
        Gym gym = new Gym();
        Scanner reader = new Scanner(System.in);
        System.out.println("¿Como desea pagar la mensualidad? 1(15 dias por 18000), 2(30 dias por 35000), 3(3 meses por 86000)");
        gym.setType(reader.nextInt());
        System.out.println("Calculando...");
        System.out.println(gym.howMuch());

    }
}
