package estructura_datos_2.ordenamiento;

public class QuickSort
{
    
    public int[] quickSortMethod(int[] datos, int primero, int ultimo)
    {
        
        int i, j, pivot, tem;
        
        i       = primero;
        j       = ultimo;
        pivot   = datos[(primero+ultimo)/2];
        
        do
        {
            
            while(datos[i] < pivot)
            {
                i++;
            }
            
            while(datos[j] > pivot)
            {
                j--;
            }
        
            if(i <= j)
            {
                tem = datos[i];
                datos[i] = datos[j];
                datos[j] = tem;
                
                i++;
                j--;
                
            }
            
        } while (i <= j);
        
        if(primero < j)
        {
            quickSortMethod(datos, primero, j);
        }
        
        if(i < ultimo)
        {
            quickSortMethod(datos, i, ultimo);
        }
        
        return datos;
        
    }
    
}
