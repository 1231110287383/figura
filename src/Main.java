import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    String color;
    double lado;

    Scanner x = new Scanner(System.in);
        System.out.println("ingrese el color del cuadrado:  ");
        color = x.next();
        System.out.println("ingrese el lado del cuadrado:  ");
        lado = x.nextDouble();

        cuadrado c1=new cuadrado(color,lado);
        System.out.println("El Area del Cuadrado 1 es: "+c1.calcularArea());
        System.out.println("El Color del Cuadrado 1 es: "+c1.getColor());
        cuadrado c2=new cuadrado("Azul",2.3);
        System.out.println("El Area del Cuadrado 2 es: "+c2.calcularArea());
        System.out.println("El Color del Cuadrado 2 es: "+c2.getColor());
        triangulo t1 = new triangulo("verde", 3, 4);
        System.out.println("El Area del triangulo 1 es: "+t1.calcularArea());
        System.out.println("El Color del triangulo 1 es: "+t1.getColor());
    }
}
