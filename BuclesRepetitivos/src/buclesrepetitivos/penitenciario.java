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

        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese el numero de los prisioneros");
        int numeroPrisioneros = in.nextInt();
        in.nextLine();

        String nombres[] = new String[numeroPrisioneros];
        int condena[] = new int[nombres.length];

        for (int n = 0; n < numeroPrisioneros; n++) {

            System.out.println("Ingrese nombre del prisionero");
            nombres[n] = in.nextLine();

            System.out.println("ingrese condena del prisionero en meses de: " + nombres[n]);
            condena[n] = in.nextInt();
            in.nextLine();
        }

        for (int n = 0; n < numeroPrisioneros; n++) {

            if (condena[n] < 36) {
                System.out.println("(**condena de menos de 36 meses**");
                System.out.println("la condena de " + nombres[n] + " Es de: " + condena[n] + " meses");
            } else {
                System.out.println("(**condena de mas de 36 meses**)");
                System.out.println("la condena de " + nombres[n] + " Es de: " + condena[n] + " meses");
            }

        }
    }
}
