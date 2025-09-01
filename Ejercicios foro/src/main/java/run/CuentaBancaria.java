package run;

import java.util.Scanner;

public class CuentaBancaria {

     //Atributos de la cuenta bancaria
    String titular;
    double saldo;

    //Constructor


    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    //metodos para depositar o retirar
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso.");
        } else {
            System.out.println("Cantidad inválida.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso.");
        } else {
            System.out.println("Fondos insuficientes o cantidad inválida.");
        }
    }

    public void mostrarInfo() {
        System.out.println("Titular: " + titular + " | Saldo: $" + saldo);
    }
}

