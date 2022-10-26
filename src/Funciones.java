import java.sql.SQLOutput;
import java.util.Scanner;

public class Funciones {

    Scanner sc = new Scanner(System.in);
    private static final float PI = (float) 3.14;
    public void mostrarMenu(){
        System.out.println("Opcion: ");
    }
    public int introducirOpcion(){
        int opcion = sc.nextInt();
        return opcion;
    }
    public float introducirNumero(){
        float numero = sc.nextFloat();
        return numero;
    }
    public float calcularAreaCuadrado(float lado){
        float area = (float) Math.pow(lado,lado);
        return area;
    }
    public float calcularAreaTriangulo(float base, float altura){
        float area = base*altura;
        return area;
    }
    public float calcularAreaCirculo(float radio){
        float area = PI*2*radio;
        return area;
    }
    public void mostrarArea(float area){
        System.out.println("Area: " + area);
    }
    public void mostrarMensaje(){
        System.out.println("Opcion incorrecta");
    }

}
