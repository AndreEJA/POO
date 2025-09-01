package run;

public class Estudiante {

    //Atributos de estudiante: Nombre, matricula y promedio

    String nombre;
    boolean matricula;
    double promedio;


    public Estudiante(String nombre, boolean matricula, double promedio) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.promedio = promedio;
    }

    public void calcularAprobado(){

        if (promedio >= 70) {
            System.out.println("El estudiante "+nombre+ " con estado de matricula '" +matricula+"' esta aprobado");
        }else {
            System.out.println("El estudiante "+nombre+ " con estado de matricula '" +matricula+"' no aprobo");
        }
    }
}
