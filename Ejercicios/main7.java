import com.Area7.Area7;

public class main7 {
    public static void main (String args[]) {
        Area7 ejeRectangulo = new Area7();

        ejeRectangulo.altura = 15.5;
        ejeRectangulo.base = 20.2;

        System.out.println(ejeRectangulo.validarDatos());

        System.out.println("The area of the rectangle is: " + ejeRectangulo.calcularArea() + " cm");



        }
}
