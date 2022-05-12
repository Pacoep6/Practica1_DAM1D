/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entornospgit;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class ConsolaNumeros {

    private int max = 0;
    private int min = 0;

    /**
     *
     * @param sc Scanner donde se introducen los numeros
     */
    public void introducirNumeros(Scanner sc) {
        int max = 0;
        int min = 0;
        int num = 0;
        int i = 0;
        boolean error = false;
        while (!error) {
            try {
                System.out.println("Introduce un numero o 0 para salir:");

                num = sc.nextInt();
                if (i == 0) {
                    max = num;
                    min = num;
                }
                if (max < num) {
                    max = num;
                }
                if (min > num) {
                    min = num;
                }
                if (num == 0) {
                    break;
                }
                i++;
            } catch (Exception es) {
                System.out.println("Saliendo...");
            }
        }
    }

    /**
     *
     * @return El numero maximo
     */
    public int getMax() {
        return max;
    }

    /**
     *
     * @return El numero minimo
     */
    public int getMin() {
        return min;
    }

}
