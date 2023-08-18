
package wiiii;

import java.util.Scanner;


public class Wiiii {

 
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora - Funciones disponibles:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Seno");
        System.out.println("6. Coseno");
        System.out.println("7. Tangente");
        System.out.println("8. Raíz enésima");
        System.out.println("9. Potencia enésima");
        System.out.println("10. Calcular porcentaje");

        System.out.print("Selecciona una función (1-10): ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                realizarSuma(scanner);
                break;
            case 2:
                realizarResta(scanner);
                break;
            case 3:
                realizarMultiplicacion(scanner);
                break;
            case 4:
                realizarDivision(scanner);
                break;
            case 5:
                realizarSeno(scanner);
                break;
            case 6:
                realizarCoseno(scanner);
                break;
            case 7:
                realizarTangente(scanner);
                break;
            case 8:
                realizarRaizene(scanner);
                break;
            case 9:
                realizarPotencia(scanner);
                break;
            case 10:
                realizarPorcen(scanner);
                break;
            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }

   
    static void realizarSuma(Scanner scanner) {
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        double resultado = num1 + num2;
        System.out.println("Resultado de la suma: " + resultado);
    }
    static void realizarResta(Scanner scanner) {
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        double resultado = num1 - num2;
        System.out.println("Resultado de la resta: " + resultado);
    }
    static void realizarMultiplicacion(Scanner scanner) {
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        double resultado = num1*num2;
        System.out.println("Resultado de la multiplicacion: " + resultado);
    }
    static void realizarDivision(Scanner scanner) {
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        double resultado = num1/num2;
        System.out.println("Resultado de la division: " + resultado);
    }
    static void realizarSeno(Scanner scanner) {
        System.out.print("Ingrese el número: ");
        double num1 = scanner.nextDouble();
        double resultado = Math.sin(Math.toRadians(num1));
        System.out.println("Resultado del seno: " + resultado);
    }
    static void realizarCoseno(Scanner scanner) {
        System.out.print("Ingrese el número: ");
        double num1 = scanner.nextDouble();
        double resultado = Math.cos(Math.toRadians(num1));
        System.out.println("Resultado del coseno: " + resultado);
    }
    static void realizarTangente(Scanner scanner) {
        System.out.print("Ingrese el número: ");
        double num1 = scanner.nextDouble();
        double resultado = Math.tan(Math.toRadians(num1));
        System.out.println("Resultado del tangente: " + resultado);
    }
    static void realizarRaizene(Scanner scanner) {
        System.out.print("Ingrese el número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese la raiz: ");
        double num2 = scanner.nextDouble();
        double resultado = Math.pow(num1,1.0/num2);
        System.out.println("Resultado de la raiz: " + resultado);
    }
      static void realizarPotencia(Scanner scanner) {
        System.out.print("Ingrese el número base: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese la potencia: ");
        double num2 = scanner.nextDouble();
        double resultado = Math.pow(num1,num2);
        System.out.println("Resultado de la potencia: " + resultado);
    }
        static void realizarPorcen(Scanner scanner) {
        System.out.print("Ingrese el número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el porcentaje: ");
        double num2 = scanner.nextDouble();
        double resultado = num1*(num2/100);
        System.out.println("Resultado del porcentaje: " + resultado);
    }
}
    
    

