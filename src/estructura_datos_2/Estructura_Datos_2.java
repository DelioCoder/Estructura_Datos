package estructura_datos_2;

//import estructura_datos_2.ordenamiento.Burbuja;
import estructura_datos_2.ordenamiento.QuickSort;
import estructura_datos_2.busqueda.Secuencial;

public class Estructura_Datos_2 {

    // Metodos directos
    
    public static void main(String[] args)
    {
        
        int datos[] = {45, 32, 37, 25, 29, 8, 2, 19, 25};
        
        QuickSort quick = new QuickSort();
        
        Secuencial bus = new Secuencial();
        
        // Burbuja burj = new Burbuja();
        
        int datosOr[] = quick.quickSortMethod(datos, 0, datos.length - 1);
        
        // int datosOr[] = burj.burbujaSort(datos);
        
        for (int i = 0; i < datosOr.length; i++)
        {
            System.out.println(datosOr[i]);
        }
        
        bus.search(datos, 19);
        
    }
    
}
