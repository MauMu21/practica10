
package practica10;

public class d {
               private int matriz[][];
    String vect[];
    public d(int matriz[][],String vect[])
    {
        this.matriz=matriz;
        this.vect=vect;
        Enlaces();
    }
    private void Enlaces()
    {
        int cont=0;
        for(int i=0;i<matriz.length;i++)
        {
            for(int j=0;j<matriz.length;j++)
            {
                if(matriz[i][j]==4)
                {
                    cont++;
                }
            }
        }
        System.out.println(cont/2);
    } 
}
