<<<<<<< HEAD:EntornosPGit/src/entornospgit/DesdeFichero.java
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
            if (rd.hasNext()) {
                max = rd.nextInt();
            }
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
        //variables
        int min = 0, num = 0;

        //selecciono la ruta
        try {
            if (!f.exists()) {
                throw new FileNotFoundException();
            }

            Scanner rd = new Scanner(f);
            if (rd.hasNext()) {
                min = rd.nextInt();
            }
            while (rd.hasNext()) {
                num = rd.nextInt();
                if (min > num) {
                    while (rd.hasNext()) {
                        num = rd.nextInt();
                        if (min < num) {
                            min = num;
                        }

                    }
                }
            }

            System.out.println("El menor es " + min);
            rd.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: El fichero no existe");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
=======
<<<<<<< HEAD:src/entornospgit/DesdeFichero.java
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



=======
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
        //Comentario

    }

    public void minimo() {
        //insertar codigo para mostrar mínimo ---------------
        //variables
        int min = 0, num = 0;

        //selecciono la ruta
        try {
            if (!f.exists()) {
                throw new FileNotFoundException();
            }

            Scanner rd = new Scanner(f);
            while (rd.hasNext()) {
                num = rd.nextInt();
                if (min < num) {
                    min = num;
                }

            }
            System.out.println("El menor es " + min);
            rd.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: El fichero no existe");
        } catch (Exception e) {
            System.out.println(e);
        }
        

    }
    }




>>>>>>> 0b0629018956af4acd473a4f81501361410eb91e:EntornosPGit/src/entornospgit/DesdeFichero.java
>>>>>>> f766dd28f63a72969baca35ed1f0fc68152ca6e3:src/entornospgit/DesdeFichero.java
