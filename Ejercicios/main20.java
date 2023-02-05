import java.util.Random;

import com.Problema20.Problema;

public class main20 {
    public static void main(String[] args) {
        Problema pc = new Problema();
        Random  rd = new Random();
        pc.pitido = rd.nextBoolean();
        pc.disc = rd.nextBoolean();
        pc.unit = rd.nextBoolean();

        System.out.println(pc.checkStatus());
    }
}
