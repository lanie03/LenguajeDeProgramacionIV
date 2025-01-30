//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Triangulo.LadoA = 4;
        Triangulo.LadoB = 4;
        Triangulo.LadoC = 4;

        double perimetro = Triangulo.perimetroTriangulo();
        System.out.print(perimetro);
    }
}