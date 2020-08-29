/*
Definición de estructuras de dato tipo arrays
 */
package clase4arrays;

import java.util.Scanner;

public class Clase4Arrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Declaración de un Array (Unidimensional) que guardará Strings
        // Tipo de dato (String) + nombre variable = creación de objeto + tipo variable + tamaño
        String[] versionesWindows = new String[13];

        // Guardar datos en el array:
        /*
        versionesWindows[0] = "Windows 1";
        versionesWindows[1] = "Windows 2";
        versionesWindows[2] = "Windows 3";
        versionesWindows[3] = "Windows 95";
        versionesWindows[4] = "Windows 98";
        versionesWindows[5] = "Windows 2000";
        versionesWindows[6] = "Windows ME";
        versionesWindows[7] = "Windows XP";
        versionesWindows[8] = "Windows Vista";
        versionesWindows[9] = "Windows 7";
        versionesWindows[10] = "Win 8";
        versionesWindows[11] = "Win 8.1";
        versionesWindows[12] = "Win 10";
         */
        // pedir al usuario que ingrese los datos:
        
        for (int i = 0; i < versionesWindows.length; i++) {
            
            System.out.println("Ingrese version win: ");
            versionesWindows[i] = sc.nextLine();

        }
        
        
        // System.out.println("El dato guardado: " + versionesWindows[0]);
        // Mostrar todos datos:

        for (int j = 0; j < versionesWindows.length; j++) {
            System.out.println(versionesWindows[j]);
        }

        /*
        //arrays multidimensionales array [f][c]
        String[][]paises = new String[2][2];
        
        // Guardar datos en el array [f][c]
        paises[0][0] = "Colombia";
        paises[0][1] = "Bogota";
        paises[1][0] = "Peru";
        paises[1][1] = "Lima";
        
        // mostrar los datos:
        // System.out.println("Dato en Fila 0, Col 0: " + paises[0][0]);
        // System.out.println("Dato en Fila 0, Col 1: " + paises[0][1]);
        
        // opción para mostrar todos los datos del arreglo:
        for (int i = 0; i < paises.length; i++){
            for (int j = 0; j < paises.length; j++){
                System.out.println(paises[i][j]);
            }
        }
        

         */
    }

}
