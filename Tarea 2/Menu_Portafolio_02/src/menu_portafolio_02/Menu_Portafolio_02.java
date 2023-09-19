/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menu_portafolio_02;

/**
 *
 * @author XPC
 */

import javax.swing.JOptionPane;
import java.util.Scanner;
public class Menu_Portafolio_02 {
    
 
    /**
     * @param args the command line arguments
     */
    /*Estudiante: Jaen Carlo Gonzalez Arauz
    Fecha: 02/09/2023*/
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = new int[6][5];
        
     
        int Continuar = 0;
        
        do {            
            
            System.out.println("\n 1 - Número Factorial. \n" +
                               " 2 - Los 10 primeros números Primos.\n" +
                               " 3 – Crear una matriz de números al azar.\n" +
                               " 4 – Obtener el número mayor de la matriz.\n" +
                               " 5 - Salir\n");
            String OpcContinuar = JOptionPane.showInputDialog("Ingrese el numero!!\n");
               Continuar = Integer.parseInt(OpcContinuar);
               
                switch (Continuar) {
                    case 1:
                        obtenerNumFactorial();
                        break;
                    case 2:
                        obtenerNumPrimos();
                         break;
                     case 3:
                        obtenerMatrizNumAzar(matriz);
                        break;
                     case 4:
                        obtenerNumMayorMatriz(matriz);
                        break;
                     case 5:
                        Continuar = 5;
                        break;
                    default:
                        throw new AssertionError();
                    
            }
            
            
        } while (Continuar != 5);
        
        
    
    }
    
    public static void obtenerNumFactorial() {
        System.out.println("Hola aqui es el numero factorial\n");
        
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        
        int numeroFactorial = numero;
        
        for (int i = 1; i < numero; i++) {
            
             numeroFactorial = numeroFactorial * (numero - i);
             
        }
        
        System.out.println( "El numero factorial de " + numero + " es " + numeroFactorial);
       
    }
    
    public static void obtenerNumPrimos() {
        
        System.out.println("\nHola aqui es se obtienen numeros primos\n");
         
        int cont = 0, indiceArray = 0, rangoNumerosPrimos = 10;
        
        int[] NumPrimos = new int[rangoNumerosPrimos];
        
        for (int i = 2; indiceArray < rangoNumerosPrimos; i++) {
            
                for (int j = 1; j <= 100; j++) {

                    if (i % j == 0) {
                        cont++;
                    }
                    
                }
            if (cont == 2 ) {
                NumPrimos[indiceArray] = i;
                indiceArray++;
            }
            
            cont = 0;
        }
        
        for (int i = 0; i < NumPrimos.length; i++) {
            System.out.print(NumPrimos[i] + " ");
        }
    }
    
    public static void obtenerMatrizNumAzar(int[][] matriz) {
        System.out.println("Hola aqui es matriz");
        
      for (int i = 0; i <  matriz[i].length; i++) {
            System.out.println("\n");
            for (int j = 0; j <  matriz[j].length; j++) {
                int valorDado = (int) Math.floor(Math.random() * 199 + 2);
                matriz[i][j] = valorDado;
                if (matriz[i][j] > 100) {
                    System.out.print(matriz[i][j] + " ");
                } else if(matriz[i][j] < 10) {
                    System.out.print( "  " + matriz[i][j] + " ");
                } else {
                    System.out.print( " " + matriz[i][j] + " ");
                }
            }
        }
    
        System.out.println("\n");
    }
    
    public static void obtenerNumMayorMatriz(int[][] matriz) {
        
        int numMayor = 0;
        
        for (int i = 0; i < matriz[i].length; i++) {
            for (int j = 0; j < matriz[j].length; j++) {
                
                    if (matriz[i][j] > numMayor) {
                        numMayor = matriz[i][j];
                    }
                    
                    
                
            }
        }
        
        if (matriz[0][0] == 0) {
                    
            System.out.println("\nDebes llenar primero la matriz");
        }
        else{
            System.out.println("\n  El numero mayor de la matriz es " + numMayor);
        }
                
        
        
    }
}
