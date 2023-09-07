/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package portafolio_3_jaencarlo;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Jaen Carlo Gonzalez Arauz
 * @Date 05/09/2023
 */
public class Menu_Trabajadores {
    
   public static Scanner teclado = new Scanner(System.in);
   
    public static String nombre[];
    public static int edad[], cantPersonas = 0 ;
    public static double salarios[] ;
    
   
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int opc = 0;
        
       
        
       
        
        
        do {            
            System.out.println("\nElije una opción");
            opc = obtenerOpcion_MostrarMenu();
            
           
                switch (opc) {
                    case 1:
                        cantPersonas = obtenerCantidadTrabajadores();
                        nombre = new String[cantPersonas];
                        edad = new int[cantPersonas];
                        salarios = new double[cantPersonas];
                        break;
                    case 2:
                        if (cantPersonas == 0) {
                            System.out.println("Se debe ingresar la cantidad de personas primero");
                        }else{
                        introducirDatos(nombre,edad,salarios);
                        }
                        break;
                    case 3:
                        if (cantPersonas == 0) {
                            System.out.println("Se debe ingresar la cantidad de personas primero");
                        }else{
                           ordenarXnombre();
                        }
                        break;

                    case 4:
                        if (cantPersonas == 0) {
                            System.out.println("Se debe ingresar la cantidad de personas primero");
                        }else{
                            ordenarXedad();
                        }
                        break;
                    case 5:
                        if (cantPersonas == 0) {
                            System.out.println("Se debe ingresar la cantidad de personas primero");
                        }else{
                            ordenarXsalarios();
                        }
                        break;
                    case 6:
                        if (cantPersonas == 0) {
                            System.out.println("Se debe ingresar la cantidad de personas primero");
                        }else{
                            mostrarTrabajadores();
                        }
                        break;
                    case 7:
                            System.out.println("Adiós!!");
                        break;
                    default:
                        System.out.println("Opción Incorrecta");
                }
            
            
            
        } while (opc != 6);
    }
    
    
    public static int obtenerOpcion_MostrarMenu() {
        System.out.println("\n1)	Indicar la cantidad de trabajadores.\n" +
                           "2)	Introducir los datos de los trabajadores\n" +
                           "3)	Ordenar por nombre\n" +
                           "4)	Ordenar por edad\n" +
                           "5)	Ordenar por salario\n" +
                           "6)  Mostrar información de los empleados\n" +
                           "7)  Salir\n" );
        int opc = teclado.nextInt();
        return opc;
    }
    
    public static int obtenerCantidadTrabajadores() {
         System.out.println("Cuantos trabajadores desea ingresar?\n");
        int cantPersonas = teclado.nextInt();
        
        return cantPersonas;
    }
    
    public static void introducirDatos(String[] nombres, int[] edades, double[] salarios) {
        
        for (int i = 0; i < nombres.length; i++) {
            
            System.out.println("\n_______ Datos del trabajador #" + (i+1)+ " _______\n");
            System.out.println("Ingrese el nombre");
            String nombre = teclado.next();
            nombres[i] = nombre;
            
            System.out.println("\nIngrese la edad");
            int edad = teclado.nextInt();
            edades[i]= edad;
            
            System.out.println("\nIngrese el salario");
            double salario = teclado.nextDouble();
            salarios[i] = salario;
        }
    }
    
    public static void ordenarXnombre() {
        
        
        String [] nombresOrder = Arrays.copyOf(nombre, nombre.length);
        
        for (int i = 0; i < nombresOrder.length; i++) {
        // Aquí "y" se detiene antes de llegar
        // a length - 1 porque dentro del for, accedemos
        // al siguiente elemento con el índice actual + 1
            for (int j = 0; j < nombresOrder.length && i != j ; j++) {

                if ( nombresOrder[i].compareToIgnoreCase(nombresOrder[j]) < 0) { // ordenamiento burbuja
                    // Intercambiar
                   //variable auxiliar para guardar el valor de i
                   String aux = nombresOrder[i];
                   //cambio de posiciones
                   nombresOrder[i] = nombresOrder[j];
                   nombresOrder[j] = aux;

                }
            }
        }   
        
        System.out.println("\nNombres en desorden");
        for(String i : nombre ){
            System.out.print(i + " ");
        }
        
        System.out.println("\nNombres orden");
        for(String i : nombresOrder){
            System.out.print(i + " ");
        } 
    }
    
    public static void ordenarXedad() {
        
     int[] edadesOrder = Arrays.copyOf(edad, edad.length);
        
        for (int i = 0; i < edadesOrder.length - 1; i++)// ordenar por seleccion
        {
            int index = i;
            // Buscamos el indice mas bajo
            for (int j = i + 1; j < edadesOrder.length; j++){
                if (edadesOrder[j] < edadesOrder[index]){
                    index = j;
                }
            }
            int smallerNumber = edadesOrder[index];
            edadesOrder[index] = edadesOrder[i];
            edadesOrder[i] = smallerNumber;
        }
        
        System.out.println("\nEdades en desorden");
        for(int i : edad ){
            System.out.print(i + " ");
        }
        
        System.out.println("\nEdades ordenadas");
        for(int i : edadesOrder ){
            System.out.print(i + " ");
        } 
  
    }
    
    public static void ordenarXsalarios() {
        
        double[] salariosOrden = Arrays.copyOf(salarios, salarios.length);
        
         int n = salariosOrden.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                double temp = salariosOrden[i];
                int j;
                for (j = i; j >= gap && salariosOrden[j - gap] > temp; j -= gap) {
                    salariosOrden[j] = salariosOrden[j - gap];
                }
                salariosOrden[j] = temp;
            }
        }
        
        
        System.out.println("\nSalarios en desorden");
        for(double i : salarios ){
            System.out.print("$" + i + " ");
        }
        
        System.out.println("\nSalarios ordenados");
        for(double i : salariosOrden ){
            System.out.print("$" + i + " ");
        } 
    }
    
    public static void mostrarTrabajadores() {
        
        
        for (int i = 0; i < nombre.length; i++) {
        String nombres = nombre[i];
        int edades = edad[i];
        double salario = salarios[i];
        
        // Utilizamos tabuladores (\t) para alinear los datos
        System.out.printf("___ Trabajador #" + (i+1) + " ___\n"
                        + "Nombre: " + nombres + "\n"
                        + "Edad: " + edades + "\n"
                        + "Salario: " + salario + "\n"); 
        }
    }
}
