package entornospgit;

import java.util.Scanner;

/**
 *
 * @author Gonzalo López Fernández
 */
public class DesdeConsola {

    private int min, max;

    public DesdeConsola() {
        String mensaje = "Dime un número. Introduce cualquier palabra para salir.";
        String aux;
        Scanner teclado = new Scanner(System.in);
        boolean seguir;
        int numero;
        System.out.println(mensaje);
        aux = teclado.nextLine();
        seguir = comprobarQueEsNumero(aux);
        min = Integer.parseInt(aux);
        max = Integer.parseInt(aux);
        while (seguir) {
            numero = Integer.parseInt(aux);
            if (min > numero) {
                min = numero;
            } else if (max < numero) {
                max = numero;
            }
            System.out.println(mensaje);
            aux = teclado.nextLine();
            seguir = comprobarQueEsNumero(aux);
        }
    }

    /**
     * Comprueba si un string puede ser un número entero.
     *
     * @param numero
     * @return true si es entero, false en otro caso.
     */
    private boolean comprobarQueEsNumero(String numero) {
        try {
            int num = Integer.parseInt(numero);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Muestra el máximo
     */
    public void maximo() {
        System.out.println("El máximo es " + max + ".");
    }

    /**
     * Muestra el mínimo
     */
    public void minimo() {
        System.out.println("El mínimo es " + min + ".");
    }

}
