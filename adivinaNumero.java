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
    
    // boolean continua;  // para reiniciar el juego o no

    // int entero; // para saber si es un número entero y no una letra


// AQUI EMPIEZA EL PROGRAMA Y AQUÍ TENDRÍA QUE VOLVER CUANDO DIGA QUE SÍ QUIERE VOLVER A JUGAR -----------------------
    JOptionPane.showMessageDialog(null,"¡Vamos a jugar! Tienes que adivinar un número entero entre 0 y 100");

    int intento = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un número (recuerda, entre 0 y 100)"));

    while(intento>100 || intento<0) { //comprobamos si el valor es entero (que no sean letras) y esté dentro del rango
        JOptionPane.showMessageDialog(null, "Recuerda que los valores deben de estar entre 0 y 100.");
        intento = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un número (recuerda, entre 0 y 100)"));
    }

    while(intento != numero) {
        if (intento < numero) {
            JOptionPane.showMessageDialog(null, "¡Lo siento! Te has quedado corto, inténtalo de nuevo con un número mayor. \nEste ha sido tu intento número " + contador);
            intento = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce otro número (recuerda, entre 0 y 100)"));
        }
            else {
                JOptionPane.showMessageDialog(null, "¡Lo siento! Te has pasado de largo, inténtalo de nuevo con un número menor. \nEste ha sido tu intento número " + contador);
                intento = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce otro número (recuerda, entre 0 y 100)"));
            }
        contador= contador +1;

        while(intento>100 || intento<0) { //comprobamos si el valor esté dentro del rango
            JOptionPane.showMessageDialog(null, "Recuerda que los valores deben de estar entre 0 y 100.");
            intento = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un número (recuerda, entre 0 y 100)"));

        }
    }

    
    // aquí debajo, indica que ha acertado y le pregunta si quiere continuar, eligiendo entre 2 opciones
    JOptionPane.showMessageDialog(null, "¡Has acertado! El número aleatorio es: " + numero + "\nY lo has conseguido en tan solo " + contador + " intentos");

    Object[] opciones = {"Sí", "No"};
    int respuesta = JOptionPane.showOptionDialog(null, "¿Quieres volver a jugar?", "Pregunta", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
    
    while (intento == numero && respuesta == 0) {  //hace el bucle si el número es acertado y si respondió que sí a seguir jugando
        if (respuesta == 0) {
            JOptionPane.showMessageDialog(null, "¡Bien, vamos allá! Tienes que adivinar de nuevo un número entero entre 0 y 100");
            aleatorio = new Random();  // VOLVEMOS A GENERAR OTRO NUMERO RANDOM
            numero = aleatorio.nextInt(101); 
            contador = 1;
            intento = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un número (recuerda, entre 0 y 100)"));

            while(intento>100 || intento<0) { //comprobamos si el valor es entero (que no sean letras) y esté dentro del rango
                JOptionPane.showMessageDialog(null, "Recuerda que los valores deben de estar entre 0 y 100.");
                intento = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un número (recuerda, entre 0 y 100)"));
            }

            while(intento != numero) {
                if(intento < numero) {
                    JOptionPane.showMessageDialog(null, "¡Lo siento! Te has quedado corto, inténtalo de nuevo con un número mayor. \nEste ha sido tu intento número " + contador);
                    intento = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce otro número (recuerda, entre 0 y 100)"));
                }
                    else {
                        JOptionPane.showMessageDialog(null, "¡Lo siento! Te has pasado de largo, inténtalo de nuevo con un número menor. \nEste ha sido tu intento número " + contador);
                        intento = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce otro número (recuerda, entre 0 y 100)"));
                    }
                contador= contador +1;

                while(intento>100 || intento<0) { //comprobamos si el valor esté dentro del rango
                    JOptionPane.showMessageDialog(null, "Recuerda que los valores deben de estar entre 0 y 100.");
                    intento = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un número (recuerda, entre 0 y 100)"));

                }
            }
                JOptionPane.showMessageDialog(null, "¡Has acertado! El número aleatorio es: " + numero + "\nY lo has conseguido en tan solo " + contador + " intentos");
                
                respuesta = JOptionPane.showOptionDialog(null, "¿Quieres volver a jugar?", "Pregunta", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
        }

        else {
        }
        
    JOptionPane.showMessageDialog(null, "¡De acuerdo! Gracias por participar.");
    }





    sc.close();

}
}

// OJO PROBAR A QUITAR EL IF...ELSE DE DESPUES DE RESPONDER SI A SEGUIR JUGANDO