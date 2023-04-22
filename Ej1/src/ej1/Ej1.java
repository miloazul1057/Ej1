package ej1;
import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {
        
        /*Determinar el área de un rectángulo que tiene por base “B” 
        y por altura “H”, imprima la base, la altura y su área */
                
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la medida de la base: ");
        double base = teclado.nextDouble();

        System.out.print("Ingrese la medida de la altura: ");
        double altura = teclado.nextDouble();

        double area = base * altura;

        System.out.println("El area del rectangulo es: " + area);
    }
    
}
