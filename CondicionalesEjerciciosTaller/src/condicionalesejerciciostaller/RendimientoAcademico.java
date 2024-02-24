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
        

        //Código:
        System.out.println("Cual es tu tipo de alumno? (usa minusculas)");
        System.out.println("*tecnologia   *profesional");
        String tipoAlumno = in.nextLine();
        

        //Valor de precio de la tecnología 18.000 por cada 5 créditos 
        if (tipoAlumno.equals(tecnologia)) {
            System.out.println("Es tecnologo");
            System.out.println("Escribe el promedio del alumno: usa la coma como separador decimal: ejemplo 3,3");
            double promedio = in.nextDouble();
            
            if (promedio >= 9.5){
                System.out.println("Tiene un buen promedio, puede cursar hasta 55 creditos con un descuento del 50%");
                System.out.println("Escribe los números de créditos que desea cursar: ");
                int creditos = in.nextInt();
                System.out.println("El valor total de la matricula es: " + (((18000 * (creditos/5))) - (18000 * (creditos/5)) * 0.5));
            }
            
        } else if (tipoAlumno.equals(profesional)){
        System.out.println("Eres profesional");
        System.out.println("Escribe el promedio del alumno: ");
        } else {
        System.out.println("Asegurate de haber elegido una de las opciones, asegurate de respetar minusculas y mayusculas");}

    }
}
