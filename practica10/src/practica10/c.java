
package practica10;


import java.util.*;
public class c {
            private int matriz[][];
    String vect[];
    public c(int matriz[][],String vect[])
    {
        this.matriz=matriz;
        this.vect=vect;
        masEnlaces();
    }
    private void masEnlaces()
    {
        Stack <Integer>pila=new <Integer>Stack();
        Stack <String>pila2=new <String>Stack();
        
        for(int i=0;i<matriz.length;i++)
        {
            int cont=0;
            for(int j=0;j<matriz.length;j++)
            {
                if(matriz[i][j]!=0)
                {
                    cont++;
                }
            }
            pila.push(cont);
            pila2.push(vect[i]);
        }
        int aux=pila.pop();
        String cad = pila2.pop();
        while(!pila.empty())
        {
            if(pila.peek()>aux)
            {
                aux=pila.pop();
                cad=pila2.pop();
            }
            else
            {
                pila.pop();
                pila2.pop();
            }
        }
        System.out.println(cad);
    }
}
