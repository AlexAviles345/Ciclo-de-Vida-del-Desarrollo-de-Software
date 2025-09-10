import Figuras.Circulo;
import Figuras.Triangulo;
import Figuras.Rectangulo;
import Figuras.Cuadrado;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("---------------OPCIONES-------------------");
            System.out.println("1. Calcular área del círculo");
            System.out.println("2. Calcular área del triángulo");
            System.out.println("3. Calcular área del rectángulo");
            System.out.println("4. Calcular área del cuadrado");
            System.out.println("5. Calcular promedio");
            System.out.println("6. Calcular raíz cuadrada");
            System.out.println("7. Salir del programa");
            System.out.println("------------------------------------------");
            System.out.print("Escoja una opción: ");
            opcion = scan.nextInt();

            switch (opcion) {
                case 1: // CÍRCULO
                    Circulo circulo = new Circulo();
                    System.out.print("Ingrese el radio del círculo: ");
                    double radio = scan.nextDouble();
                    while (radio <= 0) {
                        System.out.println("Ingresa un valor mayor a 0");
                        radio = scan.nextDouble();
                    }
                    circulo.setRadio(radio);
                    circulo.calcularAreaCirculo(circulo.getRadio());
                    System.out.println("Calculando...");
                    Thread.sleep(1000);
                    System.out.println("El área del círculo es: " + circulo.getArea());
                    break;

                case 2: // TRIÁNGULO
                    Triangulo triangulo = new Triangulo();
                    System.out.print("Ingrese la base del triángulo: ");
                    double base = scan.nextDouble();
                    System.out.print("Ingrese la altura del triángulo: ");
                    double altura = scan.nextDouble();
                    while (base <= 0 || altura <= 0) {
                        System.out.println("Los valores deben ser mayores a 0");
                        System.out.print("Base: ");
                        base = scan.nextDouble();
                        System.out.print("Altura: ");
                        altura = scan.nextDouble();
                    }
                    triangulo.setBase(base);
                    triangulo.setAltura(altura);
                    triangulo.calcularAreaTriangulo(triangulo.getBase(), triangulo.getAltura());
                    System.out.println("Calculando...");
                    Thread.sleep(1000);
                    System.out.println("El área del triángulo es: " + triangulo.getArea());
                    break;

                case 3: // RECTÁNGULO
                    Rectangulo rectangulo = new Rectangulo();
                    System.out.print("Ingrese la base del rectángulo: ");
                    double baseR = scan.nextDouble();
                    System.out.print("Ingrese la altura del rectángulo: ");
                    double alturaR = scan.nextDouble();
                    while (baseR <= 0 || alturaR <= 0) {
                        System.out.println("Los valores deben ser mayores a 0");
                        System.out.print("Base: ");
                        baseR = scan.nextDouble();
                        System.out.print("Altura: ");
                        alturaR = scan.nextDouble();
                    }
                    rectangulo.setBase(baseR);
                    rectangulo.setAltura(alturaR);
                    rectangulo.calcularAreaRectangulo(rectangulo.getBase(), rectangulo.getAltura());
                    System.out.println("Calculando...");
                    Thread.sleep(1000);
                    System.out.println("El área del rectángulo es: " + rectangulo.getArea());
                    break;

                case 4: // CUADRADO
                    Cuadrado cuadrado = new Cuadrado();
                    System.out.print("Ingrese el valor del lado del cuadrado: ");
                    double lado = scan.nextDouble();
                    while (lado <= 0) {
                        System.out.println("Ingresa un valor mayor a 0");
                        lado = scan.nextDouble();
                    }
                    cuadrado.setLado(lado);
                    cuadrado.calcularAreaCuadrado(cuadrado.getLado());
                    System.out.println("Calculando...");
                    Thread.sleep(1000);
                    System.out.println("El área del cuadrado es: " + cuadrado.getArea());
                    break;

                case 5: // PROMEDIO
                    System.out.print("Ingresa la cantidad de valores para el promedio: ");
                    int size = scan.nextInt();
                    while (size <= 0) {
                        System.out.println("Debe ser mayor a 0");
                        size = scan.nextInt();
                    }
                    double[] valores = new double[size];
                    System.out.println("Ingresa los valores:");
                    for (int i = 0; i < size; i++) {
                        System.out.print("Valor " + (i + 1) + ": ");
                        valores[i] = scan.nextDouble();
                    }
                    System.out.println("Calculando...");
                    Thread.sleep(1000);
                    System.out.println("El promedio es: " + Calculadora.calcularPromedio(valores));
                    break;

                case 6: // RAÍZ CUADRADA
                    System.out.print("Ingresa un valor para la raíz cuadrada: ");
                    double root = scan.nextDouble();
                    while (root <= 0) {
                        System.out.println("Debe ser mayor a 0");
                        root = scan.nextDouble();
                    }
                    System.out.println("Calculando...");
                    Thread.sleep(1000);
                    System.out.println("La raíz cuadrada es: " + Calculadora.calcularRaizCuadrada(root));
                    break;

                case 7:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 7);

        scan.close();
    }
}

