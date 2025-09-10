import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Instancia de calculadora
        Calculadora calculadora = new Calculadora();
        Scanner scan = new Scanner(System.in);
        // Variables
        int opcion = 0;

        do{
            System.out.println("---------------OPCIONES-------------------");
            System.out.println("1. Calcular area del circulo");
            System.out.println("2. Calcular area del triangulo");
            System.out.println("3. Calcular area del rectangulo");
            System.out.println("4. Calcular area del cuadrado");
            System.out.println("5. Calcular promedio");
            System.out.println("6. Calcular raiz cuadrada");
            System.out.println("7. Salir del programa");
            System.out.println("------------------------------------------");
            System.out.println("Escoja una opcion:");
            opcion = scan.nextInt();

            switch(opcion){
                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    break;
                default:
            }

        }while(opcion != 0);
    }
}
