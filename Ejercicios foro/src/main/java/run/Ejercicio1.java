package run;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== MENÚ PRINCIPAL ===");
            System.out.println("1. CuentaBancaria");
            System.out.println("2. Libro");
            System.out.println("3. Coche");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    menuCuentaBancaria(sc);
                    break;
                case 2:
                    probarLibro();
                    break;
                case 3:
                    probarCoche();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
            }
            System.out.println();
        } while (opcion != 0);

        sc.close();
    }

    private static void probarCoche() {

        Coche coche = new Coche("Toyota", "Yaris",2001);
        coche.mostrarDatos();
    }
    private static void probarLibro() {

        Libro libro = new Libro("Harry Potter y la piedra filosofal", "J. K. ROWLING",288);
        System.out.println(libro.mostrarDescripcion());
    }
    private static void menuCuentaBancaria(Scanner sc) {
        CuentaBancaria cuenta = new CuentaBancaria("Juan Pérez", 1000);
        int opcion;

        do {
            System.out.println("\n--- MENÚ CUENTA BANCARIA ---");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Mostrar saldo");
            System.out.println("0. Volver al menú principal");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese cantidad a depositar: ");
                    double deposito = sc.nextDouble();
                    cuenta.depositar(deposito);
                    break;
                case 2:
                    System.out.print("Ingrese cantidad a retirar: ");
                    double retiro = sc.nextDouble();
                    cuenta.retirar(retiro);
                    break;
                case 3:
                    cuenta.mostrarInfo();
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }
}


