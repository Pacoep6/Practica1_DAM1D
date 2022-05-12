/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entornospgit;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Numeros {

    
    private int min = 0;
    private int max=0;
    Scanner reader = new Scanner(System.in);
    public Numeros(){
        int numero;
        System.out.println("Dime 5 numeros");
        for (int bucle1 = 0; bucle1 < 5; bucle1++) {
            numero = reader.nextInt();
            if (numero > max) {
                max = numero;
            }else if (numero < min ) {
                min = numero;
            }
        }     
        
    }
    
    public void maximo(){
        System.out.println("El maximo es " + max);
    }
    public void minimo(){
        System.out.println("El minimo es " + min);
    }
    
    
}
