import java.util.Scanner;

import com.Grades14.Grades;

public class main14 {
    public static void main(String[] args) {
        Grades grades = new Grades();
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese su nota de Fisica");
        grades.setPhysics(reader.nextDouble());
        System.out.println("Ingrese su nota de Quimica");
        grades.setChemistry(reader.nextDouble());
        System.out.println("Ingrese su nota de Biologia");
        grades.setBiology(reader.nextDouble());
        System.out.println("Ingrese su nota de Matematicas");
        grades.setMaths(reader.nextDouble());
        System.out.println("Ingrese su nota de Informatica");
        grades.setComputerScience(reader.nextDouble());
        System.out.println("Calculando su promedio....");
        System.out.println("Su promedio es de: "+ grades.finalGrade());
        System.out.println(grades.showMessage());


    }
}
