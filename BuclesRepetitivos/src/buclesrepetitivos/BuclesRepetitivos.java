package buclesrepetitivos;

import java.util.Scanner;

/**
 *
 * @author JulianAndresGuzman
 */

/*Una heladería desea obtener un reporte semanal de ventas. Para ello debe capturar en un
sistema todas las facturas de ventas realizadas. Cada factura contiene la cantidad y el sabor de
las paletas vendidas. Los sabores y los precios son: limón ($2500), nuez ($2800), lulo ($2600),
fresa ($2000) y crema ($3000). El sistema debe imprimir la cantidad de paletas vendidas de cada
sabor, el valor vendido y la venta total. Considere que una factura puede tener varias paletas de
diferentes sabores. */
public class BuclesRepetitivos {

    public static void main(String[] args) {

        //añadimos las variables, arreglos
        String Paletas[] = {"(1)Paleta Limón", "(2)Paleta Nuez", "(3)Paleta Lulo", "(4)Paleta Fresa", "(5)Paleta Crema"};
        int precios[] = {2500, 2800, 2600, 2000, 3000};
        int ventas[] = new int[precios.length];
        Scanner in = new Scanner(System.in);

        //Codigo
        System.out.println("las compras en el siguiente metodo (paleta) (compras)");
        String entrada = in.nextLine();

        for (int i = 0; i < Paletas.length; i++) {
            System.out.println("Cuantas paletas de " + Paletas[i] + " Comparaste?");
            int ventas2 = in.nextInt();
            ventas[i] = ventas2;
        }

        int totalVentas = 0;
        for (int i = 0; i < precios.length; i++) {
            System.out.println("paletas de " + Paletas[i] + "vendidas: " + ventas[i]);
            int subtotal = ventas[i] * precios[i];
            System.out.println("Subtotal de las paletas de " + Paletas[i] + " = " + subtotal);
            totalVentas += subtotal;
        }
    }
}
