
package ejercicio5_lab;


public class Arreglo {
   public static void sumarLista(int arreglo[]) { 

        int suma = 0; 
        for (int i = 0; i < arreglo.length; i++) { 
        suma += arreglo[i]; 

        } 

        double promedio = suma / arreglo.length; 
        System.out.println("La suma es: " + suma); 
        System.out.println("El promedio es: " + promedio); 

    } 

 

    public static int buscarMayor(int array[][]) { 

        int mayor = array[0][0]; 
        for (int i = 0; i < array.length; i++) { 
            for (int j = 0; j < array[i].length; j++) { 

                if (array[i][j] > mayor) { 

                    mayor = array[i][j]; 

                } 
            } 

        } 
        return mayor; 

    } 

 
    public static int cuentaVocales(String palabra) { 
       int vocales =0; 

        if (palabra != null) { 
           
            for (int i = 0; i < palabra.length(); i++) { 
                if ((palabra.charAt(i)== 'a')|| (palabra.charAt(i)=='e') || (palabra.charAt(i)== 'i') || 
                   (palabra.charAt(i)== 'o') || (palabra.charAt(i)=='u')){ 
                    vocales++; 

                } 

            } 

             
        } 
        return vocales; 

    } 

 
    public static int cuentaCaracter(String str, char ch) { 
        int cont = 0; 

         for (int i = 0; i < str.length(); i++) { 
             if (str.charAt(i) == ch) { 
                cont++; 

            } 

        } 
        return cont; 

    } 

}   

