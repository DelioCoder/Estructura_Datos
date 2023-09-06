package estructura_datos_2.ordenamiento;

public class Burbuja 
{
    public int[] burbujaSort(int[] datos)
    {
        int aux = 0;
        
        for (int i = 0; i < datos.length - 1; i++) {
            
            for (int j = 0; j < datos.length - 1; j++) {
                
                if(datos[j] > datos[j+1])
                {
                    aux = datos[j];
                    datos[j] = datos[j+1];
                    datos[j+1] = aux;
                }
                
            }
            
        }
        
        return datos;
    }
}
