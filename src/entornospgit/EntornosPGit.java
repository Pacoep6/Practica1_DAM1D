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
        //hola jaja
        int selec = 0;
        Scanner sc = new Scanner(System.in);
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
                System.out.println("Introduzca los 5 números");
                int num1=sc.nextInt();
                int num2=sc.nextInt();
                int num3=sc.nextInt();
                int num4=sc.nextInt();
                int num5=sc.nextInt();
                System.out.println("Introduce 1 si quieres ver el máximo, 2 si quieres ver el minimo");
                int elecc=sc.nextInt();
                if (elecc==1) {
                    NumerosConsola maximo = new NumerosConsola();
                    System.out.println(maximo.Max(num1, num2, num3, num4, num5));
                } else if (elecc==2){
                    NumerosConsola minimo = new NumerosConsola();
                    System.out.println(  minimo.Min(num1, num2, num3, num4, num5));
                       
                 
                }
               
                
                break;
            default:
                System.out.println("Saliendo...");
        }

    }

}
