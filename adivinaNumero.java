import java.util.Scanner;
// import javax.swing.JOptionPane;
import java.util.Random;

public class adivinaNumero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // generamos un numero entero desde 0 a 100
        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(101);

        System.out.println("");

        System.out.println("¡Vamos a jugar! Tienes que adivinar un número entero entre 0 y 100 \n\nPrueba y dime un número");
        int intento = sc.nextInt();

        System.out.println("");




        sc.close();

    }
}

/*
        boolean z = random.nextBoolean();

        System.out.println(z);
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scanner.nextLine();

        */