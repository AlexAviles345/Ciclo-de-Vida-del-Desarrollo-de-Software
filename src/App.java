import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Instancia de calculadora
        Calculadora calculadora = new Calculadora();
        Scanner scan = new Scanner(System.in);
        // Variables
        int opcion = 0;

        do {
            System.out.println("---------------OPCIONES-------------------");
            System.out.println("1. Calcular area del circulo");
            System.out.println("2. Calcular area del triangulo");
            System.out.println("3. Calcular area del rectangulo");
            System.out.println("4. Calcular area del cuadrado");
            System.out.println("5. Calcular promedio");
            System.out.println("6. Calcular raiz cuadrada");
            System.out.println("------------------------------------------");
            System.out.println("Escoja una opcion:");
            opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    double side = 0;
                    System.out.println("Ingrese el valor de los lados del cuadrado:");
                    side = scan.nextDouble();
                    while (side == 0) {
                        System.out.println("Ingresa una cantidad mayor a 0");
                        side = scan.nextDouble();
                    }
                    System.out.println("Calculando...");
                    Thread.sleep(2000);
                    System.out.println("El resultado es: " + Calculadora.calcularAreaCuadrado(side));
                    break;

                case 5:
                    int size = 0;
                    System.out.println("Ingresa la cantidad total de valores para calcular el promedio");
                    System.out.println("Por ejemplo, si quieres el promedio de 5 valores, ingresa el número 5");
                    size = scan.nextInt();
                    while (size == 0) {
                        System.out.println("Ingresa una cantidad mayor a 0");
                        size = scan.nextInt();
                    }
                    double[] valores = new double[size];
                    System.out.println("Ingresa los valores para obtener su promedio:");
                    for (int i = 0; i < valores.length; i++) {
                        valores[i] = scan.nextInt();
                    }
                    System.out.println("Calculando...");
                    Thread.sleep(2000);
                    System.out.println("El resultado es: " + Calculadora.calcularPromedio(valores));
                    break;

                case 6:
                    double root = 0;
                    System.out.println("Ingrese el valor para obtener su raíz cuadrada:");
                    root = scan.nextDouble();
                    while (root == 0) {
                        System.out.println("Ingresa una cantidad mayor a 0");
                        root = scan.nextDouble();
                    }
                    System.out.println("Calculando...");
                    Thread.sleep(2000);
                    System.out.println("El resultado es: " + Calculadora.calcularRaizCuadrada(root));
                    break;
                default:
            }
        } while (opcion != 0);
    }
}
