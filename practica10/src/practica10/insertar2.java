
package aux_21_06_2021_tarea10;

public class insertar2 {
  private int matriz[][];
  private String vect[];
  private int lon;
  private int pos=0;
 public insertar2(int lon)
 {
     this.lon=lon;
     matriz=new int[lon][lon];
     vect=new String[lon];
 }
 public void insertar(String A,int peso,String B)
 {
     if(!existeNodo(A))
     {
         vect[pos]=A;
         pos++;
     }
     if(!existeNodo(B))
     {
         vect[pos]=B;
         pos++;
     }
     int a=pos(A);
     int b=pos(B);
      matriz[a][b]=peso;
      matriz[b][a]=peso;
 }
    int pos(String A)
   {
       int aux=0;
       for(int i=0;i<lon;i++)
       {
           if(A.equals(vect[i]))
           {
               aux=i;
           }
       }
       return aux;
   }
       boolean existeNodo(String A)
   {
       Object aux="";
       for(int i=0;i<lon;i++)
       {
          if(A.equals(vect[i]))
          {
              aux=A;
          }
       }
       return aux==A;
   }
       public void mostrar()
       {
           for(int i=0;i<lon;i++)
           {
               for(int j=0;j<lon;j++)
               {
                   System.out.print("["+matriz[i][j]+"]");
               }
               System.out.println();
           }
           for(int i=0;i<lon;i++)
           {
               System.out.print("{"+vect[i]+"}");
           }
           System.out.println("A");
           a a=new a(matriz,vect);
           System.out.println("B");
           b b=new b(matriz,vect);
           System.out.println("C");
           c c =new c(matriz,vect);
           System.out.println("D");
           d d = new d(matriz,vect);
           System.out.println("E");
           e e=new e(matriz,vect);
           System.out.println("F");
           f f=new f(matriz,vect);
       }
}
