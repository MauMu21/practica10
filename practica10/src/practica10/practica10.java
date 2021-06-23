
package practica10;

import java.util.*;
public class Aux_21_06_2021_tarea10 {

    public static void main(String[] args) {
       Scanner cin = new Scanner(System.in);
        //System.out.println("ingrese la cantidad de nodos");
        //int n = cin.nextInt();
        //insertar b = new insertar(n);
        insertar2 b = new insertar2(8);
       b.insertar("0", 2, "1");
        b.insertar("0", 1, "2");
        b.insertar("0", 3, "3");
        b.insertar("1", 3, "4");
        b.insertar("2", 4, "4");
        b.insertar("2", 3, "5");
        b.insertar("3", 4, "5");
        b.insertar("5",1,"4");
        b.insertar("4", 4, "6");
        b.insertar("6", 2, "7");

       /*b.insertar("0", 1, "1");
       b.insertar("0", 1, "2");
       b.insertar("1", 1, "2");
       b.insertar("1", 1, "3");
       b.insertar("2", 1, "3");
       b.insertar("3", 1, "4");
*/
        b.mostrar();
    }
    
    
}
