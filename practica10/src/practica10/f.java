
package aux_21_06_2021_tarea10;

import java.util.Scanner;

public class f {
                  private int matriz[][];
    String vect[];
    public f(int matriz[][],String vect[])
    {
        Scanner cin =new Scanner(System.in);
        this.matriz=matriz;
        this.vect=vect;
        System.out.println("inserte un nodo origen");
        String origen=cin.next();
        
        dirigido();
    }
    private void dirigido()
    {
        
    }
}
