package edu.ucaldas.poo.gradebook;
import java.util.Scanner; // program uses class Scanner

public class promedioNotas {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int total = 0;
        int contadorNotas = 1;


        while (contadorNotas <= 10) {
            System.out.print("Ingresa la nota: ");
            int nota = input.nextInt();
            total = total + nota;
            contadorNotas = contadorNotas + 1;
        }


        int promedio = total / 10;


        System.out.printf("%nEl total de las 10 notas son %d%n", total);
        System.out.printf("El promedio de la clase es %d%n", promedio);
    }
}
