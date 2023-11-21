/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biggerof3;

import java.util.Scanner;

/**
 *
 * @author Jacka97
 */
public class BiggerOf3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int big;
        

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a number");
        int variable_1 = scanner.nextInt();

        System.out.println("Write a second number");
        int variable_2 = scanner.nextInt();

        System.out.println("Write the thrid number");
        int variable_3 = scanner.nextInt();

        if (variable_1 > variable_2 && variable_1 >= variable_3) { // Cambiamos las condiciones para demostrar que variable_1 es mayor que las otras dos

            big = variable_1;
            System.out.println("The biggest number is: " + big);
        }

        if (variable_2 > variable_1 && variable_2 >= variable_3) { // Cambiamos las condiciones para demostrar que variable_2 es mayor que las otras dos

            big = variable_2;
            System.out.println("The biggest number is:" + big);

        }

        if (variable_3 > variable_1 && variable_3 >= variable_2) { // Cambiamos las condiciones para demostrar que variable_3 es mayor que las otras dos

            big = variable_3;
            System.out.println("The biggest number is:" + big);

        }
        if(variable_1 == variable_2 && variable_1 == variable_3){ // Añadimos una condicion mas, en el caso de que los 3 sean iguales
            big = variable_1;
            System.out.println("The biggest number is: " + big);
        }
    }
    
}
