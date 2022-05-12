/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entornospgit;

import java.util.Scanner;

/**
 * El programa mostrará los máximos y mínimos
 *
 * @author Ronaldinho
 */
//Comentario ejercicio 4
public class EntornosPGit {
    static int[] ArrNum = new int[7];
    
    
    public static void meterNumeros(){
        Scanner reader = new Scanner(System.in);
        for (int i = 0; i < ArrNum.length; i++) {
            System.out.println("Mete un numero");
            ArrNum[i]=reader.nextInt();
        }
    }
        
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

               // fich.minimo();

                break;

            case 2:
                DesdeFichero df = new DesdeFichero();
                meterNumeros();
                df.minimo(ArrNum);
                break;
            default:
                System.out.println("Saliendo...");
        }

    }

}
