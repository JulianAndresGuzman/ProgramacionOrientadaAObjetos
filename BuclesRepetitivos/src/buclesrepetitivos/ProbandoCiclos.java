/*
Esto es para probar diferentes ciclos 
*/
package buclesrepetitivos;
import java.util.Scanner;
/**
 *
 * @author JulianAndresGuzmanCuellar
 */
public class ProbandoCiclos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Escribe un número para que sea escrito desde él hasta 0");
        int i = in.nextInt();
        while(i >= 0){
            System.out.println(" i =" + i);
            i = i-1;
        }
     
        System.out.println("Escribe un número para que sea escrito desde él hasta 0");
        int b = in.nextInt();

        for (b = i; b >= 0; b++){
            System.out.println(" b =" + b);
            b = b-1;

        }
        
        
    }
}
