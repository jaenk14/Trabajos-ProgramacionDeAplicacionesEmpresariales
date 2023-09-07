/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package portafolio_3_jaencarlo;

/**
 *
 * @author XPC
 */
public class NumerosRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int cont = 0;
        
        int[] arrayNumeros = new int[15];
        
        do {
            int num = obtenerNumero();
            
            if (!verificarNumero(arrayNumeros, num)) {
                arrayNumeros[cont] = num;
                cont++;
            }
            
        } while (cont < arrayNumeros.length);
        
        for (int i : arrayNumeros) {
            
            System.out.printf( i + " ");
        }
    }
    
    public static boolean  verificarNumero(int[] arrayNum, int num) {
        
        for (int i = 0; i < arrayNum.length; i++) {
            if (arrayNum[i] == num) {
                 return true;
            }
            
        }
       return false;
    }
    
    public static int obtenerNumero() {
      int numAleatorio = (int)Math.floor(Math.random()* 19+1);
      return numAleatorio;
    }
}
