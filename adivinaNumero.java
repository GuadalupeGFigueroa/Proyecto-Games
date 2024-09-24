import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class adivinaNumero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

   // generamos un numero entero desde 0 a 100
   Random aleatorio = new Random();  //crea una instancia de la clase Random, que proporciona métodos para generar números aleatorios. La variable aleatorio es el objeto que utilizarás para acceder a estos métodos.
   int numero = aleatorio.nextInt(101);  //utiliza el método nextInt(int bound) del objeto aleatorio para generar un número entero aleatorio entre 0 (inclusive) y 101 (exclusivo), es decir, entre 0 y 100. El número generado se almacena en la variable numero
   int contador = 1;  // lo inicializamos en 1, por si lo acierta a la primera 
    

   JOptionPane.showMessageDialog(null,"¡Vamos a jugar! Tienes que adivinar un número entero entre 0 y 100");

   int intento = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un número (recuerda, entre 0 y 100)"));  // nos queda limitar la introducción a este rango

   while(intento>100 || intento<0) { //comprobamos si el valor esté dentro del rango
        JOptionPane.showMessageDialog(null, "Recuerda que los valores deben de estar entre 0 y 100.");
        intento = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un número (recuerda, entre 0 y 100)"));
       
   }    
     
    while(intento != numero) {
        if(intento < numero) {
            JOptionPane.showMessageDialog(null, "¡Lo siento! Te has quedado corto, inténtalo de nuevo con un número mayor. \nEste ha sido tu intento número " + contador);
            intento = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce otro número (recuerda, entre 0 y 100)"));
        }
            else {
                JOptionPane.showMessageDialog(null, "¡Lo siento! Te has pasado de largo, inténtalo de nuevo con un número menor. \nEste ha sido tu intento número " + contador);                JOptionPane.showMessageDialog(null,"¡Lo siento! Intenta con un número menor.");
                intento = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce otro número (recuerda, entre 0 y 100)"));
            }
        contador= contador +1;

        while(intento>100 || intento<0) { //comprobamos si el valor esté dentro del rango
            JOptionPane.showMessageDialog(null, "Recuerda que los valores deben de estar entre 0 y 100.");
            intento = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un número (recuerda, entre 0 y 100)"));

        }
    }
           
    JOptionPane.showMessageDialog(null, "¡Has acertado! El número aleatorio es: " + numero + "\nY lo has conseguido en tan solo " + contador + " intentos");
            
    sc.close();  
 


}
}

