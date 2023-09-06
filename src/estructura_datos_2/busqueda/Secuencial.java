package estructura_datos_2.busqueda;

public class Secuencial
{
    public void search(int[] datos, int x)
    {
        
        boolean founded = false;
        int i = 0;
        int pos = 0;
        
        while(!founded && i < datos.length && x <= datos[datos.length - 1] && x >= datos[i])
        {
            if(datos[i] == x)
            {
                founded = true;
                
                pos = i;
            }       
            
            i++;
        }
        
        if(founded)
        {
            System.out.println("Elemento encontrado: " + datos[pos] + " y esta ubicado en la posición: " + pos);
        }else {
            System.out.println("Elemento no encontrado.");
        }
        
    }
}
