/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entornospgit;

import java.util.Scanner;

/**
 * El programa mostrará los máximos y mínimos
 *
 * @author PACO
 */
public class EntornosPGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int selec = 0;
        Scanner sc = new Scanner(System.in);
        int num, numMax = 0, numMin = 0;
        //instrucciones
        System.out.println("Bienvenido al mostrador de máximos y mínimos");
        System.out.println("¿Desde dónde quiere trabajar? \n 1) Fichero \n 2) Consola \n Otro: salir)");
        System.out.println("Si eliges 1, Recuerda introducir Fichero.txt con los números, a ser posible uno en cada línea");

        //menú ojo
        switch (sc.nextInt()) {
            case 1:
                DesdeFichero fich = new DesdeFichero();
                fich.maximo();
                fich.minimo();

                break;

            case 2:
                //HACER CLASE QUE PERMITA METER NUMS DESDE CONSOLA!!!-----------------
                //y codificar aquí la llamada a método máximo y mínimo----------------

                System.out.println("Añade 5 numeros.");
                
                num=sc.nextInt();
                numMax=num;
                numMin=num;
               
                for (int i = 0; i < 4; i++) {
                    
                    num = sc.nextInt();
                    if (num > numMax) {
                        numMax = num;
                    } else if (num < numMin) {
                        numMin = num;
                    }
                
                }
                System.out.println("El mayor numero es: "+numMax);
                System.out.println("El menor numero es: "+numMin);

                break;
            default:
                System.out.println("Saliendo...");
        }

    }

}
