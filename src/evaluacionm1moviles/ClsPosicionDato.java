/*
 */
package evaluacionm1moviles;
import java.util.Scanner;

public class ClsPosicionDato 
{
    Scanner thule = new Scanner(System.in);
    int i;
    public int[] vectorNumeros(int n)
    {
        int[] numeros = new int[n];
        for(i=0; i<n; i++)
        {
            System.out.println("Digite elemento " + i + " ");
            numeros[i] = thule.nextInt();
        }
        return numeros;
    }
    
    public int busquedaDato(int dato, int numeros[], int n)
    {
        
        int posicionDato= -1;
        for(i=0;i<n;i++)
        {
            if(numeros[i] == dato)
            {
                 posicionDato = i;
            }
        }
        return posicionDato;
    }
}





