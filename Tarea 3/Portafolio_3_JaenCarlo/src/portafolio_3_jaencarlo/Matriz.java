/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package portafolio_3_jaencarlo;
import java.util.Scanner;
/**
 *
 * @author Jaen Carlo 
 * @Date 06/09/2023
 */
public class Matriz {

    public static Scanner teclado = new Scanner(System.in);
    
    public static int [][] matriz; public static int controlFlujo = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int opc;
        
        do {            
             opc = mostrarMenu();
             
             switch (opc) {
                case 1:
                       iniciarMatriz();
                       controlFlujo = 1;
                    break;
                    
                    case 2:
                        if (controlFlujo == 0) {
                            System.out.println("Debes llenar la matriz primero");  
                        }
                        else{
                            mostrarMatriz();
                        }
                    break;
                    
                    case 3:
                        if (controlFlujo == 0) {
                            System.out.println("Debes llenar la matriz primero");  
                        }
                        else{
                            sumarFila();
                        }
                    break;
                    
                    case 4:
                        if (controlFlujo == 0) {
                            System.out.println("Debes llenar la matriz primero");  
                        }
                        else{
                            sumarColumna();
                        }
                    break;
                    
                    case 5:
                        if (controlFlujo == 0) {
                            System.out.println("Debes llenar la matriz primero");  
                        }
                        else{
                            sumarDiagonalPrincipal();
                        }
                    break;
                    
                    case 6:
                        if (controlFlujo == 0) {
                            System.out.println("Debes llenar la matriz primero");  
                        }
                        else{
                           sumarDiagonalInversa();
                        }
                    break;
                    
                    case 7:
                        if (controlFlujo == 0) {
                            System.out.println("Debes llenar la matriz primero");  
                        }
                        else{
                            obtenerPromedio();
                        }
                    break;
                    
                    case 8:
                        System.out.println("Adios");
                        break;
                    
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (opc != 8);
    }
    
    
    public static int mostrarMenu() {
        
        
        
        System.out.printf(  "\n1) Llenar la matriz con números aleatorios entre 1 y 200.\n" +
                            "2) Mostrar la matriz \n" +
                            "3) Sumar una fila indicada por el usuario\n" +
                            "4) Sumar una columna indicada por el usuario\n" +
                            "5) Sumar la diagonal principal\n" +
                            "6) Sumar la diagonal inversa\n" +
                            "7) El promedio de los valores de la matriz\n" +
                            "8) Salir\n" +
                            "Elije la opcion: " ); int opc = teclado.nextInt();
                            
                            System.out.println("");
        return opc;
    }
    
    public static void iniciarMatriz() {
        System.out.println("Cuantas filas quieres?");
        int filas = teclado.nextInt();
        
        System.out.println("\nCuantas columnas quieres?");
        int columnas = teclado.nextInt();
        
        matriz = new int[filas][columnas];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int numAleatorio = (int)Math.floor(Math.random()* 199+1);
                matriz[i][j] = numAleatorio;
            }
        }
    }
    
    public static void mostrarMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println(); // Agregar una línea en blanco después de cada fila
    }
         
         System.out.println("");
    }
    
    
    public static void sumarFila() {
        
        int cantidadFilas = matriz.length, filaUsuario = 0, sum = 0;
        System.out.println("\nLa cantidad de filas es de " + cantidadFilas);
        
        System.out.printf("Ingrese la fila:"); filaUsuario = teclado.nextInt();
        
        if (filaUsuario <= cantidadFilas && filaUsuario > 0) {
            
            for (int i = 0; i < matriz[0].length; i++) {
                sum =+  matriz[filaUsuario - 1][i];
            }
            
            System.out.println("\nLa suma de la fila es " + sum);
        }
        else {
            System.out.println("\nIngrese una fila valida..!!");
        }
        
    }
    
     public static void sumarColumna() {
         int cantidadColumnas = matriz[0].length, columnaUsuario = 0, sum = 0;
        System.out.println("\nLa cantidad de columas es de " + cantidadColumnas);
        
        System.out.printf("Ingrese la fila:"); columnaUsuario = teclado.nextInt();
        
        if (columnaUsuario <= cantidadColumnas && columnaUsuario > 0) {
            
            for (int i = 0; i < matriz.length; i++) {
                sum =+  matriz[i][columnaUsuario - 1];
            }
            
            System.out.println("\nLa suma de la columna es " + sum);
        }
        else {
            System.out.println("\nIngrese una columna valida..!!");
        }
   } 
     
     public static void sumarDiagonalPrincipal() {
        
         int sum = 0;
         
         if (matriz.length == matriz[0].length) {
             
            for (int i = 0; i < matriz.length; i++) {
             
            sum += matriz[i][i];
            
            }

         System.out.println("La suma de la diagonal principal es " + sum);
         }
         else{
             
             System.out.println("La matriz no es cuadrada; No se puede calcular");
         }
    
    }
     
     public static void sumarDiagonalInversa() {
        int sum = 0, index = 0;
         
          for (int i = 0 ; i < matriz.length; i++) {
             
                 index = (matriz[0].length - 1) - i;
                    
                 sum += matriz[i][index];
                 
                 if (index == 0) {
                  break;
              }
             
         }
         
         System.out.println("La suma de la diagonal inversa es " + sum);
    }
       
     public static void obtenerPromedio() {
         
         double promedio = 0;
         int cantidadNumeros = matriz.length * matriz[0].length, sum = 0;
         
         for (int i = 0; i < matriz.length; i++) {
             for (int j = 0; j < matriz[i].length; j++) {
                 sum += matriz[i][j];
             }
         }
         
         promedio = sum / cantidadNumeros;
         
                 
         System.out.println("\nEl promedio es " + promedio);
    }
}
