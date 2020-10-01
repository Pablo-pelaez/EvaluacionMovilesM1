/*
 Crear un método que lea un vector de números enteros de tamaño N y luego otro método que reciba como parámetros de entrada el vector, 
su tamaño y un dato, y devuelva la posición donde se encuentra dicho dato, suponga que el dato si está y solo una vez

tipo_dato nombre_array[];
nombre_array = new tipo_dato[tamanio];
 */
package evaluacionm1moviles;
import java.util.Scanner;

public class EvaluacionM1Moviles 
{

    
    public static void main(String[] args) 
    {
        Scanner thule = new Scanner(System.in);
        ClsPosicionDato posicionD = new ClsPosicionDato();
        
        int numeros[], n, datoB, dato;
        
        System.out.println("Ingrese el tamaño del arreglo:");
        n = thule.nextInt();
        System.out.println("Ingrese el dato buscado:");
        dato = thule.nextInt();
        
        numeros = posicionD.vectorNumeros(n);
        datoB = posicionD.busquedaDato(dato, numeros, n);
        
        if(datoB >= 0)
        {
            System.out.println("La posición del dato buscado es: " + datoB);
        }
        else
        {
            System.out.println("El número que buscas no se encuentra");
        }
    }
    
}
