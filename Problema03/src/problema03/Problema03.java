/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int n;
        int m;
        int suma = 0;
        System.out.println("ingrese el numero a multiplicar");
        n = entrada.nextInt();
        System.out.println("ingrese el numero multiplicador");
        m = entrada.nextInt();
        while (m >= 1) {
            if (m % 2 == 1) {
                suma = n + suma;
            }
            n = n * 2;
            m = m / 2;
        }
        System.out.printf("El resultado es %s\n", suma);
    }

}
