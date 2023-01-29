import java.util.Scanner;

import com.Income16.Income;

public class main16 {
    public static void main(String[] args) {
        Income income = new Income();
        Scanner reader = new Scanner(System.in);
        System.out.println("Por favor digite su genero  1(Femenino), 2(masculino)");
        income.setSex(reader.nextInt());
        System.out.println("Por favor digite su edad");
        income.setAge(reader.nextInt());
        System.out.println("Calculando resultados...");
        System.out.println("La alcaldia le dio una ayuda de: "+income.confirmType());

    }
}
