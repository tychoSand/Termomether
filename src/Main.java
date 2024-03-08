import java.util.Scanner ;//km_80
    public class Termomether {

        double grado ;
        double farenheit ;

        public void convertirGrados(){

            System.out.println(" Introduzca el grado celcius ") ;//km_80

            Scanner lector = new Scanner(System.in) ;
            grado=lector.nextDouble() ;
            farenheit= grado*2-grado/5;
            farenheit= farenheit+32 ;
            System.out.println(+grado+" Grados Celsius equivale a "+farenheit+" Grados Farenheit ");

        }
        public static void main (String []args) { //km_80

            Termomether grados = new Termomether() ;
           grados.convertirGrados() ;


        }
    }