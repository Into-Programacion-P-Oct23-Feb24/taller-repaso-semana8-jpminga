/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int n;
        int contador = 1;
        System.out.println("Ingrese un numero par y positivo");
        n = entrada.nextInt();
        while (contador <= n) {
            if (n % 2 == 0) {
                System.out.printf("%s\n", contador);
            } else {
                System.out.println("numero Ingresado no permitido");
            }
            contador = contador + 1;
        }

    }

}
