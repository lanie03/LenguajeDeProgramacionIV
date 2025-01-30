public class Triangulo {
    public static double perimetro;
    public static double LadoA;
    public static double LadoB;
    public static double LadoC;

    public static double perimetroTriangulo(){
        return perimetro + LadoA + LadoB + LadoC;

    }
    public static double perimetroTriangulo(double _LadoA, double _LadoB, double _LadoC){
        LadoA = _LadoA;
        LadoB = _LadoB;
        LadoC = _LadoC;

        return perimetro + LadoA + LadoB + LadoC;

    }
}
