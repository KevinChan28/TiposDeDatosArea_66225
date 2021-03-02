
package tiposdedatosarea.pkg66225;
import java.util.*;
/**
 *
 * @author USER
 */
public class TiposDeDatosArea66225 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    int ladoA, ladoB, resultado;
        System.out.println("Ingrese el valor del lado A ");
        ladoA=teclado.nextInt();
        System.out.println("Ingrese el valor del lado B ");
        ladoB=teclado.nextInt();
        
        resultado= ladoA*ladoB;
        System.out.println("El area es: "+resultado);
    
}
}