
package ejercicio5_lab;


public class Ejercicio5_Lab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //int arreglo[]= new int[5]; 

         
        int arreglo[]= {10,4,6}; 

        /*int irregular[][]= new int [3][]; 
        array[0] = new int[3]; 

        array[1] = new int[4]; 

        array[2] = new int[2];*/ 

       
        int irregular[][]= {{1,2,3},{4,5,6,7},{8,9}}; 
   
        Arreglo.sumarLista(arreglo); 
        System.out.println("El numero mayor es: "+Arreglo.buscarMayor(irregular)); 
        String palabra = "holx mundo" ; 
        System.out.println("cantidad de vocales en el arreglo: "+Arreglo.cuentaVocales(palabra)); 
        System.out.println("Cantidad de caracteres: "+Arreglo.cuentaCaracter(palabra, 'x')); 

   } 

} 