/*
7. Una institución educativa estableció un programa para estimular a los alumnos con buen
rendimiento académico y que consiste en lo siguiente:
▪ Si el promedio es de 9.5 o más y el alumno es de tecnología, entonces este podrá cursar
55 créditos y se le hará un 25% de descuento.
▪ Si el promedio es mayor o igual a 9 pero menor que 9.5 y el alumno es de tecnología,
entonces este podrá cursar 50 créditos y se le hará un 10% de descuento.
▪ Si el promedio es mayor que 7 y menor que 9 y el alumno es de tecnología, este podrá
cursar 50 créditos y no tendrá ningún descuento.
▪ Si el promedio es de 7 o menor, el número de materias reprobadas es de 0 a 3 y el
alumno es de tecnología, entonces podrá cursar 45 créditos y no tendrá descuento.
▪ Si el promedio es de 7 o menor, el número de materias reprobadas es de 4 o más y el
alumno es de tecnología, entonces podrá cursar 40 créditos y no tendrá ningún
descuento.


▪ Si el promedio es mayor o igual a 9.5 y el alumno es de profesional, entonces podrá
cursar 55 créditos y se le hará un 20% de descuento.
▪ Si el promedio es menor de 9.5 y el alumno es de profesional, entonces podrá cursar 55
créditos y no tendrá descuento.
Obtener el total que tendrá que pagar un alumno si el valor de la matrícula para alumnos de
profesional es de $30.000 por cada cinco créditos y para alumnos de tecnología es de $18.000
por cada cinco créditos.
 */
package condicionalesejerciciostaller;

/**
 *
 * @author JulianAndresGuzman
 */
import java.util.Scanner;

public class RendimientoAcademico {

    public static void main(String args[]) {

        //variables:
        Scanner in = new Scanner(System.in);
        String tecnologia = "tecnologia";
        String profesional = "profesional";

        //Solicitar el tipo de alumno
        System.out.println("Cual es tu tipo de alumno? (usa minusculas)");
        System.out.println("*tecnologia   *profesional");
        String tipoAlumno = in.nextLine();

        //verificar el tipo de alumno 
        if (tipoAlumno.equals(tecnologia)) { //SI EL ALUMNO ES DE TECNOLOGIA
            System.out.println("Es tecnologo");
            System.out.println("Escribe el promedio del alumno: usa la coma como separador decimal: ejemplo 3,3");
            double promedio = in.nextDouble();

            //Tratamiento según el promedio de estudiante de la tecnología
            if (promedio >= 9.5) { //Si el promedio es de 9.5 o más
                System.out.println("Tiene un buen promedio, puede cursar hasta 55 creditos con un descuento del 25%");
                System.out.println("Escribe los números de créditos que desea cursar: ");
                int creditos = in.nextInt();

                //Calcular el valor total con el descuento
                if (creditos <= 55) {
                    System.out.println("El valor total de la matricula es: " + (((18000 * (creditos / 5))) - (18000 * (creditos / 5)) * 0.25));
                } else {
                    System.out.println("No puedes registar más creditos de lo estimado");
                }

                // Si el promedio está entre 9 y 9.5
            } else if (promedio >= 9 && promedio < 9.5) {
                System.out.println("Tiene un buen promedio, puede cursar hasta 50 creditos con un descuento del 10%");
                System.out.println("Escribe los números de créditos que desea cursar: ");
                int creditos = in.nextInt();

                //Calcular el valor total con el descuento
                if (creditos <= 50) {
                    System.out.println("El valor total de la matricula es: " + (((18000 * (creditos / 5))) - (18000 * (creditos / 5)) * 0.1));
                } else {
                    System.out.println("No puedes registar más creditos de lo estimado");
                }

                //Si el promedio es mayor que 7 pero menor que 9
            } else if (promedio >= 7 && promedio < 9) {
                System.out.println("puede cursar hasta 50 creditos");
                System.out.println("Escribe los números de créditos que desea cursar: ");
                int creditos = in.nextInt();

                //calcular el valor total con descuento
                if (creditos <= 50) {
                    System.out.println("El valor total de la matricula es: " + (((18000 * (creditos / 5)))));
                } else {
                    System.out.println("No puedes registar más creditos de lo estimado");
                }

                //Si el promedio es menor que 7
            } else if (promedio < 7) {
                System.out.println("Cuantas materias perdió?");
                int materiasPerdidas = in.nextInt();
                if (materiasPerdidas <= 3) {
                    System.out.println("puede cursar hasta 45 creditos");
                    System.out.println("Escribe los números de créditos que desea cursar: ");
                    int creditos = in.nextInt();

                    //Calcular el valor total de la matricula sin promoción
                    if (creditos <= 45) {
                        System.out.println("El valor total de la matricula es: " + (((18000 * (creditos / 5)))));
                    } else {
                        System.out.println("No puedes registar más creditos de lo estimado");

                    }
                    //Si perdió más de 3 materias
                } else if (materiasPerdidas > 3) {
                    System.out.println("puede cursar hasta 40 creditos");
                    System.out.println("Escribe los números de créditos que desea cursar: ");
                    int creditos = in.nextInt();

                    //Valor total del costo de matricula si perdió más de 3 materias
                    if (creditos <= 40) {
                        System.out.println("El valor total de la matricula es: " + (((18000 * (creditos / 5)))));
                    } else {
                        System.out.println("No puedes registar más creditos de lo estimado");
                    }
                }
            }

            //SI EL ALUMNO ES PROFESIONAL
        } else if (tipoAlumno.equals(profesional)) {
            System.out.println("Eres profesional");
            System.out.println("Escribe el promedio del alumno: usa la coma como separador decimal: ejemplo 3,3)");
            double promedio = in.nextDouble();

            //Si el promedio es 9.5 o más
            if (promedio >= 9.5) {
                System.out.println("Tiene un buen promedio, puede cursar hasta 55 creditos con un descuento del 20%");
                System.out.println("Escribe los números de créditos que desea cursar: ");

                //Calculando el valor total de la matricula con promoción
                int creditos = in.nextInt();
                if (creditos <= 55) {
                    System.out.println("El valor total de la matricula es: " + (((30000 * (creditos / 5))) - (30000 * (creditos / 5)) * 0.2));
                } else {
                    System.out.println("No puedes registar más creditos de lo estimado");
                }

                //Calculando el valor total de la matricula sin promoción
            } else if (promedio < 9.5) {
                System.out.println("Tiene un buen promedio, puede cursar hasta 50 creditos");
                System.out.println("Escribe los números de créditos que desea cursar: ");
                int creditos = in.nextInt();
                if (creditos <= 50) {

                    System.out.println("El valor total de la matricula es: " + (((30000 * (creditos / 5)))));
                } else {
                    System.out.println("No puedes registar más creditos de lo estimado");
                }
            }
            
            //En caso de escribir mal a los usuarios
        } else {
            System.out.println("Asegurate de haber elegido una de las opciones, asegurate de respetar minusculas y mayusculas");
        }
    }
}
