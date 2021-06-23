
package aux_21_06_2021_tarea10;
import java.util.Stack;
import java.util.*;
public class a {
    private int matriz[][];
    String vect[];
    public a(int matriz[][],String vect[])
    {
        this.matriz=matriz;
        this.vect=vect;
        Scanner cin=new Scanner(System.in);
        System.out.println("inserte el nodo de inicio");
        String nodo=cin.next();
        profundidad(nodo);
        //anchura(nodo);
    }
   /* private void anchura(String nodo)
    {
        Stack <String>pila = new <String>Stack();
        pila.push(nodo);
        String cad="";
        while(!pila.empty())
        {
            String aux=pila.pop();
            int pos = poss(aux);
            cad+=aux+" ";
                for(int i=0;i<matriz.length;i++)
                {
                    if(matriz[pos][i]!=0)
                    {
                        pila.push(vect[i]);
                    }
                }
                if(pos==vect.length-1)
                {
                    while(!pila.empty())
                    {
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
                            cad+=pila.pop()+" ";
                        }
                        else
                        {
                            pila.pop();
                        }
                    }
                }
        }
        System.out.print("solucion 1-->");
        System.out.println(cad);
    }
*/
        private void profundidad(String nodo)
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
        System.out.print("solucion 2--->");
        System.out.println(cad);
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
