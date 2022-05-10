/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entornospgit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author Paco
 */
public class DesdeFichero {

    private static File f;

    DesdeFichero() {
        f = new File("Fichero.txt");
    }

    public void maximo() {
        //variables
        int max = 0, num = 0;

        //selecciono la ruta
        try {
            if (!f.exists()) {
                throw new FileNotFoundException();
            }

            Scanner rd = new Scanner(f);
            while (rd.hasNext()) {
                num = rd.nextInt();
                if (max < num) {
                    max = num;
                }

            }
            System.out.println("El mayor es " + max);
            rd.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: El fichero no existe");
        } catch (Exception e) {
            System.out.println(e);
        }
        

    }

    public void minimo() {
        //insertar codigo para mostrar mínimo ---------------
    }
}



