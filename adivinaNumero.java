import java.util.Random;
import javax.swing.JOptionPane;
public class AdivinaNumero {
    public static void main(String[] args) {
        // PASO 0. meter número RANDMON e inicilizar variables y contadores
            // generamos un numero entero desde 0 a 100, que se almacena en "numero"
        Random aleatorio = new Random();  //crea una instancia de la clase Random, para generar números aleatorios
        int numero = aleatorio.nextInt(101);  //genera un número entero aleatorio entre 0 (inclusive) y 101 (exclusivo) y lo almacena en la variable numero
        // contador de intentos del usuario, lo inicializamos en 1, para que cuente el intento si lo acierta a la primera
        int contador = 1;
            // 0 = sí, 1 = no
        int respuesta = 0;
            // es un contador para ayudarme a seguir el código, es borrable al final *****
        // int i = 1;
        boolean arriba = true;  // si reponde sí a seguir, sigue haciendo el bucle
        // PASO 1. BUCLE PRINCIPAL, mientras la respuesta a seguir jugando sea sí, seguimos en este bucle
        while (respuesta == 0 || arriba == true) {
            // PASO 2. USUARIO INTRODUCE NUMERO
            String consola = JOptionPane.showInputDialog(null,"¡Vamos a jugar! Tienes que adivinar un número entero entre 0 y 100 \n\nIntroduce un número entero");
            // PASO 3 y 4. COMPROBAMOS VALIDEZ DEL NUMERO INTRODUCIDO
            try {
                    //sigue adelante si el número es entero, sino se va al catch
                int intento = Integer.parseInt(consola);
                    // se sale al acertar, al inicio comprobamos si está en rango y si quiere seguir jugando (una vez acertado)
                while (intento <= 100 && intento >= 0 && respuesta == 0 && intento != numero) {
                       // PASO 5. COMPROBAMOS SI ES MENOR QUE EL RANDOM
                    if (intento < numero) {
                        JOptionPane.showMessageDialog(null, "¡Lo siento! Te has quedado corto, inténtalo de nuevo con un número mayor. \nEste ha sido tu intento número " + contador);
                        intento = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce otro número (recuerda, entre 0 y 100)"));
                    }
                    else {  // PASO 6. SINO, ES QUE ES MAYOR
                        JOptionPane.showMessageDialog(null, "¡Lo siento! Te has pasado de largo, inténtalo de nuevo con un número menor. \nEste ha sido tu intento número " + contador);
                        intento = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce otro número (recuerda, entre 0 y 100)"));
                    }
                    contador= contador +1;
                }
                    // está fuera del while, pq ha acertado o pq está fuera de rango, hay que comprobarlo!
                if (intento == numero) {
                        // si ha acertado, lo informa y pregunta si quiere continuar, eligiendo entre 2 opciones
                    JOptionPane.showMessageDialog(null, "¡Has acertado! El número aleatorio es: " + numero + "\nY lo has conseguido en tan solo " + contador + " intentos");
                    contador = +1;  // reinicia el contador para volver a empezar, se pone a 0, pq aquí abajo le suma 1
                        // pregunta si quiere seguir y dependiendo de la respuesta, vuelve arriba o sale del bucle
                    Object[] opciones = {"Sí", "No"};
                    respuesta = JOptionPane.showOptionDialog(null, "¿Quieres volver a jugar?", "Pregunta", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
                    if (respuesta == 0) {
                        arriba = true;  // SI = vuelve arriba
                    }
                    else {
                        arriba = false;  // NO = se sale del bucle
                    }
                }
                else {  // si no ha acertado, significa que está fuera de rango, así que informa y pide nuevo número
                    JOptionPane.showMessageDialog(null, "Recuerda que los valores deben de estar entre 0 y 100. \nEste ha sido tu intento número " + contador);
                    // intento = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un número (recuerda, entre 0 y 100)"));
                    contador= contador +1;
                    arriba = true; // para volver arriba
                }
            } catch (NumberFormatException e) { //si está aquí es pq el número no es entero
                    // se informa de ello y se pregunta si quiere volver a jugar
                JOptionPane.showMessageDialog(null, "¡¡ No me engañas !! ¡ Ese no es un número entero ! \nEste ha sido tu intento número " + contador);
                //contador = contador +1; **************** no sé pq pero si lo uso, me suma de dos en dos cuando no son enteros ********
                contador= contador +1;
                arriba = true;
            }
        } // salida del primer bucle
            // si dice que no quiere seguir....
        JOptionPane.showMessageDialog(null, "¡De acuerdo! Gracias por participar");
    }
}




