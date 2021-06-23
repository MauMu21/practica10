
package practica10;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class b {
        private int matriz[][];
    String vect[];
    public b(int matriz[][],String vect[])
    {
        this.matriz=matriz;
        this.vect=vect;
        Scanner cin=new Scanner(System.in);
        System.out.println("inserte el nodo de inicio");
        String nodo=cin.next();
        anchura(nodo);
    }
        private void anchura(String nodo)
    {
        Queue <String>pila = new <String>LinkedList();
        pila.add(nodo);
        String cad=" ";
        while(!pila.isEmpty())
        {
            String aux=pila.peek();
            int pos = poss(aux);
            boolean op=false;
            for(int i=0;i<cad.length();i++)
            {
                if(cad.charAt(i)==pila.peek().charAt(0))
                {
                    op=true;
                }
            }
            if(!op)
            {  
                cad+=pila.remove()+" ";
                for(int i=0;i<matriz.length;i++)
                {
                    if(matriz[pos][i]!=0)
                    {
                        pila.add(vect[i]);
                    }
                }
            }
            else
            {
                pila.remove();
            }
        }
        for(int i=0;i<cad.length();i++)
        {
            int cont=0;
            int pos=poss(cad.charAt(i)+"");
            for(int j=0;j<matriz.length;j++)
            {
                if(matriz[pos][j]!=0)
                {
                    cont++;
                }
            }
            if(cont>2)
            {
                System.out.print(cad.charAt(i));
            }
        }
        System.out.println();
    }
           int poss(String A)
   {
       int aux=0;
       for(int i=0;i<vect.length;i++)
       {
           if(A.toString().equals(vect[i].toString()))
           {
               aux=i;
           }
       }
       return aux;
   }
}
