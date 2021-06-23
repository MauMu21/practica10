
package aux_21_06_2021_tarea10;
import java.util.*;
public class insertar {
   private Object nodos[];
   private int matriz[][];
   private int cant=0;
   private int pos=0;
   private int analizar=0;
   private Scanner cin = new Scanner(System.in);
   public insertar(int cant)
   {
       this.cant=cant;
       matriz=new int[cant][cant];
       nodos=new Object[cant];
       System.out.println("ingrese el nodo");
       Object A = cin.next();
       nodos[pos]=A;
       pos++;
       inserta(A);
       mostrar();
   }
   void inserta(Object A)
   {
       System.out.println("existe un nodo del nodo "+A+" S/N");
       String res=cin.next();
       if(res.toUpperCase().equals("S"))
       {
           System.out.println("Iserte el nodo");
           Object B=cin.next();
           System.out.println("inserte el peso");
           int peso = cin.nextInt();
           if(!existeNodo(B))
           {
               nodos[pos]=B;
               pos++;
           }
           int a=poss(A);
           int b=poss(B);
           matriz[b][a]=peso;
           inserta(A);
       }
       analizar++;
       if(analizar<cant)
       {
           analizar(analizar+1);
       }
   }
   boolean existeNodo(Object A)
   {
       Object aux="";
       for(int i=0;i<cant;i++)
       {
          if(A.equals(nodos[i]))
          {
              aux=A;
          }
       }
       return aux==A;
   }
   int poss(Object A)
   {
       int aux=0;
       for(int i=0;i<cant;i++)
       {
           if(A.equals(nodos[i]))
           {
               aux=i;
           }
       }
       return aux;
   }
   void mostrar(){
       for(int i=0;i<cant;i++)
       {
           for(int j=0;j<cant;j++)
           {
               System.out.print("["+matriz[i][j]+"]");
           }
           System.out.println();
       }
   }
   void analizar(int pos)
   {
       inserta(nodos[pos-1]);
   }
}
