
package practica10;
import java.util.*;
public class e {
              private int matriz[][];
    String vect[];
    public e(int matriz[][],String vect[])
    {
        Scanner cin =new Scanner(System.in);
        this.matriz=matriz;
        this.vect=vect;
        System.out.println("inserte un nodo");
        String cad=cin.next();
        Enlaces(cad);
    }
    private void Enlaces(String nodo)
    {
        Stack <String>pila=new <String>Stack();
        int pos=pos(nodo);
        String cad=nodo;
        String cad2=" ";
        for(int i=0;i<matriz.length;i++)
        {
            if(matriz[pos][i]!=0)
            {
                pila.push(vect[i]);
                cad+=vect[i];
            }
        }
        while(!pila.empty())
        {
            pos=pos(pila.peek());
            for(int i=0;i<matriz.length;i++)
            {
                if(matriz[pos][i]!=0)
                {
                    boolean op=false;
                    for(int j=0;j<cad.length();j++)
                    {
                        if(cad.charAt(j)==vect[i].charAt(0))
                        {
                            op=true;
                        }
                    }
                    if(!op)
                    {
                        boolean op2=false;
                        for(int k=0;k<cad2.length();k++)
                        {
                            if(cad2.charAt(k)==vect[i].charAt(0))
                            {
                                op2=true;
                            }
                        }
                        if(!op2)
                        {
                            cad2+=vect[i];
                        }
                    }
                }
            }
            pila.pop();
        }
        System.out.println(cad2);
        
    }
    
    int pos(String A)
   {
       int aux=0;
       for(int i=0;i<vect.length;i++)
       {
           if(A.equals(vect[i]))
           {
               aux=i;
           }
       }
       return aux;
   }

}
