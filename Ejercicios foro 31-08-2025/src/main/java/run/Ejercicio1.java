package run;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== MENÚ PRINCIPAL ===");
            System.out.println("1. Persona");
            System.out.println("2. Coche");
            System.out.println("3. Libro");
            System.out.println("4. Cuenta Bancaria");
            System.out.println("5. Estudiante");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    probarPersona();
                    break;
                case 2:
                    probarCoche();
                    break;
                case 3:
                    probarLibro();
                    break;
                case 4:
                    menuCuentaBancaria(sc);
                    break;
                case 5:
                    probarEstudiante();
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
    private static void probarEstudiante() {
        Estudiante estudiante = new Estudiante("Harry Enrique Bodan Navarro",true,89.50);
        estudiante.calcularAprobado();
    }
    private static void probarPersona() {

        //Crear un objeto de la clase persona
        Persona persona = new Persona();

        //Asignar valores a los atributos \
        persona.nombre = "Gabriela Lopez";
        persona.edad = 18;

        // Mostrar los datos de la persona
        System.out.println(persona.mostarDatos());
    }
}


