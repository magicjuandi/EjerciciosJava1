import java.util.Scanner;

import com.MedicApp2.MedicApp;

public class main2 {
    public static void main(String[] args) {
        MedicApp medicApp =  new MedicApp();
        medicApp.codApp = 321;
        medicApp.room = 7;
        medicApp.nameDoc = "Rudolf Katz";
        medicApp.setMedCenter("Saint Patroclus");
        Scanner sc = new Scanner(System.in);

        boolean exit = false;
        int option;

        while(!exit){

            System.out.println("1. Make an Appoiment");
            System.out.println("2. Check Appoiment ");
            System.out.println("3. Change hour");
            System.out.println("4. Exit");

            option = sc.nextInt();

            switch(option){
                case 1:
                    System.out.println("Type Name");
                    medicApp.namePacient = sc.next();

                    System.out.println("Type Date");
                    medicApp.date = sc.next();

                    System.out.println("Type Hour");
                    medicApp.hour = sc.next();
                    System.out.println( medicApp.makeApp());
                    break;
                case 2:
                    System.out.println(medicApp.checkData());
                    break;
                case 3:
                    System.out.println("Tpe a new Hour");
                    medicApp.hour = sc.next();
                    System.out.println(medicApp.changeHour());
                    break;
                case 4:
                    exit=true;
                    break;
                default:
                    System.out.println("Not Found");
            }
        }
    }
}
