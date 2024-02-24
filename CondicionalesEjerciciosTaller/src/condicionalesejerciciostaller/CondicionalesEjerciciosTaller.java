/*En una tienda de computadoras se planea ofrecer a los clientes un descuento que dependerá
del número de equipos que compre. Si las computadoras son menos de cinco se les dará un
10% de descuento sobre el total de la compra; si el número de computadoras es mayor o igual
a cinco pero menos de diez se le otorga un 20% de descuento; y si son 10 o más se les da un
40% de descuento. El precio de cada computadora es de U$500.*/

package condicionalesejerciciostaller;
import java.util.Scanner;
/**
 *
 * @author JulianAndresGuzmanCuellar
 */

public class CondicionalesEjerciciosTaller {

    public static void main(String[] args) {
        
        // variables:
        Scanner in = new Scanner(System.in);
        int precio = 500;
        
        //código:
        System.out.println("Bienvenido a computadoras Julian ¿Cuantas computadoras quieres comprar?");
        int NumComputadoras = in.nextInt();
        
        
        //El precio de cada pc es de 500
        if (NumComputadoras < 5){ // Descuento del 10
            
            System.out.println("El descuento que tienes es de 10%");
            System.out.println("El valor total de la compra es: "  + ((NumComputadoras * precio) - (NumComputadoras * precio) * 0.1 ));
            
        }else if (NumComputadoras >= 5 && NumComputadoras < 10){ // descuento del 20
            System.out.println("El descuento que tienes es de 20%");
            System.out.println("El valor total de la compra es: "  + ((NumComputadoras * precio) - (NumComputadoras * precio) * 0.2 ));
            

        }else if (NumComputadoras >= 10){
            System.out.println("El descuento que tienes es de 40%");
            System.out.println("El valor total de la compra es: "  + ((NumComputadoras * precio) - (NumComputadoras * precio) * 0.4 ));
        }

   }        

}
