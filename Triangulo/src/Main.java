import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Ingresa el valor agregado para el lado A:  ");
        Triangulo.LadoA = sc.nextDouble();
        System.out.printf("Ingresa el valor agregado para el lado B:  ");
        Triangulo.LadoB = sc.nextDouble();
        System.out.printf("Ingresa el valor agregado para el lado C:  ");
        Triangulo.LadoC = sc.nextDouble();

        System.out.print(Triangulo.perimetroTriangulo());
    }
}