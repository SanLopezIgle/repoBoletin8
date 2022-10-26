public class Main {

    private static final int CUADRADO = 1;
    private static final int TRIANGULO = 2;
    private static final int CIRCULO = 3;

    public static void main(String[] args) {

        float area, lado, base, altura, radio;

        Funciones misFunciones = new Funciones();
        misFunciones.mostrarMenu();

        int opcion = misFunciones.introducirOpcion();

        switch (opcion){
            case CUADRADO:
                lado = misFunciones.introducirNumero();
                area = misFunciones.calcularAreaCuadrado(lado);
                misFunciones.mostrarArea(area);
                break;
            case TRIANGULO:
                base = misFunciones.introducirNumero();
                altura = misFunciones.introducirNumero();
                area = misFunciones.calcularAreaTriangulo(base, altura);
                misFunciones.mostrarArea(area);
                break;
            case CIRCULO:
                radio = misFunciones.introducirNumero();
                area = misFunciones.calcularAreaCirculo(radio);
                misFunciones.mostrarArea(area);
                break;
            default:
                misFunciones.mostrarMensaje();
                break;
        }

    }
}