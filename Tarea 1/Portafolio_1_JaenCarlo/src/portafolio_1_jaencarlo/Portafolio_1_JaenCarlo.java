/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package portafolio_1_jaencarlo;

/**
 *
 * @author XPC
 */
/*
Nombres: Jaen Carlo Gonzalez Arauz y Derick Gutierrez
Fecha: 01/09/2023
*/

import javax.swing.JOptionPane;
public class Portafolio_1_JaenCarlo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numAleatorio = obtenerNumero();
        
        final double PI = 3.14159265359; // Esta es una constante lo cual al cambiarla 
        //en el codigo el interpretador del codigo da error y no deja ejecutar correctamente. 
        

        
        System.out.println("Adivine el numero del 1 al 100!!!\n");
       
        boolean numeroAdivinado = false; // Esta variable booleana se tiene que inicializar siempre
        
        while (!numeroAdivinado) { // este ciclo se hara mientras esta variable este en false
          String numeroUsuario =JOptionPane.showInputDialog("Escriba el numero");
            int numeroUsuarioInt = Integer.parseInt(numeroUsuario);
            
            
            if (numeroUsuarioInt == 0) { // este if verifica que el usuario no ingreso un cero osea dato incorrecto
                System.out.println("Dato invalido, ingreselo nuevamento\n");
            }
            else{
                if (numeroUsuarioInt < numAleatorio) { // se verifica que el numero sea mayor

                    System.out.println("El numero es mayor!!!\n");
                }
                else if (numeroUsuarioInt > numAleatorio) { // se verifica que el numero sea menor

                    System.out.println("El numero es menor!!!\n");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Adivinaste!!!");
                    numeroAdivinado = true; // se cambia la variable booleana para que se salga del 
                    //ciclo, es decir se adivino el numero.
                }
            }
               
        }
        
         for (TipoCarro miCarro : TipoCarro.values()) {  // esto es un for-each que recorre el enum
              System.out.println("Mi carro es un: " + miCarro);
            }

        System.out.println("\n");
     // Parte 2 tarea 
     
     /*PARTE 2: Cree un programa que realice lo siguiente:
a.	Tome un texto y utilice al menos 5 métodos de la clase String para obtener determinados resultados 
b.	Realice conversiones de tipo String a int y double
c.	Realice conversiones de tipos numéricos (int y double) a string
d.	Realice comparaciones y concatenaciones entre strings 
*/
       String texto = "La conservación del medio ambiente es fundamental "
               + "para garantizar un futuro sostenible. La deforestación y "
               + "la contaminación del aire y el agua amenazan la biodiversidad "
               + "y la salud humana. Es responsabilidad de todos reducir nuestro"
               + " consumo de recursos y adoptar prácticas ecoamigables. La reforestación "
               + "y el reciclaje son acciones concretas que pueden marcar la diferencia."
               + " Juntos, podemos preservar la belleza de nuestro planeta para las generaciones "
               + "futuras. ¡Cuidemos nuestro hogar, la Tierra!";
        
       
       System.out.println( "El texto es: " + texto + "\n");
       
       char Ejemplo1 = texto.charAt(numAleatorio);
        System.out.println( "Letra en la pocisión del numero adivinado " + Ejemplo1);
        
         String Ejemplo2 = texto.substring(numAleatorio, numAleatorio * 2);
        System.out.println( "Cadena de texto en el rango del numero adivinado hasta este mismo numero "
                + "multiplicado por 2: " + Ejemplo2);
        
        int Ejemplo3 = texto.length();
           System.out.println( "La cantidad de caracteres es de: " + Ejemplo3);
           
        String Ejemplo4 = texto.toUpperCase();
        System.out.println( "El texto en mayuscula: " + Ejemplo4);
        
        
        
        
        char[] charTexto = new char[texto.length()];
        
        for (int i = 0; i < texto.length(); i++) {
           
            char letra = texto.charAt(i);
              
            charTexto[i] = letra;
           
        }

        String Ejemplo5 =  new String(charTexto);
        System.out.println( "Arreglo de chars a string: " + Ejemplo5); 

        // Conversiones de String a int y double:
        String stringNumero = "42";
        int intNumero = Integer.parseInt(stringNumero);
        System.out.println("El valor en entero es: " + intNumero);
        
        
        String stringNumero2 = "3.14";
        double doubleNumero = Double.parseDouble(stringNumero2);
        System.out.println("El valor en double es: " + doubleNumero);
        
        
        
        //Conversiones de tipos numéricos (int y double) a String:
         int intNum = 42;
        String stringNum = Integer.toString(intNum);
        System.out.println("El valor en cadena es: " + stringNum);
        
        double doubleNum = 3.14;
        String stringNum2 = Double.toString(doubleNum);
        System.out.println("El valor en cadena es: " + stringNum2);
        
        
        
        // Realice comparaciones y concatenaciones entre strings 
        
        
        // Ejemplo 1
        String otroTexto = "La conservación del medio ambiente es fundamental para garantizar un futuro sostenible.";
        if (texto.equals(otroTexto)) {
            System.out.println("Los dos textos son iguales.");
        } else {
            System.out.println("Los dos textos son diferentes.");
        }

        // Ejemplo 2
        String mensaje = "El mensaje es: " + texto;
        System.out.println(mensaje);
        
        
        System.out.println("\n");
        // Parte 3 
        
        /*5.	PARTE 3: Cree un programa que utilice:
a.	Al menos 5 métodos de la clase Math para realizar determinados cálculos, debe utilizar números random en algún proceso. 
b.	Tipos de datos int y double y realice conversiones de int a double
c.	Operadores aritméticos
d.	Operadores de asignación 
*/
        int numero1 = obtenerNumero();
        int numero2 = obtenerNumero();
 
        // Mostrar los números generados
        System.out.println("Número 1: " + numero1);
        System.out.println("Número 2: " + numero2);
 
        // Utilizar métodos de la clase Math
        double raizCuadradaNumero1 = Math.sqrt(numero1);
        double potenciaNumero2 = Math.pow(numero2, 2);
        double senoNumero1 = Math.sin(numero1);
        double cosenoNumero2 = Math.cos(numero2);
        double redondeoNumero1 = Math.round(raizCuadradaNumero1);
 
        // Realizar conversiones de int a double
        double numero1Double = (double) numero1;
 
        // Operaciones aritméticas
        double suma = numero1Double + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = numero1Double / numero2;
 
        // Operadores de asignación
        numero1 += 10;
        numero2 *= 2;
 
        // Mostrar resultados
        System.out.println("Raíz cuadrada de número 1: " + raizCuadradaNumero1);
        System.out.println("Número 2 elevado al cuadrado: " + potenciaNumero2);
        System.out.println("Seno de número 1: " + senoNumero1);
        System.out.println("Coseno de número 2: " + cosenoNumero2);
        System.out.println("Redondeo de raíz cuadrada de número 1: " + redondeoNumero1);
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Número 1 mas 10 utilizando el += : " + numero1);
        System.out.println("Número 2  por dos utilizando el *= : " + numero2);

            
    }
    
    enum TipoCarro { //nos permite asociar una serie de valores de tipo final, es decir que son constantes. ​
            SEDAN, SUV, DEPORTIVO, CAMIONETA
        }
    
    public static int obtenerNumero () { // Metodo que genera un numero random.
        int numAleatorio = (int)Math.floor(Math.random()*2+1);
        return  numAleatorio;
    }
}
