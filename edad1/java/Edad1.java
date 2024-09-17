//Nicol Chuma//
package edad1.java;
import java.util.Scanner;
public class Edad1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println(    "El año actual es: ");
        int aa= entrada.nextInt ();
        System.out.println(    "El mes actual es: ");
        int ma= entrada.nextInt ();
        System.out.println(    "El día actual es: ");
        int da= entrada.nextInt ();
        
        System.out.println(    "El año que nacio es: ");
        int an= entrada.nextInt ();
        System.out.println(    "El mes que nacio es: ");
        int mn= entrada.nextInt ();
        System.out.println(    "El día que nacio es: ");
        int dn= entrada.nextInt ();
        
        //calcula edad
        int d=0;
        if (da>= dn) {    
            d=da-dn;}
        else{
            d=da+30-dn;
            ma=ma-1;
        }
        int m=0;
        if (ma>mn){
            m =ma-mn;
        }
        else{
           m =ma+12-mn;
            aa=aa-1;
        }
        int a = 0;
        if (aa>an){
           a=aa-an;
        }
        System.out.println("Tiene  "+ a + "  años:" );
        System.out.println("Tiene  "+ m + "  mese:" );
        System.out.println("Tiene  "+ d +"  dias:" );
    }
   
    
}
