package run;

import models.Student;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Sesión 2, Miercoles 27 de agosto");

        //variables primitivas
        int numero = 0;
        int Numero = 1;
        int numer0 = 3;
        System.out.println(""+numero);
        System.out.println(""+Numero);
        System.out.println(""+numer0);
        float salario = 25000.00f;
        System.out.println(""+salario);
        double promedio = salario * 0.5;
        System.out.println(""+promedio);
        String carrera = "Ingieneria en sistemas de informacion";
        System.out.println(carrera);
        System.out.printf("%s", carrera);
        JOptionPane.showMessageDialog(null,carrera);

        Student student = new Student("Jose","Duran", "Administracion",99);
}