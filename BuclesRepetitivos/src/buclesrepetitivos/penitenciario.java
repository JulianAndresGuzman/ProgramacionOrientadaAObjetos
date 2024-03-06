/*
Un centro penitenciario tiene N internos registrados y requiere un reporte con el nombre y la
condena (en meses) de los internos con menos de 36 meses de condena. También debe mostrar
la cantidad de internos que cumplen con dicha condición.
 */
/**
 *
 * @author JulianAndresGuzman
 */

package buclesrepetitivos;
import java.util.Scanner;
public class penitenciario {
    public static void main(String args[]) {
        
        String nombres[] = new String[10];
        int condena [] = new int[nombres.length];
        Scanner in = new Scanner(System.in);
        
        for (int n = 0; n < nombres.length; n++){
            System.out.println("Ingrese nombre del prisionero");
            nombres[n] = in.nextLine();
        }
        for (int n = 0; n < nombres.length; n++){
            System.out.println("ingrese condena del prisionero en meses: " + nombres[n]);
            condena[n] = in.nextInt();
    }
         for (int n = 0; n < nombres.length; n++){
            System.out.println("la condena de " + nombres[n] + "Es de: " + condena[n]);
            
}
}
}