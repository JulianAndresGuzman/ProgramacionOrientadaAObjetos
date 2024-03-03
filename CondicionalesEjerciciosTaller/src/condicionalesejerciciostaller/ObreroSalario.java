/*
10. Un obrero necesita calcular su salario semanal, el cual se obtiene de la sig. manera:
• Si trabaja 40 horas o menos se le paga $5000 por hora
• Si trabaja más de 40 horas se le paga $5000 por cada una de las primeras 40 horas y un
aumento del 20% por cada hora extra.
 */
/**
 *
 * @author JulianAndresGuzman
 */
package condicionalesejerciciostaller;

import java.util.Scanner;

public class ObreroSalario {

    public static void main(String args[]) {

        //variables
        Scanner in = new Scanner(System.in);
        int horasTrabajadas;
        int horasExtras;

        //Pregunta de horas trabajadas.
        System.out.println("Cuantas horas trabajó semanalmente?");
        horasTrabajadas = in.nextInt();

        if (horasTrabajadas <= 40) {
            System.out.println("Salario: " + (horasTrabajadas * 5000));
        } else {
            double salario = 40 * 5000; // Salario base por las primeras 40 horas
            horasExtras = horasTrabajadas - 40;
            salario += horasExtras * (5000 * 1.20); // 20% de aumento por cada hora extra
            System.out.println("Salario: " + salario);
        }
    }
}
